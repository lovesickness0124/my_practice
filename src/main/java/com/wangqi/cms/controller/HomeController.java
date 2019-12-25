package com.wangqi.cms.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.bawei.utils.CookieUtils;
import com.bawei.utils.FileUtils;
import com.bawei.utils.MD5Util;
import com.bawei.utils.MD5Utils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wangqi.cms.domain.Article;
import com.wangqi.cms.domain.Category;
import com.wangqi.cms.domain.Channel;
import com.wangqi.cms.domain.Inform;
import com.wangqi.cms.domain.Settings;
import com.wangqi.cms.domain.Slide;
import com.wangqi.cms.domain.User;
import com.wangqi.cms.service.ArticleService;
import com.wangqi.cms.service.CategoryService;
import com.wangqi.cms.service.ChannelService;
import com.wangqi.cms.service.SettingsService;
import com.wangqi.cms.service.SlideService;
import com.wangqi.cms.service.UserService;

/**
 * author：王琪 email：2529970816@qq.com Tel/Vx：18295704953
 * 
 * @Date 2019年12月11日
 */
@Controller
public class HomeController {

	@Resource
	private ArticleService articleService;
	@Resource
	private SlideService slideService;
	@Resource
	private ChannelService channelService;
	@Resource
	private UserService userService;
	@Resource
	private CategoryService categoryService;
	@Resource
	private SettingsService settingsService;

	/** 首页 */
	@RequestMapping({ "/home", "/index" })
	public String toHome(Model model, Integer channel_id, @RequestParam(defaultValue = "1") Integer pageNum) {

		PageHelper.startPage(pageNum, 2);

		// 显示文章
		List<Article> list = articleService.queryAllArticle(channel_id);
		// 图片滚动
		List<Slide> sliedList = slideService.querySlied();
		// 频道展示
		List<Channel> channelList = channelService.queryAllChannel();
		// 最新文章显示
		List<Article> NewArticle = articleService.queryNewArticle(channel_id);

		PageInfo<Article> page = new PageInfo<Article>(list);
		model.addAttribute("page", page);
		model.addAttribute("sliedList", sliedList);
		model.addAttribute("channelList", channelList);
		model.addAttribute("NewArticle", NewArticle);

		return "home";
	}

	/** 博客 */
	@RequestMapping("blog.do")
	public String toBlog() {
		return "blog";
	}

	/** 注册 */
	@RequestMapping("reg.do")
	public String toReg() {
		return "/passport/reg";
	}

	/** 登录页面 */
	@RequestMapping("login.do")
	public String toLogin() {

		return "passport/login";
	}

	/** 注册方法 */
	@RequestMapping("userreg.do")
	public String userReg(User user) {

		int i = userService.userReg(user);

		return "passport/login";
	}

	/** 登录方法 */
	@RequestMapping("userlogin.do")
	public String userLogin(User user, String remember, HttpSession session, HttpServletResponse response,
			HttpServletRequest request) {

		// 管理员登录
		Settings settings = settingsService.login(user);

		if (settings != null) {// 管理员
			session.setAttribute("user", settings);

			return "admin/home";

		} else {

			User login = userService.login(user);
			if (login != null) {// 普通用户
				session.setAttribute("user", login);

				return "redirect:home.do";
			}
			return "passport/login";
		}

		/*
		 * System.out.println(settings.getAdminUsername() +
		 * settings.getAdminPassword());
		 * 
		 * {
		 * 
		 * session.setAttribute("admin", settings); return "admin/home"; }
		 */

	}

	/** 退出 */
	@RequestMapping("logout.do")
	public String logout(HttpSession session, HttpServletRequest request, HttpServletResponse response) {

		session.invalidate();

		// 重新设置 cookie 的值为0【清除cookie】
		Cookie[] cookies = request.getCookies();
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals("username")) {
				cookie.setMaxAge(0);
				response.addCookie(cookie);
				System.out.println("清除成功");
			}
		}

		return "redirect:login.do";

	}

	/** 个人主页 */
	@RequestMapping("userhome.do")
	public String userHome() {
		return "user-space/home";
	}

	/** 我的文章 */
	@RequestMapping("myarticle.do")
	public String myArticle(Integer uid, Model model) {

		List<Article> articles = userService.myArticle(uid);
		model.addAttribute("articles", articles);
		return "user-space/blog_list";
	}

	/** 发布文章页面同时显示栏目下拉菜单 */
	@RequestMapping("topublish.do")
	public String toPublish(Model model) {

		// 查询栏目表
		List<Channel> channelList = channelService.queryAllChannel();
		model.addAttribute("channelList", channelList);
		return "user-space/blog_add";

	}

	/** 查询类型下拉菜单 */
	@RequestMapping("getcategory.do")
	@ResponseBody
	public Object getCategory(Integer id) {

		// 查询类型表
		List<Category> categoryList = categoryService.getCategory(id);
		System.out.println(categoryList);
		return categoryList;
//		return null;

	}

	/** 上传头像页面 */

	@RequestMapping("toupload.do")
	public String toUpload() {
		return "user-space/avatar";

	}

	/** 跳转个人设置页面 */
	@RequestMapping("setting.do")
	public String toSetting() {
		return "user-space/profile";

	}

	/**
	 * 发布文章
	 * 
	 * @throws IOException
	 * @throws IllegalStateException
	 */
	@RequestMapping("publishArticle.do")
	public String publishArticle(Article article, MultipartFile file, HttpSession session) throws Exception {

		// 上传头像
		String upload = FileUtils.upload(file, session);
		article.setPicture(upload);
		// 获取用户id
		User user = (User) session.getAttribute("user");
		article.setUser_id(user.getId());

		int i = articleService.publishArticle(article);
		return "redirect:myarticle.do";

	}

	/** 文章详细 */
	@RequestMapping("showarticle.do")
	public String showArticle(Model model, String article_title, String content, Integer article_id) {

		model.addAttribute("article_id", article_id);
		model.addAttribute("article_title", article_title);
		model.addAttribute("content", content);

		return "desarticle";

	}

	

}

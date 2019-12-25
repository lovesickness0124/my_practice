/**  
 *
 * Title: ComplainController.java
 *
 * Description: 
 *
 * Copyright: Copyright (c) 2019
 *
 * Company: 
 *
 * @author 王琪  
 *
 * @date 2019年12月25日  
 *
 * @version 1.0  
 *
 */
package com.wangqi.cms.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.naming.Binding;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.ibatis.binding.BindingException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wangqi.cms.domain.Complain;
import com.wangqi.cms.service.ComplainService;

/**
 *
 * Description: 投诉 控制层
 *
 * @author 王琪
 *
 * @date 2019年12月25日
 *
 */
@Controller
public class ComplainController {

	@Resource
	private ComplainService complainService;

	/** 跳转的投诉页面 */
	@RequestMapping("tocomplain.do")
	public String toComplain(Integer article_id, HttpSession session, Model model) {

		Complain complain = new Complain();
		model.addAttribute("complain", complain);

		System.out.println("文章id\n\n" + article_id);
		session.setAttribute("article_id", article_id);
//		session.setAttribute("user_id", user_id);

		return "user-space/complain";

	}

	/** 举报内容进行验证 */
	@RequestMapping("complain.do")
	public String toComplain(@Valid @ModelAttribute("complain") Complain complain, BindingResult bingBindingResult) {

		if (bingBindingResult.hasErrors()) {

			return "user-space/complain";
		}
		System.out.println("举报内容\n\n" + complain);

		// 添加 投诉内容
		int i = complainService.addComplain(complain);

		return "redirect:home.do";

	}

	/** 去管理员管理举报页面 */
	@RequestMapping("toadmincomplain.do")
	public String toAdminComplain(Model model, @RequestParam(defaultValue = "1") Integer pageNum, Integer complaintype,
			Integer start, Integer end, Integer order, HttpSession session) {

		System.out.println("排序\n\n" + order);

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("complaintype", complaintype);
		map.put("start", start);
		map.put("end", end);
		map.put("order", order);

		// 将查询内容存入 session 用于回显
		session.setAttribute("complaintype", complaintype);
		session.setAttribute("start", start);
		session.setAttribute("end", end);

		// 分页设置
		PageHelper.startPage(pageNum, 2);
		// 查询举报表
		List<Complain> list = complainService.findComplain(map);
		System.out.println("举报表：" + list);
		PageInfo<Complain> page = new PageInfo<Complain>(list);

		model.addAttribute("page", page);

		return "admin/complain";

	}

	/** 投诉详细内容 */
	@RequestMapping("complaindes.do")
	public String complainDes(Model model, Integer id, @RequestParam(defaultValue = "1") Integer pageNum) {

		System.out.println("文章ID" + id);
		// 分页设置
		PageHelper.startPage(pageNum, 2);

		List<Complain> list = complainService.complainDes(id);
		System.out.println("详细\n\n" + list);
		PageInfo<Complain> page = new PageInfo<Complain>(list);
		model.addAttribute("page", page);

		return "descomplain";

	}

	/** 内容 */
	/*
	 * @RequestMapping("addcomplain.do") public String addComplain() {
	 * 
	 * 
	 * return null;
	 * 
	 * 
	 * }
	 */
}

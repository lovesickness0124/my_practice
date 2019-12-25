package com.wangqi.cms.interceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.bawei.utils.CookieUtils;
import com.wangqi.cms.domain.Settings;
import com.wangqi.cms.domain.User;
import com.wangqi.cms.service.SettingsService;
import com.wangqi.cms.service.UserService;

/**
 * author：王琪
 * email：2529970816@qq.com
 * Tel/Vx：18295704953
 * @Date 2019年12月23日
 */
public class LoginInterceptor implements HandlerInterceptor{
	
	
	
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}

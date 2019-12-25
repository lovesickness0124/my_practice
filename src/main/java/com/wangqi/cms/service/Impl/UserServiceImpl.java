package com.wangqi.cms.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wangqi.cms.dao.UserMapper;
import com.wangqi.cms.domain.Article;
import com.wangqi.cms.domain.User;
import com.wangqi.cms.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Resource
	private UserMapper usermapper;

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return usermapper.login(user);
	}

	@Override
	public int userReg(User user) {
		// TODO Auto-generated method stub
		return usermapper.userReg(user);
	}

	@Override
	public List<Article> myArticle(Integer uid) {
		// TODO Auto-generated method stub
		return usermapper.myArticle(uid);
	}

}

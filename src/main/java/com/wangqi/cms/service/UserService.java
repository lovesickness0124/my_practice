package com.wangqi.cms.service;

import java.util.List;

import com.wangqi.cms.domain.Article;
import com.wangqi.cms.domain.User;

public interface UserService {

	User login(User user);

	int userReg(User user);

	List<Article> myArticle(Integer uid);

}

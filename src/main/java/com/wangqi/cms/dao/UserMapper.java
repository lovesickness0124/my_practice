package com.wangqi.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wangqi.cms.domain.Article;
import com.wangqi.cms.domain.User;

/**
 * dao层用户接口
 * @author Administrator
 *
 */
public interface UserMapper {

	/**登录*/
	User login(User user);

	/**注册*/
	int userReg(User user);

	/**我的文章*/
	List<Article> myArticle(@Param("uid") Integer uid);

}

package com.wangqi.cms.dao;
/**
 * 文章DAO层接口
 * @author Administrator
 *
 */

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wangqi.cms.domain.Article;

public interface ArticleMapper {

	/**Home 页面 文章显示*/
	List<Article> queryAllArticle(@Param("channel_id")Integer channel_id);

	/**最新文章*/
	List<Article> queryNewArticle(@Param("channel_id") Integer channel_id);

	/**发布文章*/
	int publishArticle(Article article);
}

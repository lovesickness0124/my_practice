package com.wangqi.cms.service;

import java.util.List;

import com.wangqi.cms.domain.Article;

public interface ArticleService {

	/** Home 页面 文章显示 
	 * @param channel_id */
	List<Article> queryAllArticle(Integer channel_id);

	/**最新文章*/
	List<Article> queryNewArticle(Integer channel_id);

	/**发布一片文章*/
	int publishArticle(Article article);
}

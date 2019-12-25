package com.wangqi.cms.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wangqi.cms.dao.ArticleMapper;
import com.wangqi.cms.domain.Article;
import com.wangqi.cms.service.ArticleService;

@Service
@Transactional
public class ArticleServiceImpl implements ArticleService {

	@Resource
	private ArticleMapper articleMapper;

	/** Home 页面 文章显示 */
	@Override
	public List<Article> queryAllArticle(Integer channel_id) {
		// TODO Auto-generated method stub
		return articleMapper.queryAllArticle(channel_id);
	}

	/** 最新文章 */
	@Override
	public List<Article> queryNewArticle(Integer channel_id) {
		// TODO Auto-generated method stub
		return articleMapper.queryNewArticle(channel_id);
	}

	/**发布于文章*/
	@Override
	public int publishArticle(Article article) {
		// TODO Auto-generated method stub
		return articleMapper.publishArticle(article);
	}

}

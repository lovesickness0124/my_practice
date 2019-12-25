/**  
 *
 * Title: HostThread.java
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
package com.wangqi.cms.thread;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wangqi.cms.domain.Article;
import com.wangqi.cms.service.ArticleService;

/**
 *
 * Description: 
 *
 * @author 王琪
 *
 * @date 2019年12月25日
 *
 */
public class HostThread extends Thread{

	/*   
	 * Description: 热门文章
	 *  
	 *
	 * @see java.lang.Thread#run()  
	 *
	 */
	@Override
	public void run() {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		ArticleService bean = context.getBean(ArticleService.class);
		
		List<Article> queryAllArticle1 = bean.queryAllArticle(1);
		List<Article> queryAllArticle2 = bean.queryAllArticle(2);
		
		for (Article article : queryAllArticle1) {
			System.out.println(article);
		}
		
		for (Article article : queryAllArticle2) {
			System.out.println(article);
		}
		
		super.run();
	}
}

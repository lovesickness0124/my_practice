/**  
 *
 * Title: Complain.java
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
package com.wangqi.cms.domain;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * Description:
 *
 * @author 王琪
 *
 * @date 2019年12月25日
 *
 */
public class Complain {

	private Integer id;
	private int article_id;
	private String title;
	private String content;
	private int user_id;
	private String username;
	private int complaintype;
	private String ctype;
//	@Pattern(regexp = "^http://|\\d+",message = "url不正确")
	@NotBlank(message = "url不能为空")
	private String urlip;
	private int count;

	/**
	 *
	 * @return the username
	 *
	 */
	public String getUsername() {
		return username;
	}

	/**
	 *
	 * @param username the username to set
	 *
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 *
	 * @return the title
	 *
	 */
	public String getTitle() {
		return title;
	}

	/**
	 *
	 * @param title the title to set
	 *
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 *
	 * @return the content
	 *
	 */
	public String getContent() {
		return content;
	}

	/**
	 *
	 * @param content the content to set
	 *
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 *
	 * @return the count
	 *
	 */
	public int getCount() {
		return count;
	}

	/**
	 *
	 * @param count the count to set
	 *
	 */
	public void setCount(int count) {
		this.count = count;
	}

	/**
	 *
	 * @return the id
	 *
	 */
	public Integer getId() {
		return id;
	}

	/**
	 *
	 * @param id the id to set
	 *
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 *
	 * @return the article_id
	 *
	 */
	public int getArticle_id() {
		return article_id;
	}

	/**
	 *
	 * @param article_id the article_id to set
	 *
	 */
	public void setArticle_id(int article_id) {
		this.article_id = article_id;
	}

	/**
	 *
	 * @return the user_id
	 *
	 */
	public int getUser_id() {
		return user_id;
	}

	/**
	 *
	 * @param user_id the user_id to set
	 *
	 */
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	/**
	 *
	 * @return the complaintype
	 *
	 */
	public int getComplaintype() {
		return complaintype;
	}

	/**
	 *
	 * @param complaintype the complaintype to set
	 *
	 */
	public void setComplaintype(int complaintype) {
		this.complaintype = complaintype;
	}

	/**
	 *
	 * @return the ctype
	 *
	 */
	public String getCtype() {
		ctype = "";
		switch (complaintype) {
		case 1:
			ctype = "涉及黄色";
			break;
		case 2:
			ctype = "涉及暴力";
			break;
		case 3:
			ctype = "涉及违宗教政策";
			break;
		case 4:
			ctype = "涉及国家安全";
			break;
		case 5:
			ctype = "涉及抄袭内容";
			break;
		case 6:
			ctype = "涉及其他";
			break;

		default:
			break;
		}
		return ctype;
	}

	/**
	 *
	 * @param ctype the ctype to set
	 *
	 */
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}

	/**
	 *
	 * @return the urlip
	 *
	 */
	public String getUrlip() {
		return urlip;
	}

	/**
	 *
	 * @param urlip the urlip to set
	 *
	 */
	public void setUrlip(String urlip) {
		this.urlip = urlip;
	}

	/**
	 *
	 * Description:
	 *
	 * @param article_id
	 * @param user_id
	 * @param complaintype
	 * @param urlip
	 *
	 */
	public Complain(int article_id, int user_id, int complaintype, String urlip) {
		super();
		this.article_id = article_id;
		this.user_id = user_id;
		this.complaintype = complaintype;
		this.urlip = urlip;
	}

	/**
	 *
	 * Description:
	 *
	 *
	 */
	public Complain() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*
	 * Description:
	 *
	 * @return
	 *
	 * @see java.lang.Object#toString()
	 *
	 */
	@Override
	public String toString() {
		return "Complain [id=" + id + ", article_id=" + article_id + ", user_id=" + user_id + ", complaintype="
				+ complaintype + ", urlip=" + urlip + "]";
	}

}

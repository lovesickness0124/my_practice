/**
 * 
 */
package com.wangqi.cms.domain;

import java.io.Serializable;

import com.wangqi.cms.controller.HomeController;

/**
 * 说明:配置表(cms_settings)
 */
public class Settings extends HomeController {

	private static final long serialVersionUID = 1L;

	public static final int DEFAULT_ID = 1;

	/**主键**/
	private int id = DEFAULT_ID;

	/**网站域名**/
	private String siteDomain;
	
	/**网站名称**/
	private String siteName;
	
	/**每页文章显示条数**/
	private Integer articleListSize;
	
	/**首页幻灯片显示条数**/
	private Integer slideSize;
	
	/**管理员账号**/
	private String adminUsername;
	
	/**管理员密码**/
	private String adminPassword;

	//-----------------------------------------------------------------------
	
	public Settings() {
		super();
	}

	public Settings(int id) {
		super();
		this.id = id;
	}

	
	//-----------------------------------------------------------------------
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSiteDomain() {
		return siteDomain;
	}

	public void setSiteDomain(String siteDomain) {
		this.siteDomain = siteDomain;
	}

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public Integer getArticleListSize() {
		return articleListSize;
	}

	public void setArticleListSize(Integer articleListSize) {
		this.articleListSize = articleListSize;
	}

	public Integer getSlideSize() {
		return slideSize;
	}

	public void setSlideSize(Integer slideSize) {
		this.slideSize = slideSize;
	}

	public String getAdminUsername() {
		return adminUsername;
	}

	public void setAdminUsername(String adminUsername) {
		this.adminUsername = adminUsername;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	
}

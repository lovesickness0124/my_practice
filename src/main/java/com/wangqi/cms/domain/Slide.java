/**
 * 
 */
package com.wangqi.cms.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * 说明: 首页广告表或幻灯片表（cms_slide）
 */
public class Slide implements Serializable {

	private static final long serialVersionUID = 1L;

	/**主键**/
	private Integer id;

	/**标题**/
	private String title;
	
	/**图片**/
	private String picture;

	/**地址**/
	private String url;
	
	/**创建时间：首页幻灯片按时间倒排序**/
	/**????与数据结构不符????**/
	private Date created;

	
	//-----------------------------------------------------------------
	
	public Slide() {
		super();
	}
	
	public Slide(Integer id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
	
	
	//-----------------------------------------------------------------
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Override
	public String toString() {
		return "Slide [id=" + id + ", title=" + title + ", picture=" + picture + ", url=" + url + ", created=" + created
				+ "]";
	}
	
	
}

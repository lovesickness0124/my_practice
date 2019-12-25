package com.wangqi.cms.domain;

import java.util.Date;

import com.wangqi.cms.controller.HomeController;

/**
 * 文章实体类
 * 
 * @author Administrator
 *
 */
public class Article extends HomeController {
	/** 文章主键 */
	public Integer id;
	/** 文章标题 */
	public String title;
	/** 文章概述 */
	public String summary;
	/** 文章内容 */
	public String content;
	/** 文章图片如果没上传，则在文章内容自动提取，内容也没有图片，则为空 */
	public String picture;
	/** 点击量 */
	public Integer hits;
	/** 是否上热门 */
	public Integer hot;
	/** 是否审核通过 */
	public Integer status;
	/** 0:失效1:有效 使用逻辑删除 */
	public Integer deleted;
	/** 文章创建时间 */
	public Date created;
	/** 文章更新时间 */
	public Date updated;
	/** 关联频道 */
	public Integer channel_id;
	/** 关联分类 */
	public Integer category_id;
	/** 关联用户 */
	public Integer user_id;
	/** 投诉次数 */
	public Integer complain_count;
	/** 关联频道名 */
	/** 关联分类名 */
	private String channelname;
	/** 分类名称 **/
	private String categoryname;
	/** 关联用户名 */
	private String username;

	public Integer getId() {
		return id;
	}

	public Article() {

	}

	public Article(Integer id, String title, String summary, String content, String picture, Integer hits, Integer hot,
			Integer status, Integer deleted, Date created, Date updated) {
		this.id = id;
		this.title = title;
		this.summary = summary;
		this.content = content;
		this.picture = picture;
		this.hits = hits;
		this.hot = hot;
		this.status = status;
		this.deleted = deleted;
		this.created = created;
		this.updated = updated;
	}

	/** 添加的构造方法 */
	public Article(String title, String summary, String content, String picture, Integer hits, Integer hot,
			Integer status, Integer deleted, Date created, Date updated, Integer channel_id, Integer category_id,
			Integer user_id,Integer complain_count) {
		super();
		this.title = title;
		this.summary = summary;
		this.content = content;
		this.picture = picture;
		this.hits = hits;
		this.hot = hot;
		this.status = status;
		this.deleted = deleted;
		this.created = created;
		this.updated = updated;
		this.channel_id = channel_id;
		this.category_id = category_id;
		this.user_id = user_id;
		this.complain_count = complain_count;
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

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Integer getHits() {
		return hits;
	}

	public void setHits(Integer hits) {
		this.hits = hits;
	}

	public Integer getHot() {
		return hot;
	}

	public void setHot(Integer hot) {
		this.hot = hot;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getDeleted() {
		return deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public Integer getChannel_id() {
		return channel_id;
	}

	public void setChannel_id(Integer channel_id) {
		this.channel_id = channel_id;
	}

	public Integer getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	/**
	 *
	 * @return the complain_count
	 *
	 */
	public Integer getComplain_count() {
		return complain_count;
	}

	/**
	 *
	 * @param complain_count the complain_count to set
	 *
	 */
	public void setComplain_count(Integer complain_count) {
		this.complain_count = complain_count;
	}

	public String getChannelname() {
		return channelname;
	}

	public void setChannelname(String channelname) {
		this.channelname = channelname;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", summary=" + summary + ", content=" + content + ", picture="
				+ picture + ", hits=" + hits + ", hot=" + hot + ", status=" + status + ", deleted=" + deleted
				+ ", created=" + created + ", updated=" + updated + ", channel_id=" + channel_id + ", category_id="
				+ category_id + ", user_id=" + user_id + ", channelname=" + channelname + ", categoryname="
				+ categoryname + ", username=" + username + "]";
	}

}

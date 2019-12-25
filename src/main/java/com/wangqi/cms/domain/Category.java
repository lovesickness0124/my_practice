/**
 * 
 */
package com.wangqi.cms.domain;

import com.wangqi.cms.controller.HomeController;

/**
 * 说明:分类表（cms_category）
 *
 */
public class Category extends HomeController {

	private static final long serialVersionUID = 1L;

	/** 主键 **/
	private Integer id;

	/** 分类名称 **/
	private String name;

	/** 排序 **/
	private Integer sorted;

	/** 所属频道 **/
	private Channel channel;

	// ------------------------------------------------------

	public Category() {
		super();
	}

	public Category(Integer id) {
		super();
		this.id = id;
	}

	// ------------------------------------------------------

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSorted() {
		return sorted;
	}

	public void setSorted(Integer sorted) {
		this.sorted = sorted;
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", sorted=" + sorted + ", channel=" + channel + "]";
	}

}

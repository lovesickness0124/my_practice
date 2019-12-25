/**
 * 
 */
package com.wangqi.cms.domain;
import java.io.Serializable;

import com.wangqi.cms.controller.HomeController;
/**
 * 说明:栏目表（cms_channel）
 */
public class Channel extends HomeController{

	private static final long serialVersionUID = 1L;

	/**主键**/
	private Integer id;
	
	/**名称**/
	private String name;
	
	/**描述**/
	private String description;

	/**图标**/
	private String icon;
	
	/**排序**/
	private Integer sorted;

	
	//------------------------------------------------------
	
	public Channel() {
		super();
	}
	public Channel(Integer id) {
		super();
		this.id = id;
	}

	public Channel(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Channel(Integer id, String name, int sorted) {
		super();
		this.id = id;
		this.name = name;
		this.sorted = sorted;
	}
	
	//------------------------------------------------------

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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public Integer getSorted() {
		return sorted;
	}
	public void setSorted(Integer sorted) {
		this.sorted = sorted;
	}

	
}

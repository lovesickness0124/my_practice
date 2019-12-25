/**
 * 
 */
package com.wangqi.cms.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * 说明:用户表(cms_user)
 */
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**主键**/
	private Integer id;

	/**用户名**/
	private String username;
	
	/**密码*/
	private String password;
	
	/**昵称**/
	private String nickname;
	
	/**生日*/
	private Date birthday;
	
	/**性别**/
	private Integer gender;
	
	/**是否启动|禁用**/
	private Boolean locked;

	/**创建时间*/
	private Date created;
	
	/**更新时间*/
	private Date updated;
	
	
	//------------------------------------------------------------------------
	
	public User() {
		super();
	}
	
	public User(Integer id) {
		super();
		this.id = id;
	}
	public User(String username) {
		super();
		this.username = username;
	}

	
	//------------------------------------------------------------------------


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Boolean getLocked() {
		return locked;
	}

	public void setLocked(Boolean locked) {
		this.locked = locked;
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

	
	
	
}

package com.wangqi.cms.domain;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

/**
 * author：王琪 email：2529970816@qq.com Tel/Vx：18295704953
 * 
 * @Date 2019年12月20日
 */
public class Inform {

	private Integer id;
	@Pattern(regexp = "[\\u4e00-\\u9fa5]{2,4}", message = "姓名2~4位汉字")
	private String nickname;
	@NotBlank(message = "邮箱不能为空")
	@Email(message = "邮箱格式不正确")
	private String email;
	@Pattern(regexp = "1[3|5|7|8]\\d{9}", message = "请输入11位手机号")
	private String phone;
	@Size(max = 50, min = 10, message = "输入10~50位详细住址")
	private String address;
	@Pattern(regexp = "^\\d{15}$|^\\d{17}[0-9Xx]$", message = "请输入18位身份证号")
	private String idcard;
	@Size(min = 2, max = 10, message = "请选择类型")
	private String type;
	private int article_id;
	private int user_id;

	private int count;
	private String article_title;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getArticle_id() {
		return article_id;
	}

	public void setArticle_id(int article_id) {
		this.article_id = article_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getArticle_title() {
		return article_title;
	}

	public void setArticle_title(String article_title) {
		this.article_title = article_title;
	}

	public Inform(String nickname, String email, String phone, String address, String idcard, String type,
			int article_id, int user_id) {
		super();
		this.nickname = nickname;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.idcard = idcard;
		this.type = type;
		this.article_id = article_id;
		this.user_id = user_id;
	}

	public Inform() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Inform [id=" + id + ", nickname=" + nickname + ", email=" + email + ", phone=" + phone + ", address="
				+ address + ", idcard=" + idcard + ", type=" + type + ", article_id=" + article_id + ", user_id="
				+ user_id + "count" + count + "article_title"+article_title+"]";
	}

}

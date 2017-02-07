package cn.cooperlink.privatetutor.model;

import java.util.Date;

/**
 * BusinessVerifyCode entity. @author MyEclipse Persistence Tools
 */

public class BusinessVerifyCode extends BaseEntity {

	// Fields

	private String id;
	private String phoneNumber;
	private String code;
	/** 类型：1-用户注册；2-找回密码； */
	private String type;
	private Date activeTime;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getActiveTime() {
		return this.activeTime;
	}

	public void setActiveTime(Date activeTime) {
		this.activeTime = activeTime;
	}

}
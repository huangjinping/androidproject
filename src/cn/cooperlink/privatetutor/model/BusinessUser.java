package cn.cooperlink.privatetutor.model;

import java.util.Date;

/**
 * BusinessUser entity. @author MyEclipse Persistence Tools
 */

public class BusinessUser extends BaseEntity {
	private String id;
	private String loginName;
	private String password;
	private String confirmNewPassword;
	private Integer points;
	/** 类型：1-教师；2-学生；3-管理员。 */
	private String type;
	/** 审核标识：1-未审核；2-未通过；3-通过。 */
	private String verifyFlag;
	private Date verifyDate;
	/** 禁用标识：1-未禁用；2-已禁用 */
	private String disableFlag;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getPoints() {
		return this.points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	/**
	 * @Description:TODO（类型：1-教师；2-学生；3-管理员。）
	 * @author：gongluzhen
	 * @return
	 */
	public String getType() {
		return this.type;
	}

	/**
	 * @Description:TODO（类型：1-教师；2-学生；3-管理员。）
	 * @author：gongluzhen
	 * @return
	 */
	public void setType(String type) {
		this.type = type;
	}

	public String getVerifyFlag() {
		return this.verifyFlag;
	}

	public void setVerifyFlag(String verifyFlag) {
		this.verifyFlag = verifyFlag;
	}

	public String getDisableFlag() {
		return this.disableFlag;
	}

	public void setDisableFlag(String disableFlag) {
		this.disableFlag = disableFlag;
	}

	public String getConfirmNewPassword() {
		return confirmNewPassword;
	}

	public void setConfirmNewPassword(String confirmNewPassword) {
		this.confirmNewPassword = confirmNewPassword;
	}

	public Date getVerifyDate() {
		return verifyDate;
	}

	public void setVerifyDate(Date verifyDate) {
		this.verifyDate = verifyDate;
	}

}
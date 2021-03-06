package cn.cooperlink.privatetutor.model;

import java.util.Date;

/**
 * BusinessUserTeacherRecommend entity. @author MyEclipse Persistence Tools
 */

public class BusinessUserTeacherRecommend extends BaseEntity {
	private String id;
	private String businessUserTeacherId;
	private Date recommendDate;
	private String remark;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBusinessUserTeacherId() {
		return this.businessUserTeacherId;
	}

	public void setBusinessUserTeacherId(String businessUserTeacherId) {
		this.businessUserTeacherId = businessUserTeacherId;
	}

	public Date getRecommendDate() {
		return this.recommendDate;
	}

	public void setRecommendDate(Date recommendDate) {
		this.recommendDate = recommendDate;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
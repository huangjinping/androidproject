package cn.cooperlink.privatetutor.model;

import java.util.Date;

/**
 * BusinessPointsRules entity. @author MyEclipse Persistence Tools
 */

public class BusinessPointsRules extends BaseEntity {

	private String id;
	private String name;
	/** 编码：01-签到；02-评价；03-分享；04-下单 */
	private String code;
	private Integer points;
	private Date createdDate;
	private String createdPerson;
	private Date lastModifiedDate;
	private String lastModifiedPerson;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getPoints() {
		return this.points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedPerson() {
		return this.createdPerson;
	}

	public void setCreatedPerson(String createdPerson) {
		this.createdPerson = createdPerson;
	}

	public Date getLastModifiedDate() {
		return this.lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getLastModifiedPerson() {
		return this.lastModifiedPerson;
	}

	public void setLastModifiedPerson(String lastModifiedPerson) {
		this.lastModifiedPerson = lastModifiedPerson;
	}

}
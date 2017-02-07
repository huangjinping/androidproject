package cn.cooperlink.privatetutor.model;

import java.io.Serializable;
import java.util.Date;

import cn.cooperlink.privatetutor.utils.TimestampTool;

public class BaseEntity implements Serializable {
	private Date createdDate;
	private String createdPerson;
	private Date lastModifiedDate;
	private String lastModifiedPerson;

	public void setCreateProperties(String person) {
		this.setCreatedDate(TimestampTool.crunttime());
		this.setCreatedPerson(person);
		this.setLastModifiedDate(TimestampTool.crunttime());
		this.setLastModifiedPerson(person);
	}
	
	public void setModifyProperties(String person) {
		this.setLastModifiedDate(TimestampTool.crunttime());
		this.setLastModifiedPerson(person);
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedPerson() {
		return createdPerson;
	}

	public void setCreatedPerson(String createdPerson) {
		this.createdPerson = createdPerson;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getLastModifiedPerson() {
		return lastModifiedPerson;
	}

	public void setLastModifiedPerson(String lastModifiedPerson) {
		this.lastModifiedPerson = lastModifiedPerson;
	}

}
package cn.cooperlink.privatetutor.model;

/**
 * BusinessUserLog entity. @author MyEclipse Persistence Tools
 */

public class BusinessUserLog extends BaseEntity {
	private String id;
	private String businessUserId;
	private String content;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBusinessUserId() {
		return this.businessUserId;
	}

	public void setBusinessUserId(String businessUserId) {
		this.businessUserId = businessUserId;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
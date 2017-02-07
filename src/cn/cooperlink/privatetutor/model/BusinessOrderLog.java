package cn.cooperlink.privatetutor.model;

/**
 * BusinessOrderLog entity. @author MyEclipse Persistence Tools
 */

public class BusinessOrderLog extends BaseEntity {
	private String id;
	private String businessOrderId;
	private String content;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBusinessOrderId() {
		return this.businessOrderId;
	}

	public void setBusinessOrderId(String businessOrderId) {
		this.businessOrderId = businessOrderId;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
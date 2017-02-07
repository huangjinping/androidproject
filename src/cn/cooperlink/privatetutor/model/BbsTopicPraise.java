package cn.cooperlink.privatetutor.model;

/**
 * BbsTopicPraise entity. @author MyEclipse Persistence Tools
 */

public class BbsTopicPraise extends BaseEntity {
	private String id;
	private String bbsTopicId;
	private String businessUserId;
	/** 是否点赞：1-否；2-是。 */
	private String isPraise;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBbsTopicId() {
		return this.bbsTopicId;
	}

	public void setBbsTopicId(String bbsTopicId) {
		this.bbsTopicId = bbsTopicId;
	}

	public String getBusinessUserId() {
		return this.businessUserId;
	}

	public void setBusinessUserId(String businessUserId) {
		this.businessUserId = businessUserId;
	}

	public String getIsPraise() {
		return this.isPraise;
	}

	public void setIsPraise(String isPraise) {
		this.isPraise = isPraise;
	}

}
package cn.cooperlink.privatetutor.model;

/**
 * BusinessUserFeedback entity. @author MyEclipse Persistence Tools
 */

public class BusinessUserFeedback extends BaseEntity {

	// Fields

	private String id;
	private String businessUserId;
	private String content;
	/** 1-系统BUG；2-介面问题；3-功能问题；4-其它。 */
	private String type;
	private String title;

	// Property accessors

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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
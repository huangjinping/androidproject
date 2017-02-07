package cn.cooperlink.privatetutor.model;

/**
 * BusinessAttention entity. @author MyEclipse Persistence Tools
 */

public class BusinessUserAttention extends BaseEntity {
	private String id;
	/** 关注人business_user表主键 */
	private String attentionTo;
	/** 被关注人business_user表主键 */
	private String attentionBy;
	/** 类型：1-学生关注教师；2-学生关注学生；3-教师关注学生；4-教师关注教师。 */
	private String type;
	/** 删除标识：0-未删除；1-已删除 */
	private String deleteFlag;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAttentionTo() {
		return attentionTo;
	}

	public void setAttentionTo(String attentionTo) {
		this.attentionTo = attentionTo;
	}

	public String getAttentionBy() {
		return attentionBy;
	}

	public void setAttentionBy(String attentionBy) {
		this.attentionBy = attentionBy;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

}
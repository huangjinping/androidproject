package cn.cooperlink.privatetutor.model;


/**
 * BusinessEvaluation entity. @author MyEclipse Persistence Tools
 */

public class BusinessOrderEvaluation extends BaseEntity {
	private String id;
	private String businessOrderId;
	private String textDescription;
	private Integer score;
	private String deleteFlag;

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

	public String getTextDescription() {
		return this.textDescription;
	}

	public void setTextDescription(String textDescription) {
		this.textDescription = textDescription;
	}

	public Integer getScore() {
		return this.score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public String getDeleteFlag() {
		return this.deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

}
package cn.cooperlink.privatetutor.model;


/**
 * BusinessOrderPreparation entity. @author MyEclipse Persistence Tools
 */

public class BusinessOrderPreparation extends BaseEntity {
	private String id;
	private String businessOrderId;
	private String textDescription;

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

}
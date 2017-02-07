package cn.cooperlink.privatetutor.model;


/**
 * BusinessOrderServicePhoto entity. @author MyEclipse Persistence Tools
 */

public class BusinessOrderServicePhoto extends BaseEntity {
	private String id;
	private String businessOrderId;
	private String textDescription;
	private String photo;
	private String addr;

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

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getAddr() {
		return this.addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

}
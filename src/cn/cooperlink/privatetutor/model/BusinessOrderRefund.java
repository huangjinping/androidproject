package cn.cooperlink.privatetutor.model;

import java.math.BigDecimal;

/**
 * BusinessOrderRefund entity. @author MyEclipse Persistence Tools
 */

public class BusinessOrderRefund extends BaseEntity {
	private String id;
	private String businessOrderId;
	private String content;
	private BigDecimal money;
	/** 状态：1-申请；2-完成；3-驳回。 */
	private String state;

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

	public BigDecimal getMoney() {
		return this.money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	/**
	 * 
	 * @Description:TODO（状态：1-申请；2-完成；3-驳回。）
	 * @author：gongluzhen
	 * @return
	 */
	public String getState() {
		return this.state;
	}

	/**
	 * 
	 * @Description:TODO（状态：1-申请；2-完成；3-驳回。）
	 * @author：gongluzhen
	 * @param state
	 */
	public void setState(String state) {
		this.state = state;
	}

}
package cn.cooperlink.privatetutor.model;

/**
 * BusinessSequence entity. @author MyEclipse Persistence Tools
 */

public class BusinessSequence extends BaseEntity {

	// Fields

	private String id;
	private String name;
	private String value;

	// Constructors

	/** default constructor */
	public BusinessSequence() {
	}

	/** full constructor */
	public BusinessSequence(String name, String value) {
		this.name = name;
		this.value = value;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
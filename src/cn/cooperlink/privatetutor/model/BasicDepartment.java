package cn.cooperlink.privatetutor.model;

/**
 * BasicDepartment entity. @author MyEclipse Persistence Tools
 */

public class BasicDepartment extends BaseEntity {

	// Fields

	private Integer id;
	private String name;
	private Integer schoolId;

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSchoolId() {
		return this.schoolId;
	}

	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}

}
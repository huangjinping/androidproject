package cn.cooperlink.privatetutor.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class BusinessUserTeacher extends BaseEntity {
	private String id;
	private String businessUserId;
	private Integer code;
	private String name;
	/** 性别：1-男；2-女。 */
	private String sex;
	private Integer age;
	private Date dateOfBirth;
	private String mailbox;
	private String idPhoto;
	private String studentCardPhoto;
	private String oneInchPhoto;
	private Integer collegeProvince;
	private Integer collegeCity;
	private Integer college;
	private Integer collegeDepartment;
	private Integer collegeGrade;
	private Integer middleSchoolProvince;
	private Integer middleSchoolCity;
	private Integer middleSchoolCounty;
	private Integer middleSchool;
	private BigDecimal collegeEntranceExaminationScores;
	/** 文理科：1-文科；2-理科 */
	private String artsOrScience;
	private Integer teachingExperience;
	private String selfEvaluation;
	private String interests;
	private BigDecimal classUnitPrice;
	private BigDecimal classUnitSelfPrice;
	/** 是否置顶：0-否；1-是 */
	private String isTop;
	private Integer studentNumber;
	private Integer totalTeachingHours;
	private Integer evaluationNumber;
	private BigDecimal evaluationGoodRate;

	private List<BusinessUserTeacherSubject> businessUserTeacherSubjectList;
	private List<BusinessUserTeacherServiceArea> businessUserTeacherServiceAreaList;
	private List<BusinessUserTeacherServiceTime> businessUserTeacherServiceTimeList;

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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getMailbox() {
		return this.mailbox;
	}

	public void setMailbox(String mailbox) {
		this.mailbox = mailbox;
	}

	public String getIdPhoto() {
		return this.idPhoto;
	}

	public void setIdPhoto(String idPhoto) {
		this.idPhoto = idPhoto;
	}

	public String getStudentCardPhoto() {
		return this.studentCardPhoto;
	}

	public void setStudentCardPhoto(String studentCardPhoto) {
		this.studentCardPhoto = studentCardPhoto;
	}

	public String getOneInchPhoto() {
		return this.oneInchPhoto;
	}

	public void setOneInchPhoto(String oneInchPhoto) {
		this.oneInchPhoto = oneInchPhoto;
	}

	public Integer getCollegeProvince() {
		return this.collegeProvince;
	}

	public void setCollegeProvince(Integer collegeProvince) {
		this.collegeProvince = collegeProvince;
	}

	public Integer getCollegeCity() {
		return this.collegeCity;
	}

	public void setCollegeCity(Integer collegeCity) {
		this.collegeCity = collegeCity;
	}

	public Integer getCollege() {
		return this.college;
	}

	public void setCollege(Integer college) {
		this.college = college;
	}

	public Integer getCollegeDepartment() {
		return this.collegeDepartment;
	}

	public void setCollegeDepartment(Integer collegeDepartment) {
		this.collegeDepartment = collegeDepartment;
	}

	public Integer getCollegeGrade() {
		return this.collegeGrade;
	}

	public void setCollegeGrade(Integer collegeGrade) {
		this.collegeGrade = collegeGrade;
	}

	public Integer getMiddleSchoolProvince() {
		return this.middleSchoolProvince;
	}

	public void setMiddleSchoolProvince(Integer middleSchoolProvince) {
		this.middleSchoolProvince = middleSchoolProvince;
	}

	public Integer getMiddleSchoolCity() {
		return this.middleSchoolCity;
	}

	public void setMiddleSchoolCity(Integer middleSchoolCity) {
		this.middleSchoolCity = middleSchoolCity;
	}

	public Integer getMiddleSchoolCounty() {
		return this.middleSchoolCounty;
	}

	public void setMiddleSchoolCounty(Integer middleSchoolCounty) {
		this.middleSchoolCounty = middleSchoolCounty;
	}

	public Integer getMiddleSchool() {
		return this.middleSchool;
	}

	public void setMiddleSchool(Integer middleSchool) {
		this.middleSchool = middleSchool;
	}

	public BigDecimal getCollegeEntranceExaminationScores() {
		return this.collegeEntranceExaminationScores;
	}

	public void setCollegeEntranceExaminationScores(BigDecimal collegeEntranceExaminationScores) {
		this.collegeEntranceExaminationScores = collegeEntranceExaminationScores;
	}

	public String getArtsOrScience() {
		return this.artsOrScience;
	}

	public void setArtsOrScience(String artsOrScience) {
		this.artsOrScience = artsOrScience;
	}

	public Integer getTeachingExperience() {
		return this.teachingExperience;
	}

	public void setTeachingExperience(Integer teachingExperience) {
		this.teachingExperience = teachingExperience;
	}

	public String getSelfEvaluation() {
		return this.selfEvaluation;
	}

	public void setSelfEvaluation(String selfEvaluation) {
		this.selfEvaluation = selfEvaluation;
	}

	public String getInterests() {
		return this.interests;
	}

	public void setInterests(String interests) {
		this.interests = interests;
	}

	public BigDecimal getClassUnitPrice() {
		return classUnitPrice;
	}

	public void setClassUnitPrice(BigDecimal classUnitPrice) {
		this.classUnitPrice = classUnitPrice;
	}

	public BigDecimal getClassUnitSelfPrice() {
		return classUnitSelfPrice;
	}

	public void setClassUnitSelfPrice(BigDecimal classUnitSelfPrice) {
		this.classUnitSelfPrice = classUnitSelfPrice;
	}

	public String getIsTop() {
		return this.isTop;
	}

	public void setIsTop(String isTop) {
		this.isTop = isTop;
	}

	public List<BusinessUserTeacherSubject> getBusinessUserTeacherSubjectList() {
		return businessUserTeacherSubjectList;
	}

	public void setBusinessUserTeacherSubjectList(List<BusinessUserTeacherSubject> businessUserTeacherSubjectList) {
		this.businessUserTeacherSubjectList = businessUserTeacherSubjectList;
	}

	public List<BusinessUserTeacherServiceArea> getBusinessUserTeacherServiceAreaList() {
		return businessUserTeacherServiceAreaList;
	}

	public void setBusinessUserTeacherServiceAreaList(List<BusinessUserTeacherServiceArea> businessUserTeacherServiceAreaList) {
		this.businessUserTeacherServiceAreaList = businessUserTeacherServiceAreaList;
	}

	public List<BusinessUserTeacherServiceTime> getBusinessUserTeacherServiceTimeList() {
		return businessUserTeacherServiceTimeList;
	}

	public void setBusinessUserTeacherServiceTimeList(List<BusinessUserTeacherServiceTime> businessUserTeacherServiceTimeList) {
		this.businessUserTeacherServiceTimeList = businessUserTeacherServiceTimeList;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Integer getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(Integer studentNumber) {
		this.studentNumber = studentNumber;
	}

	public Integer getTotalTeachingHours() {
		return totalTeachingHours;
	}

	public void setTotalTeachingHours(Integer totalTeachingHours) {
		this.totalTeachingHours = totalTeachingHours;
	}

	public Integer getEvaluationNumber() {
		return evaluationNumber;
	}

	public void setEvaluationNumber(Integer evaluationNumber) {
		this.evaluationNumber = evaluationNumber;
	}

	public BigDecimal getEvaluationGoodRate() {
		return evaluationGoodRate;
	}

	public void setEvaluationGoodRate(BigDecimal evaluationGoodRate) {
		this.evaluationGoodRate = evaluationGoodRate;
	}

}
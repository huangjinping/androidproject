package cn.cooperlink.privatetutor.model;

import java.math.BigDecimal;
import java.util.List;

/**
 * BusinessOrder entity. @author MyEclipse Persistence Tools
 */

public class BusinessOrder extends BaseEntity {
	private String id;
	private String businessUserStudentId;
	private String businessUserTeacherId;
	/** 订单编号 */
	private String code;
	/** 课时 */
	private Integer classHours;
	/** 课时单价 */
	private BigDecimal classUnitPrice;
	/** 课时费用 */
	private BigDecimal classFee;
	/** 优惠费用 */
	private BigDecimal discountFee;
	/** 补助费用 */
	private BigDecimal grantFee;
	/** 学生支付费用 */
	private BigDecimal studentsPayFee;
	/** 支付教师费用 */
	private BigDecimal payTeacherFee;
	/**
	 * 状态： 11-创建订单（待教师同意）； 12-教师同意（待支付）； 13-支付完成（订单创建完成）；</br>
	 * 
	 * 21-学生确认完成； 22-老师确认完成； 23-订单完成；</br>
	 * 
	 * 31-学生申请取消（待教师确认）； 32-教师申请取消（待学生确认）；33-学生确认取消； 34-教师确认取消；</br>
	 * 
	 * 41-申请退款； 42-退款完成。
	 */
	private String state;
	/** 优惠规则ID */
	private String businessDiscountRulesId;
	/** 补助规则ID */
	private String businessGrantRulesId;
	private String studentCompleteAddr;
	private String teacherCompleteAddr;

	private BusinessDiscountRules businessDiscountRules;
	private BusinessGrantRules businessGrantRules;
	private List<BusinessOrderLog> businessOrderLogList;
	private List<BusinessOrderServiceTime> businessOrderServiceTimeList;
	private List<BusinessOrderEvaluation> businessOrderEvaluationList;
	private List<BusinessOrderRefund> businessOrderRefundList;
	private List<BusinessOrderShare> businessOrderShareList;
	private List<BusinessOrderPreparation> businessOrderPreparationList;
	private List<BusinessOrderServicePhoto> businessOrderServicePhotoList;
   
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBusinessUserStudentId() {
		return this.businessUserStudentId;
	}

	public void setBusinessUserStudentId(String businessUserStudentId) {
		this.businessUserStudentId = businessUserStudentId;
	}

	public String getBusinessUserTeacherId() {
		return this.businessUserTeacherId;
	}

	public void setBusinessUserTeacherId(String businessUserTeacherId) {
		this.businessUserTeacherId = businessUserTeacherId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getClassHours() {
		return this.classHours;
	}

	public void setClassHours(Integer classHours) {
		this.classHours = classHours;
	}

	public BigDecimal getClassUnitPrice() {
		return this.classUnitPrice;
	}

	public void setClassUnitPrice(BigDecimal classUnitPrice) {
		this.classUnitPrice = classUnitPrice;
	}

	public BigDecimal getClassFee() {
		return this.classFee;
	}

	public void setClassFee(BigDecimal classFee) {
		this.classFee = classFee;
	}

	public BigDecimal getDiscountFee() {
		return this.discountFee;
	}

	public void setDiscountFee(BigDecimal discountFee) {
		this.discountFee = discountFee;
	}

	public BigDecimal getGrantFee() {
		return this.grantFee;
	}

	public void setGrantFee(BigDecimal grantFee) {
		this.grantFee = grantFee;
	}

	public BigDecimal getStudentsPayFee() {
		return this.studentsPayFee;
	}

	public void setStudentsPayFee(BigDecimal studentsPayFee) {
		this.studentsPayFee = studentsPayFee;
	}

	public BigDecimal getPayTeacherFee() {
		return this.payTeacherFee;
	}

	public void setPayTeacherFee(BigDecimal payTeacherFee) {
		this.payTeacherFee = payTeacherFee;
	}

	/**
	 * 状态： 11-创建订单（待教师同意）； 12-教师同意（待支付）； 13-支付完成（订单创建完成）；</br>
	 * 
	 * 21-学生确认完成； 22-老师确认完成； 23-订单完成；</br>
	 * 
	 * 31-学生申请取消（待教师确认）； 32-教师申请取消（待学生确认）；33-学生确认取消； 34-教师确认取消；</br>
	 * 
	 * 41-申请退款； 42-退款完成。
	 */
	public String getState() {
		return this.state;
	}

	/**
	 * 状态： 11-创建订单（待教师同意）； 12-教师同意（待支付）； 13-支付完成（订单创建完成）；</br>
	 * 
	 * 21-学生确认完成； 22-老师确认完成； 23-订单完成；</br>
	 * 
	 * 31-学生申请取消（待教师确认）； 32-教师申请取消（待学生确认）；33-学生确认取消； 34-教师确认取消；</br>
	 * 
	 * 41-申请退款； 42-退款完成。
	 */
	public void setState(String state) {
		this.state = state;
	}

	public String getBusinessDiscountRulesId() {
		return this.businessDiscountRulesId;
	}

	public void setBusinessDiscountRulesId(String businessDiscountRulesId) {
		this.businessDiscountRulesId = businessDiscountRulesId;
	}

	public String getBusinessGrantRulesId() {
		return this.businessGrantRulesId;
	}

	public void setBusinessGrantRulesId(String businessGrantRulesId) {
		this.businessGrantRulesId = businessGrantRulesId;
	}

	public BusinessDiscountRules getBusinessDiscountRules() {
		return businessDiscountRules;
	}

	public void setBusinessDiscountRules(BusinessDiscountRules businessDiscountRules) {
		this.businessDiscountRules = businessDiscountRules;
	}

	public BusinessGrantRules getBusinessGrantRules() {
		return businessGrantRules;
	}

	public void setBusinessGrantRules(BusinessGrantRules businessGrantRules) {
		this.businessGrantRules = businessGrantRules;
	}

	public String getStudentCompleteAddr() {
		return studentCompleteAddr;
	}

	public void setStudentCompleteAddr(String studentCompleteAddr) {
		this.studentCompleteAddr = studentCompleteAddr;
	}

	public String getTeacherCompleteAddr() {
		return teacherCompleteAddr;
	}

	public void setTeacherCompleteAddr(String teacherCompleteAddr) {
		this.teacherCompleteAddr = teacherCompleteAddr;
	}

	public List<BusinessOrderLog> getBusinessOrderLogList() {
		return businessOrderLogList;
	}

	public void setBusinessOrderLogList(List<BusinessOrderLog> businessOrderLogList) {
		this.businessOrderLogList = businessOrderLogList;
	}

	public List<BusinessOrderServiceTime> getBusinessOrderServiceTimeList() {
		return businessOrderServiceTimeList;
	}

	public void setBusinessOrderServiceTimeList(List<BusinessOrderServiceTime> businessOrderServiceTimeList) {
		this.businessOrderServiceTimeList = businessOrderServiceTimeList;
	}

	public List<BusinessOrderEvaluation> getBusinessOrderEvaluationList() {
		return businessOrderEvaluationList;
	}

	public void setBusinessOrderEvaluationList(List<BusinessOrderEvaluation> businessOrderEvaluationList) {
		this.businessOrderEvaluationList = businessOrderEvaluationList;
	}

	public List<BusinessOrderRefund> getBusinessOrderRefundList() {
		return businessOrderRefundList;
	}

	public void setBusinessOrderRefundList(List<BusinessOrderRefund> businessOrderRefundList) {
		this.businessOrderRefundList = businessOrderRefundList;
	}

	public List<BusinessOrderShare> getBusinessOrderShareList() {
		return businessOrderShareList;
	}

	public void setBusinessOrderShareList(List<BusinessOrderShare> businessOrderShareList) {
		this.businessOrderShareList = businessOrderShareList;
	}

	public List<BusinessOrderPreparation> getBusinessOrderPreparationList() {
		return businessOrderPreparationList;
	}

	public void setBusinessOrderPreparationList(List<BusinessOrderPreparation> businessOrderPreparationList) {
		this.businessOrderPreparationList = businessOrderPreparationList;
	}

	public List<BusinessOrderServicePhoto> getBusinessOrderServicePhotoList() {
		return businessOrderServicePhotoList;
	}

	public void setBusinessOrderServicePhotoList(List<BusinessOrderServicePhoto> businessOrderServicePhotoList) {
		this.businessOrderServicePhotoList = businessOrderServicePhotoList;
	}

}
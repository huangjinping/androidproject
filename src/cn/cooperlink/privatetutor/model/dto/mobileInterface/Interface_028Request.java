package cn.cooperlink.privatetutor.model.dto.mobileInterface;

public class Interface_028Request extends Request {
	private RequestBody body;

	public class RequestBody {
		private String businessOrderId;
		private String studentCompleteAddr;
		private String teacherCompleteAddr;

		public String getBusinessOrderId() {
			return businessOrderId;
		}

		public void setBusinessOrderId(String businessOrderId) {
			this.businessOrderId = businessOrderId;
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

	}

	public RequestBody getBody() {
		return body;
	}

	public void setBody(RequestBody body) {
		this.body = body;
	}

}

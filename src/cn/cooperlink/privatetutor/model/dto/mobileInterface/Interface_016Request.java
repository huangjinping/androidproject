package cn.cooperlink.privatetutor.model.dto.mobileInterface;

import cn.cooperlink.privatetutor.model.BusinessUserStudentQuestion;

public class Interface_016Request extends Request {
	private RequestBody body;

	public class RequestBody {
		private BusinessUserStudentQuestion businessUserStudentQuestion;

		public BusinessUserStudentQuestion getBusinessUserStudentQuestion() {
			return businessUserStudentQuestion;
		}

		public void setBusinessUserStudentQuestion(BusinessUserStudentQuestion businessUserStudentQuestion) {
			this.businessUserStudentQuestion = businessUserStudentQuestion;
		}

	}

	public RequestBody getBody() {
		return body;
	}

	public void setBody(RequestBody body) {
		this.body = body;
	}

}

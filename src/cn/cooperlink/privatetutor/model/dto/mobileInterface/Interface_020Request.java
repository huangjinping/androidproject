package cn.cooperlink.privatetutor.model.dto.mobileInterface;

import cn.cooperlink.privatetutor.model.BusinessUserStudentQuestionAnswer;

public class Interface_020Request extends Request {
	private RequestBody body;

	public class RequestBody {
		private BusinessUserStudentQuestionAnswer businessUserStudentQuestionAnswer;

		public BusinessUserStudentQuestionAnswer getBusinessUserStudentQuestionAnswer() {
			return businessUserStudentQuestionAnswer;
		}

		public void setBusinessUserStudentQuestionAnswer(BusinessUserStudentQuestionAnswer businessUserStudentQuestionAnswer) {
			this.businessUserStudentQuestionAnswer = businessUserStudentQuestionAnswer;
		}

	}

	public RequestBody getBody() {
		return body;
	}

	public void setBody(RequestBody body) {
		this.body = body;
	}

}

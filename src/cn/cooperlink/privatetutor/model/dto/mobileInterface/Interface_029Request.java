package cn.cooperlink.privatetutor.model.dto.mobileInterface;

import cn.cooperlink.privatetutor.model.BusinessOrderEvaluation;

public class Interface_029Request extends Request {
	private RequestBody body;

	public class RequestBody {
		private BusinessOrderEvaluation businessOrderEvaluation;

		public BusinessOrderEvaluation getBusinessOrderEvaluation() {
			return businessOrderEvaluation;
		}

		public void setBusinessOrderEvaluation(BusinessOrderEvaluation businessOrderEvaluation) {
			this.businessOrderEvaluation = businessOrderEvaluation;
		}
	}

	public RequestBody getBody() {
		return body;
	}

	public void setBody(RequestBody body) {
		this.body = body;
	}

}

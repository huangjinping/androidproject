package cn.cooperlink.privatetutor.model.dto.mobileInterface;

import cn.cooperlink.privatetutor.model.BusinessOrderPreparation;

public class Interface_047Request extends Request {
	private RequestBody body;

	public class RequestBody {
		private BusinessOrderPreparation businessOrderPreparation;

		public BusinessOrderPreparation getBusinessOrderPreparation() {
			return businessOrderPreparation;
		}

		public void setBusinessOrderPreparation(BusinessOrderPreparation businessOrderPreparation) {
			this.businessOrderPreparation = businessOrderPreparation;
		}

	}

	public RequestBody getBody() {
		return body;
	}

	public void setBody(RequestBody body) {
		this.body = body;
	}

}

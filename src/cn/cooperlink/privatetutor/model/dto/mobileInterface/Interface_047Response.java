package cn.cooperlink.privatetutor.model.dto.mobileInterface;

import cn.cooperlink.privatetutor.model.BusinessOrderPreparation;

public class Interface_047Response extends Response {
	private ResponseBody body;

	public class ResponseBody {
		private BusinessOrderPreparation businessOrderPreparation;

		public BusinessOrderPreparation getBusinessOrderPreparation() {
			return businessOrderPreparation;
		}

		public void setBusinessOrderPreparation(BusinessOrderPreparation businessOrderPreparation) {
			this.businessOrderPreparation = businessOrderPreparation;
		}

	}

	public ResponseBody getBody() {
		return body;
	}

	public void setBody(ResponseBody body) {
		this.body = body;
	}
}

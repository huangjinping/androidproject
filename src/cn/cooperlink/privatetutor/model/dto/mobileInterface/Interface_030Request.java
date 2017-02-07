package cn.cooperlink.privatetutor.model.dto.mobileInterface;

import cn.cooperlink.privatetutor.model.BusinessOrderShare;

public class Interface_030Request extends Request {
	private RequestBody body;

	public class RequestBody {
		private BusinessOrderShare businessOrderShare;

		public BusinessOrderShare getBusinessOrderShare() {
			return businessOrderShare;
		}

		public void setBusinessOrderShare(BusinessOrderShare businessOrderShare) {
			this.businessOrderShare = businessOrderShare;
		}
	}

	public RequestBody getBody() {
		return body;
	}

	public void setBody(RequestBody body) {
		this.body = body;
	}

}

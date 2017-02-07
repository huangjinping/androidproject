package cn.cooperlink.privatetutor.model.dto.mobileInterface;

import cn.cooperlink.privatetutor.model.BusinessUserAttention;

public class Interface_010Request extends Request {
	private RequestBody body;

	public class RequestBody {
		private BusinessUserAttention businessUserAttention;

		public BusinessUserAttention getBusinessUserAttention() {
			return businessUserAttention;
		}

		public void setBusinessUserAttention(BusinessUserAttention businessUserAttention) {
			this.businessUserAttention = businessUserAttention;
		}

	}

	public RequestBody getBody() {
		return body;
	}

	public void setBody(RequestBody body) {
		this.body = body;
	}

}

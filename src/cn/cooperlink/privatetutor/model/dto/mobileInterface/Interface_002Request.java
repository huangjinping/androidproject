package cn.cooperlink.privatetutor.model.dto.mobileInterface;

import cn.cooperlink.privatetutor.model.BusinessUser;

public class Interface_002Request extends Request {
	private RequestBody body;

	public class RequestBody {
		private BusinessUser businessUser;
		private String verifyCode;

		public BusinessUser getBusinessUser() {
			return businessUser;
		}

		public void setBusinessUser(BusinessUser businessUser) {
			this.businessUser = businessUser;
		}

		public String getVerifyCode() {
			return verifyCode;
		}

		public void setVerifyCode(String verifyCode) {
			this.verifyCode = verifyCode;
		}

	}

	public RequestBody getBody() {
		return body;
	}

	public void setBody(RequestBody body) {
		this.body = body;
	}

}

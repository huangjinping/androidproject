package cn.cooperlink.privatetutor.model.dto.mobileInterface;

import cn.cooperlink.privatetutor.model.BusinessUser;

public class Interface_001Response extends Response {
	private ResponseBody body;

	public class ResponseBody {
		private String tokenId;
		private BusinessUser businessUser;

		public ResponseBody() {
		}

		public String getTokenId() {
			return tokenId;
		}

		public void setTokenId(String tokenId) {
			this.tokenId = tokenId;
		}

		public BusinessUser getBusinessUser() {
			return businessUser;
		}

		public void setBusinessUser(BusinessUser businessUser) {
			this.businessUser = businessUser;
		}

	}

	public ResponseBody getBody() {
		return body;
	}

	public void setBody(ResponseBody body) {
		this.body = body;
	}
}

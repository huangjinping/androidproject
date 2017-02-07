package cn.cooperlink.privatetutor.model.dto.mobileInterface;

import cn.cooperlink.privatetutor.model.BusinessOrderServicePhoto;

public class Interface_046Response extends Response {
	private ResponseBody body;

	public class ResponseBody {
		private BusinessOrderServicePhoto businessOrderServicePhoto;

		public BusinessOrderServicePhoto getBusinessOrderServicePhoto() {
			return businessOrderServicePhoto;
		}

		public void setBusinessOrderServicePhoto(BusinessOrderServicePhoto businessOrderServicePhoto) {
			this.businessOrderServicePhoto = businessOrderServicePhoto;
		}

	}

	public ResponseBody getBody() {
		return body;
	}

	public void setBody(ResponseBody body) {
		this.body = body;
	}
}

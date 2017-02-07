package cn.cooperlink.privatetutor.model.dto.mobileInterface;

import cn.cooperlink.privatetutor.model.BusinessOrderServicePhoto;

public class Interface_046Request extends Request {
	private RequestBody body;

	public class RequestBody {
		private BusinessOrderServicePhoto businessOrderServicePhoto;

		public BusinessOrderServicePhoto getBusinessOrderServicePhoto() {
			return businessOrderServicePhoto;
		}

		public void setBusinessOrderServicePhoto(BusinessOrderServicePhoto businessOrderServicePhoto) {
			this.businessOrderServicePhoto = businessOrderServicePhoto;
		}


	}

	public RequestBody getBody() {
		return body;
	}

	public void setBody(RequestBody body) {
		this.body = body;
	}

}

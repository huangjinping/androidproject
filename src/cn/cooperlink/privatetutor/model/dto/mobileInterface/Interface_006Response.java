package cn.cooperlink.privatetutor.model.dto.mobileInterface;

import cn.cooperlink.privatetutor.model.BusinessUser;
import cn.cooperlink.privatetutor.model.BusinessUserStudent;

public class Interface_006Response extends Response {
	private ResponseBody body;

	public class ResponseBody {
		private BusinessUser businessUser;
		private BusinessUserStudent businessUserStudent;

		public BusinessUser getBusinessUser() {
			return businessUser;
		}

		public void setBusinessUser(BusinessUser businessUser) {
			this.businessUser = businessUser;
		}

		public BusinessUserStudent getBusinessUserStudent() {
			return businessUserStudent;
		}

		public void setBusinessUserStudent(BusinessUserStudent businessUserStudent) {
			this.businessUserStudent = businessUserStudent;
		}

	}

	public ResponseBody getBody() {
		return body;
	}

	public void setBody(ResponseBody body) {
		this.body = body;
	}
}

package cn.cooperlink.privatetutor.model.dto.mobileInterface;

import java.util.List;

import cn.cooperlink.privatetutor.model.BusinessOrder;

public class Interface_025Response extends Response {
	private ResponseBody body;

	public class ResponseBody {
		private List<BusinessOrder> businessOrderList;

		public List<BusinessOrder> getBusinessOrderList() {
			return businessOrderList;
		}

		public void setBusinessOrderList(List<BusinessOrder> businessOrderList) {
			this.businessOrderList = businessOrderList;
		}

	}

	public ResponseBody getBody() {
		return body;
	}

	public void setBody(ResponseBody body) {
		this.body = body;
	}
}

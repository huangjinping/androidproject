package cn.cooperlink.privatetutor.model.dto.mobileInterface;

import java.util.List;

import cn.cooperlink.privatetutor.model.BusinessOrder;
import cn.cooperlink.privatetutor.model.BusinessOrderServiceTime;

public class Interface_023Response extends Response {
	private ResponseBody body;

	public class ResponseBody {
		private BusinessOrder businessOrder;
		private List<BusinessOrderServiceTime> businessOrderServiceTimeList;

		public BusinessOrder getBusinessOrder() {
			return businessOrder;
		}

		public void setBusinessOrder(BusinessOrder businessOrder) {
			this.businessOrder = businessOrder;
		}

		public List<BusinessOrderServiceTime> getBusinessOrderServiceTimeList() {
			return businessOrderServiceTimeList;
		}

		public void setBusinessOrderServiceTimeList(List<BusinessOrderServiceTime> businessOrderServiceTimeList) {
			this.businessOrderServiceTimeList = businessOrderServiceTimeList;
		}

	}

	public ResponseBody getBody() {
		return body;
	}

	public void setBody(ResponseBody body) {
		this.body = body;
	}
}

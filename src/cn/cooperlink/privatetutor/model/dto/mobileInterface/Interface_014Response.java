package cn.cooperlink.privatetutor.model.dto.mobileInterface;

import java.util.List;

import cn.cooperlink.privatetutor.model.BusinessAdvertisement;

public class Interface_014Response extends Response {
	private ResponseBody body;

	public class ResponseBody {
		private List<BusinessAdvertisement> list;

		public List<BusinessAdvertisement> getList() {
			return list;
		}

		public void setList(List<BusinessAdvertisement> list) {
			this.list = list;
		}
	}

	public ResponseBody getBody() {
		return body;
	}

	public void setBody(ResponseBody body) {
		this.body = body;
	}
}

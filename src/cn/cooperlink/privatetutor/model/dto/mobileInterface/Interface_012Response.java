package cn.cooperlink.privatetutor.model.dto.mobileInterface;

import java.util.List;

import cn.cooperlink.privatetutor.model.BusinessUserMessage;

public class Interface_012Response extends Response {
	private ResponseBody body;

	public class ResponseBody {
		private List<BusinessUserMessage> list;

		public List<BusinessUserMessage> getList() {
			return list;
		}

		public void setList(List<BusinessUserMessage> list) {
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

package cn.cooperlink.privatetutor.model.dto.mobileInterface;

import cn.cooperlink.privatetutor.model.BbsTopic;

public class Interface_031Response extends Response {
	private ResponseBody body;

	public class ResponseBody {
		private BbsTopic bbsTopic;

		public BbsTopic getBbsTopic() {
			return bbsTopic;
		}

		public void setBbsTopic(BbsTopic bbsTopic) {
			this.bbsTopic = bbsTopic;
		}

	}

	public ResponseBody getBody() {
		return body;
	}

	public void setBody(ResponseBody body) {
		this.body = body;
	}
}

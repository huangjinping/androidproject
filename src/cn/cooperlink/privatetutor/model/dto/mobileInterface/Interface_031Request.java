package cn.cooperlink.privatetutor.model.dto.mobileInterface;

import cn.cooperlink.privatetutor.model.BbsTopic;

public class Interface_031Request extends Request {
	private RequestBody body;

	public class RequestBody {
		private BbsTopic bbsTopic;

		public BbsTopic getBbsTopic() {
			return bbsTopic;
		}

		public void setBbsTopic(BbsTopic bbsTopic) {
			this.bbsTopic = bbsTopic;
		}

	}

	public RequestBody getBody() {
		return body;
	}

	public void setBody(RequestBody body) {
		this.body = body;
	}

}

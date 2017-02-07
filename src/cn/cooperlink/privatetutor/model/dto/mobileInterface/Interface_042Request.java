package cn.cooperlink.privatetutor.model.dto.mobileInterface;

import cn.cooperlink.privatetutor.model.BbsTopicBrowse;

public class Interface_042Request extends Request {
	private RequestBody body;

	public class RequestBody {
		private BbsTopicBrowse bbsTopicBrowse;

		public BbsTopicBrowse getBbsTopicBrowse() {
			return bbsTopicBrowse;
		}

		public void setBbsTopicBrowse(BbsTopicBrowse bbsTopicBrowse) {
			this.bbsTopicBrowse = bbsTopicBrowse;
		}

	}

	public RequestBody getBody() {
		return body;
	}

	public void setBody(RequestBody body) {
		this.body = body;
	}

}

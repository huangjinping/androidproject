package cn.cooperlink.privatetutor.model.dto.mobileInterface;

import cn.cooperlink.privatetutor.model.BbsTopicPraise;

public class Interface_034Request extends Request {
	private RequestBody body;

	public class RequestBody {
		private BbsTopicPraise bbsTopicPraise;

		public BbsTopicPraise getBbsTopicPraise() {
			return bbsTopicPraise;
		}

		public void setBbsTopicPraise(BbsTopicPraise bbsTopicPraise) {
			this.bbsTopicPraise = bbsTopicPraise;
		}

	}

	public RequestBody getBody() {
		return body;
	}

	public void setBody(RequestBody body) {
		this.body = body;
	}

}

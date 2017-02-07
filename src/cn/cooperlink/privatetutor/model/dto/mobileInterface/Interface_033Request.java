package cn.cooperlink.privatetutor.model.dto.mobileInterface;

import cn.cooperlink.privatetutor.model.BbsTopicAnswer;

public class Interface_033Request extends Request {
	private RequestBody body;

	public class RequestBody {
		private BbsTopicAnswer bbsTopicAnswer;

		public BbsTopicAnswer getBbsTopicAnswer() {
			return bbsTopicAnswer;
		}

		public void setBbsTopicAnswer(BbsTopicAnswer bbsTopicAnswer) {
			this.bbsTopicAnswer = bbsTopicAnswer;
		}

	}

	public RequestBody getBody() {
		return body;
	}

	public void setBody(RequestBody body) {
		this.body = body;
	}

}

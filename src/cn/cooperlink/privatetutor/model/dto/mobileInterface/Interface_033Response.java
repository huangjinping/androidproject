package cn.cooperlink.privatetutor.model.dto.mobileInterface;

import cn.cooperlink.privatetutor.model.BbsTopicAnswer;

public class Interface_033Response extends Response {
	private ResponseBody body;

	public class ResponseBody {
		private BbsTopicAnswer bbsTopicAnswer;

		public BbsTopicAnswer getBbsTopicAnswer() {
			return bbsTopicAnswer;
		}

		public void setBbsTopicAnswer(BbsTopicAnswer bbsTopicAnswer) {
			this.bbsTopicAnswer = bbsTopicAnswer;
		}

	}

	public ResponseBody getBody() {
		return body;
	}

	public void setBody(ResponseBody body) {
		this.body = body;
	}
}

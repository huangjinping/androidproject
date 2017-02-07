package cn.cooperlink.privatetutor.model.dto.mobileInterface;

import cn.cooperlink.privatetutor.model.BbsTopicBrowse;
import cn.cooperlink.privatetutor.model.BusinessUserStudentQuestionBrowse;

public class Interface_042Response extends Response {
	private ResponseBody body;

	public class ResponseBody {
		private BbsTopicBrowse bbsTopicBrowse;

		public BbsTopicBrowse getBbsTopicBrowse() {
			return bbsTopicBrowse;
		}

		public void setBbsTopicBrowse(BbsTopicBrowse bbsTopicBrowse) {
			this.bbsTopicBrowse = bbsTopicBrowse;
		}

	}

	public ResponseBody getBody() {
		return body;
	}

	public void setBody(ResponseBody body) {
		this.body = body;
	}
}

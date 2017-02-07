package cn.cooperlink.privatetutor.model.dto.mobileInterface;

import java.util.List;

import cn.cooperlink.privatetutor.model.BasicSubject;

public class Interface_038Response extends Response {
	private ResponseBody body;

	public class ResponseBody {
		List<BasicSubject> list;

		public List<BasicSubject> getList() {
			return list;
		}

		public void setList(List<BasicSubject> list) {
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

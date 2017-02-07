package cn.cooperlink.privatetutor.model.dto.mobileInterface;

public class Interface_038Request extends Request {
	private RequestBody body;

	public class RequestBody {
		/** 类型：1-小学；2-小升初；3-初中；4-中考；5-高中；6-高考；7-特色课程 */
		private String type;

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

	}

	public RequestBody getBody() {
		return body;
	}

	public void setBody(RequestBody body) {
		this.body = body;
	}

}

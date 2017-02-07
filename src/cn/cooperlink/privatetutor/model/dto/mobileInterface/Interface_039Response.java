package cn.cooperlink.privatetutor.model.dto.mobileInterface;

public class Interface_039Response extends Response {
	private ResponseBody body;

	public class ResponseBody {
		private String photoContent;

		public String getPhotoContent() {
			return photoContent;
		}

		public void setPhotoContent(String photoContent) {
			this.photoContent = photoContent;
		}

	}

	public ResponseBody getBody() {
		return body;
	}

	public void setBody(ResponseBody body) {
		this.body = body;
	}
}

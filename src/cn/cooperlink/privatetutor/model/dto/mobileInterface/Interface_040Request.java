package cn.cooperlink.privatetutor.model.dto.mobileInterface;

public class Interface_040Request extends Request {
	private RequestBody body;

	public class RequestBody {
		private String photoName;
		private String photoContent;

		public String getPhotoName() {
			return photoName;
		}

		public void setPhotoName(String photoName) {
			this.photoName = photoName;
		}

		public String getPhotoContent() {
			return photoContent;
		}

		public void setPhotoContent(String photoContent) {
			this.photoContent = photoContent;
		}

	}

	public RequestBody getBody() {
		return body;
	}

	public void setBody(RequestBody body) {
		this.body = body;
	}

}

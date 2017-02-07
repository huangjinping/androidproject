package cn.cooperlink.privatetutor.model.dto.mobileInterface;

public class Interface_039Request extends Request {
	private RequestBody body;

	public class RequestBody {
		private String photoPath;

		public String getPhotoPath() {
			return photoPath;
		}

		public void setPhotoPath(String photoPath) {
			this.photoPath = photoPath;
		}

	}

	public RequestBody getBody() {
		return body;
	}

	public void setBody(RequestBody body) {
		this.body = body;
	}

}

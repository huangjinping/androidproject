package cn.cooperlink.privatetutor.model.dto.mobileInterface;

public class Interface_027Request extends Request {
	private RequestBody body;

	public class RequestBody {
		private String businessOrderId;

		public String getBusinessOrderId() {
			return businessOrderId;
		}

		public void setBusinessOrderId(String businessOrderId) {
			this.businessOrderId = businessOrderId;
		}

	}

	public RequestBody getBody() {
		return body;
	}

	public void setBody(RequestBody body) {
		this.body = body;
	}

}

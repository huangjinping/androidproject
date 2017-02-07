package cn.cooperlink.privatetutor.model.dto.mobileInterface;

public class Interface_036Request extends Request {
	private RequestBody body;

	public class RequestBody {
		private Integer areaId;
		/** 4:大学，5:高中，6:初中，7:技校 */
		private String type;

		public Integer getAreaId() {
			return areaId;
		}

		public void setAreaId(Integer areaId) {
			this.areaId = areaId;
		}

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

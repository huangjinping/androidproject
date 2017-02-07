package cn.cooperlink.privatetutor.model.dto.mobileInterface;

import cn.cooperlink.privatetutor.model.dto.QueryConditionDTO;

public class Interface_021Request extends Request {
	private RequestBody body;

	public class RequestBody {
		private QueryConditionDTO queryConditionDTO;

		public QueryConditionDTO getQueryConditionDTO() {
			return queryConditionDTO;
		}

		public void setQueryConditionDTO(QueryConditionDTO queryConditionDTO) {
			this.queryConditionDTO = queryConditionDTO;
		}

	}

	public RequestBody getBody() {
		return body;
	}

	public void setBody(RequestBody body) {
		this.body = body;
	}

}

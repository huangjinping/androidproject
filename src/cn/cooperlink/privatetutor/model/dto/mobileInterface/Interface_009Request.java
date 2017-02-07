package cn.cooperlink.privatetutor.model.dto.mobileInterface;

import java.util.List;

import cn.cooperlink.privatetutor.model.BusinessUserTeacher;
import cn.cooperlink.privatetutor.model.BusinessUserTeacherServiceArea;
import cn.cooperlink.privatetutor.model.BusinessUserTeacherServiceTime;
import cn.cooperlink.privatetutor.model.BusinessUserTeacherSubject;

public class Interface_009Request extends Request {
	private RequestBody body;

	public class RequestBody {
		private BusinessUserTeacher businessUserTeacher;
		private List<BusinessUserTeacherSubject> businessUserTeacherSubjectList;
		private List<BusinessUserTeacherServiceArea> businessUserTeacherServiceAreaList;
		private List<BusinessUserTeacherServiceTime> businessUserTeacherServiceTimeList;

		public BusinessUserTeacher getBusinessUserTeacher() {
			return businessUserTeacher;
		}

		public void setBusinessUserTeacher(BusinessUserTeacher businessUserTeacher) {
			this.businessUserTeacher = businessUserTeacher;
		}

		public List<BusinessUserTeacherSubject> getBusinessUserTeacherSubjectList() {
			return businessUserTeacherSubjectList;
		}

		public void setBusinessUserTeacherSubjectList(List<BusinessUserTeacherSubject> businessUserTeacherSubjectList) {
			this.businessUserTeacherSubjectList = businessUserTeacherSubjectList;
		}

		public List<BusinessUserTeacherServiceArea> getBusinessUserTeacherServiceAreaList() {
			return businessUserTeacherServiceAreaList;
		}

		public void setBusinessUserTeacherServiceAreaList(List<BusinessUserTeacherServiceArea> businessUserTeacherServiceAreaList) {
			this.businessUserTeacherServiceAreaList = businessUserTeacherServiceAreaList;
		}

		public List<BusinessUserTeacherServiceTime> getBusinessUserTeacherServiceTimeList() {
			return businessUserTeacherServiceTimeList;
		}

		public void setBusinessUserTeacherServiceTimeList(List<BusinessUserTeacherServiceTime> businessUserTeacherServiceTimeList) {
			this.businessUserTeacherServiceTimeList = businessUserTeacherServiceTimeList;
		}

	}

	public RequestBody getBody() {
		return body;
	}

	public void setBody(RequestBody body) {
		this.body = body;
	}

}

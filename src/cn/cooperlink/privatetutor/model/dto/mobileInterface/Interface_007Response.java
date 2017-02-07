package cn.cooperlink.privatetutor.model.dto.mobileInterface;

import java.util.List;

import cn.cooperlink.privatetutor.model.BusinessUser;
import cn.cooperlink.privatetutor.model.BusinessUserTeacher;
import cn.cooperlink.privatetutor.model.BusinessUserTeacherServiceArea;
import cn.cooperlink.privatetutor.model.BusinessUserTeacherServiceTime;
import cn.cooperlink.privatetutor.model.BusinessUserTeacherSubject;

public class Interface_007Response extends Response {
	private ResponseBody body;

	public class ResponseBody {
		private BusinessUser businessUser;
		private BusinessUserTeacher businessUserTeacher;
		private List<BusinessUserTeacherSubject> businessUserTeacherSubjectList;
		private List<BusinessUserTeacherServiceArea> businessUserTeacherServiceAreaList;
		private List<BusinessUserTeacherServiceTime> businessUserTeacherServiceTimeList;

		public BusinessUser getBusinessUser() {
			return businessUser;
		}

		public void setBusinessUser(BusinessUser businessUser) {
			this.businessUser = businessUser;
		}

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

	public ResponseBody getBody() {
		return body;
	}

	public void setBody(ResponseBody body) {
		this.body = body;
	}
}

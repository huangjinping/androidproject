/** 
 * Project Name：androidproject 
 * File Name：StudentsActivity.java 
 * Package Name：cn.cooperlink.privatetutor.students 
 * Date：2015年7月24日 下午1:35:49 
 * Copyright (c) 2015, cooperlink.cn All Rights Reserved. 
 * 北京酷博灵科信息技术有限公司
 */
package cn.cooperlink.privatetutor.students.activity;

import java.text.BreakIterator;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import cn.cooperlink.privatetutor.R;
import cn.cooperlink.privatetutor.base.BaseActivity;
import cn.cooperlink.privatetutor.model.dto.mobileInterface.Interface_003Request;
import cn.cooperlink.privatetutor.model.dto.mobileInterface.Interface_003Request.RequestBody;
import cn.cooperlink.privatetutor.model.dto.mobileInterface.Interface_006Response;
import cn.cooperlink.privatetutor.model.dto.mobileInterface.RequestHead;
import cn.cooperlink.privatetutor.net.OnRequestDataListener;
import cn.cooperlink.privatetutor.utils.JacksonJsonUtil;
import cn.cooperlink.privatetutor.utils.StringUtils;
import cn.cooperlink.privatetutor.utils.UserManager;

/**
 * @Title：
 * @Description：
 * @Package cn.cooperlink.privatetutor.students
 * @ClassName StudentsActivity
 * @author harrishuang
 * @date 2015年7月24日 下午1:35:49
 * @version
 */
public class StudentsActivity extends BaseActivity {

	private RadioGroup rag_sex;
	private RadioButton btn_sex_man;
	private RadioButton btn_sex_women;

	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		setContentView(R.layout.activity_students);
		initView();
		loadData();
		setOnLiteners();
	}

	/**
	 * @Title: initView
	 * @Description:初始化View
	 */
	private void initView() {
		btn_sex_man = (RadioButton) findViewById(R.id.btn_sex_man);
		btn_sex_women = (RadioButton) findViewById(R.id.btn_sex_women);
		rag_sex = (RadioGroup) findViewById(R.id.rag_sex);
		btn_sex_man.setChecked(true);
		changeCheck(R.id.btn_sex_man);
	}

	/**
	 * @Title: setOnLiteners
	 * @Description:设置监听器
	 */

	private void setOnLiteners() {
		rag_sex.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				changeCheck(checkedId);
			}
		});
	}

	private void changeCheck(int checkedId) {
		switch (checkedId) {
		case R.id.btn_sex_man:
			btn_sex_man.setTextColor(getResources().getColor(
					R.color.segment_chacked));
			btn_sex_women.setTextColor(getResources().getColor(
					R.color.details_body));
			break;
		case R.id.btn_sex_women:
			btn_sex_man.setTextColor(getResources().getColor(
					R.color.details_body));
			btn_sex_women.setTextColor(getResources().getColor(
					R.color.segment_chacked));
			break;
		}
	}

	private void submitStudents() {

	}

	private void getStusentsMessage() {
		// getJsonDada
	}

	/**
	 * @Title: loadData
	 * @Description:
	 */

	private void loadData() {
		showProgress("");
		request(this, getJsonDada(), new OnRequestDataListener() {

			@Override
			public void onSuccess(String result) {
				dismissProgress();
				try {
					Interface_006Response jsonToBean = (Interface_006Response) JacksonJsonUtil
							.jsonToBean(result, Interface_006Response.class);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			@Override
			public void onFail(String eirr) {
				dismissProgress();
			}
		});

	}

	private String getJsonDada() {
		try {
			Interface_003Request request = new Interface_003Request();
			RequestHead requestHead = new RequestHead();
			RequestBody requestBody = request.new RequestBody();
			request.setHead(requestHead);
			request.setBody(requestBody);
			requestHead.setInterfaceCode("interface_006");
			requestHead.setTokenId(UserManager.getUser(this).getBody()
					.getTokenId());
			requestHead.setUuid(StringUtils.getUUID());
			String beanToJson = JacksonJsonUtil.beanToJson(request);
			return beanToJson;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}

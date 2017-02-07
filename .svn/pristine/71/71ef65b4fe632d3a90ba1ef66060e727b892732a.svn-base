/** 
 * Project Name：androidproject 
 * File Name：AskQuestionsActivity.java 
 * Package Name：cn.cooperlink.privatetutor.questions 
 * Date：2015年7月26日 下午9:38:20 
 * Copyright (c) 2015, cooperlink.cn All Rights Reserved. 
 * 北京酷博灵科信息技术有限公司
 */
package cn.cooperlink.privatetutor.questions;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import cn.cooperlink.privatetutor.R;
import cn.cooperlink.privatetutor.base.BaseActivity;
import cn.cooperlink.privatetutor.model.BusinessUserStudentQuestion;
import cn.cooperlink.privatetutor.model.dto.mobileInterface.Interface_016Request;
import cn.cooperlink.privatetutor.model.dto.mobileInterface.Interface_016Request.RequestBody;
import cn.cooperlink.privatetutor.model.dto.mobileInterface.RequestHead;
import cn.cooperlink.privatetutor.net.OnRequestDataListener;
import cn.cooperlink.privatetutor.utils.JacksonJsonUtil;
import cn.cooperlink.privatetutor.utils.StringUtils;
import cn.cooperlink.privatetutor.utils.UserManager;

/**
 * @Title：
 * @Description：
 * @Package cn.cooperlink.privatetutor.questions
 * @ClassName AskQuestionsActivity
 * @author harrishuang   
 * @date 2015年7月26日 下午9:38:20
 * @version 
 */
public class AskQuestionsActivity   extends BaseActivity{
	
	private  TextView  txt_askquestions_num;
	private  EditText  edt_askquestions_content;
	private EditText  edt_askquestions_title;
	
	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		setContentView(R.layout.activity_askquestions);
		initView();
		setOnListenrs();
	}
	private void initView() {
		txt_askquestions_num=(TextView)findViewById(R.id.txt_askquestions_num);
		edt_askquestions_content=(EditText)findViewById(R.id.edt_askquestions_content);
		edt_askquestions_title=(EditText)findViewById(R.id.edt_askquestions_title);
	}
	
	
	
	
	
	private void setOnListenrs() {
edt_askquestions_content.addTextChangedListener(new TextWatcher() {
			
			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				int  num=150-edt_askquestions_content.getText().length();
				txt_askquestions_num.setText(num+"");
			}
			
			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				
				
				
				
			}
			
			@Override
			public void afterTextChanged(Editable s) {
				
			}
		});
	}
	/**
	 * @Title: onSubmit
	 * @Description:提交问题
	 * @param v
	 */
	public void onSubmit(View  v) {
		
		if (TextUtils.isEmpty(edt_askquestions_title.getText().toString())) {
			showAlert("请输入问题标题");
			return;
		}
		
		if (TextUtils.isEmpty(edt_askquestions_content.getText().toString())) {
			showAlert("请输入问题信息");
			return;
		}
		showProgress("");
		request(this, getJsonDada(), new OnRequestDataListener() {
			@Override
			public void onSuccess(String result) {
           dismissProgress();				
           AskQuestionsActivity.this.finish();
			}
			
			@Override
			public void onFail(String eirr) {
				   dismissProgress();						
			}
		});
	}
	
	
	private String  getJsonDada() {
		try {
			Interface_016Request request = new Interface_016Request();
			RequestHead requestHead = new RequestHead();
			RequestBody requestBody = request.new RequestBody();
			BusinessUserStudentQuestion businessUserStudentQuestion = new BusinessUserStudentQuestion();
			request.setHead(requestHead);
			request.setBody(requestBody);
			requestBody.setBusinessUserStudentQuestion(businessUserStudentQuestion);
			businessUserStudentQuestion.setBusinessUserStudentId(UserManager.getUser(this).getBody().getBusinessUser().getId());
			businessUserStudentQuestion.setTitle(edt_askquestions_title.getText().toString());
			businessUserStudentQuestion.setContent(edt_askquestions_content.getText().toString());
			requestHead.setInterfaceCode("interface_016");
			requestHead.setTokenId(UserManager.getUser(this).getBody().getTokenId());
			requestHead.setUuid(StringUtils.getUUID());
			String beanToJson = JacksonJsonUtil.beanToJson(request);
			return beanToJson;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}

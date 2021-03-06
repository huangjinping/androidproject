/** 
 * Project Name：privateTutor 
 * File Name：LoginActivity.java 
 * Package Name：cn.cooperlink.privatetutor.login.activity 
 * Date：2015年7月18日 下午11:28:08 
 * Copyright (c) 2015, cooperlink.cn All Rights Reserved. 
 * 北京酷博灵科信息技术有限公司
 */
package cn.cooperlink.privatetutor.login.activity;

import java.util.UUID;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import cn.cooperlink.privatetutor.R;
import cn.cooperlink.privatetutor.base.BaseActivity;
import cn.cooperlink.privatetutor.main.activity.IndexActivity;
import cn.cooperlink.privatetutor.model.dto.mobileInterface.Interface_001Request;
import cn.cooperlink.privatetutor.model.dto.mobileInterface.Interface_001Request.RequestBody;
import cn.cooperlink.privatetutor.model.dto.mobileInterface.Interface_001Response;
import cn.cooperlink.privatetutor.model.dto.mobileInterface.RequestHead;
import cn.cooperlink.privatetutor.net.OnRequestDataListener;
import cn.cooperlink.privatetutor.utils.JacksonJsonUtil;
import cn.cooperlink.privatetutor.utils.UserManager;

/**
 * @Title：登录
 * @Description：
 * @Package cn.cooperlink.privatetutor.login.activity
 * @ClassName LoginActivity
 * @author harrishuang
 * @date 2015年7月18日 下午11:28:08
 * @version
 */
public class LoginActivity extends BaseActivity {
	private TextView txt_login_register;
   private   EditText  edt_login_phone;
   private  EditText  edt_login_password;
   
	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		setContentView(R.layout.activity_login);
		initView();
		setOnListeners();
	}

	/**
	 * @Title: setOnListeners
	 * @Description：设置监听器
	 */

	private void setOnListeners() {
		txt_login_register.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
				Intent intent = new Intent(LoginActivity.this,
						RegisterActivity.class);
				startActivity(intent);
			}
		});
	}

	private void login(String name, String password) {
		showProgress("");
		
	   request(this,loginJsonData(name, password), new OnRequestDataListener() {
		@Override
		public void onSuccess(String result) {
			dismissProgress();
			try {

				Interface_001Response  body=		(Interface_001Response) JacksonJsonUtil.jsonToBean(result, Interface_001Response.class);
				System.out.println("----->>>"+body.toString());
				UserManager.saveUser(LoginActivity.this,body);
				 Interface_001Response user = UserManager.getUser(LoginActivity.this);
				System.out.println("----"+user.toString());
			
				Intent intent = new Intent(LoginActivity.this,
						IndexActivity.class);
				startActivity(intent);

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

	/**
	 * @Title: onSubmit
	 * @Description:提交数据
	 */

	public void onSubmit(View v) {
	
		if (!checkInput()) {
			return;
		}
	
		login(edt_login_phone.getText().toString(), edt_login_password.getText().toString());

	}

	/**
	 * @Title: initView
	 * @Description:设置View
	 */

	private void initView() {
		edt_login_password=(EditText)findViewById(R.id.edt_login_password);
		edt_login_phone=(EditText)findViewById(R.id.edt_login_phone);
		txt_login_register = (TextView) findViewById(R.id.txt_login_register);
		txt_login_register.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
		txt_login_register.getPaint().setAntiAlias(true);
		
		
	}
	
	  private boolean  checkInput() {
		if (TextUtils.isEmpty(edt_login_phone.getText().toString())) {
			showToast("请输入手机号");
			return  false;
		}
	if (TextUtils.isEmpty(edt_login_password.getText().toString())) {
			showToast("请输入密码");
		return  false;
		}
		return true;
	}
	

	private String loginJsonData(String userName, String password) {
		Interface_001Request request = new Interface_001Request();
		RequestHead requestHead = new RequestHead();
		RequestBody requestBody = request.new RequestBody();
		request.setHead(requestHead);
		request.setBody(requestBody);
		requestHead.setUuid(UUID.randomUUID().toString());
		requestHead.setInterfaceCode("interface_001");
		requestBody.setLoginName(userName);
		requestBody.setPassword(password);
		try {
			String beanToJson = JacksonJsonUtil.beanToJson(request);
			return beanToJson;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}

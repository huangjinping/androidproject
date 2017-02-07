/** 
 * Project Name：androidproject 
 * File Name：ChangePasswordActivity.java 
 * Package Name：cn.cooperlink.privatetutor.login.activity 
 * Date：2015年7月23日 下午4:50:05 
 * Copyright (c) 2015, cooperlink.cn All Rights Reserved. 
 * 北京酷博灵科信息技术有限公司
 */
package cn.cooperlink.privatetutor.login.activity;

import java.util.UUID;

import net.tsz.afinal.http.RetryHandler;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import cn.cooperlink.privatetutor.R;
import cn.cooperlink.privatetutor.base.BaseActivity;
import cn.cooperlink.privatetutor.model.dto.mobileInterface.Interface_003Request;
import cn.cooperlink.privatetutor.model.dto.mobileInterface.Interface_003Request.RequestBody;
import cn.cooperlink.privatetutor.model.dto.mobileInterface.RequestHead;
import cn.cooperlink.privatetutor.net.OnRequestDataListener;
import cn.cooperlink.privatetutor.utils.JacksonJsonUtil;
import cn.cooperlink.privatetutor.utils.StringUtils;
import cn.cooperlink.privatetutor.utils.UserManager;

/**
 * @Title：
 * @Description：
 * @Package cn.cooperlink.privatetutor.login.activity
 * @ClassName ChangePasswordActivity
 * @author harrishuang
 * @date 2015年7月23日 下午4:50:05
 * @version
 */
public class ChangePasswordActivity extends BaseActivity {
	
	
	private  EditText  edt_change_old;
	private EditText   edt_change_new;
	private EditText   edt_change_confirm;

	 
	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		setContentView(R.layout.activity_changepassword);
		initView();
	}
    private void initView() {
    	edt_change_old=(EditText)findViewById(R.id.edt_change_old);
    	edt_change_new=(EditText)findViewById(R.id.edt_change_new);
    	edt_change_confirm=(EditText)findViewById(R.id.edt_change_confirm);

	}
	
    
     private boolean  checkInput() {

    	    if (TextUtils.isEmpty(edt_change_old.getText().toString())) {
    	    	showToast("请填写原密码");
    	    	return false;
			}
    	    if (TextUtils.isEmpty(edt_change_new.getText().toString())) {
    	    	showToast("请填写新密码");
    	    	return false;
			}  if (TextUtils.isEmpty(edt_change_confirm.getText().toString())) {
    	    	showToast("请填写确认密码");
    	    	return false;
			}
    	    return  true;
	}
	
	
	public void onSubmit(View v) {

		
		if (!checkInput()) {
			return;
		}
		showProgress("");
		request(this, getChangeJsonDada(), new OnRequestDataListener() {
			
			@Override
			public void onSuccess(String result) {
				dismissProgress();
				Intent intent=new Intent(ChangePasswordActivity.this, LoginActivity.class);
				intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
			}
			
			@Override
			public void onFail(String eirr) {
				dismissProgress();

			}
		});
	}
	
	
	
	private String  getChangeJsonDada() {
		try {
		Interface_003Request request = new Interface_003Request();
		RequestHead requestHead = new RequestHead();
		RequestBody requestBody = request.new RequestBody();
		request.setHead(requestHead);
		request.setBody(requestBody);
		requestHead.setUuid(UUID.randomUUID().toString());
		requestBody.setOldPassword(edt_change_old.getText().toString());
		requestBody.setNewPassword(edt_change_new.getText().toString());
		requestBody.setConfirmNewPassword(edt_change_confirm.getText().toString());
		requestHead.setInterfaceCode("interface_003");
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

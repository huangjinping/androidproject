/** 
 * Project Name：privateTutor 
 * File Name：RegisterFragment.java 
 * Package Name：cn.cooperlink.privatetutor.login.fragment 
 * Date：2015年7月18日 下午8:09:05 
 * Copyright (c) 2015, cooperlink.cn All Rights Reserved. 
 * 北京酷博灵科信息技术有限公司
 */
package cn.cooperlink.privatetutor.login.fragment;

import java.util.UUID;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import cn.cooperlink.privatetutor.R;
import cn.cooperlink.privatetutor.base.BaseFragment;
import cn.cooperlink.privatetutor.login.common.TimeCount;
import cn.cooperlink.privatetutor.model.BusinessUser;
import cn.cooperlink.privatetutor.model.BusinessVerifyCode;
import cn.cooperlink.privatetutor.model.dto.mobileInterface.Interface_002Request;
import cn.cooperlink.privatetutor.model.dto.mobileInterface.Interface_002Response;
import cn.cooperlink.privatetutor.model.dto.mobileInterface.Interface_005Request;
import cn.cooperlink.privatetutor.model.dto.mobileInterface.Interface_005Request.RequestBody;
import cn.cooperlink.privatetutor.model.dto.mobileInterface.Interface_005Response;
import cn.cooperlink.privatetutor.model.dto.mobileInterface.RequestHead;
import cn.cooperlink.privatetutor.net.OnRequestDataListener;
import cn.cooperlink.privatetutor.utils.JacksonJsonUtil;
import cn.cooperlink.privatetutor.utils.StringUtils;
import cn.cooperlink.privatetutor.utils.Validator;

/**
 * @Title：注册碎片
 * @Description：
 * @Package cn.cooperlink.privatetutor.login.fragment
 * @ClassName RegisterFragment
 * @author harrishuang
 * @date 2015年7月18日 下午8:09:05
 * @version
 */
public class RegisterFragment extends BaseFragment {

	private EditText edt_register_phone;
	private Button btn_verification_code;
	private EditText edt_verification_code;
	private EditText edt_register_password;
	private EditText edt_confirm_password;
	private Button btn_submit;
	private TimeCount timeCount;
	private String type;
	private BusinessVerifyCode businessVerifyCode;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_register, container,
				false);
		type = getArguments().getString("type", "0");
		initView(view);
		setOnLiteners();
		return view;
	}

	/**
	 * @Title: initView
	 * @Description:设置属性
	 * @param v
	 */

	private void initView(View v) {
		edt_register_phone = (EditText) v.findViewById(R.id.edt_register_phone);
		btn_verification_code = (Button) v
				.findViewById(R.id.btn_verification_code);
		edt_verification_code = (EditText) v
				.findViewById(R.id.edt_verification_code);
		edt_register_password = (EditText) v
				.findViewById(R.id.edt_register_password);
		edt_confirm_password = (EditText) v
				.findViewById(R.id.edt_confirm_password);
		btn_submit = (Button) v.findViewById(R.id.btn_submit);
		timeCount = new TimeCount(60 * 1000, 1000, btn_verification_code);

	}

	/**
	 * @Title: checkInput
	 * @Description:输入框
	 * @return
	 */

	private boolean checkInput() {
		String phone = edt_register_phone.getText().toString();
		if (TextUtils.isEmpty(phone)) {
			showToast("请输入电话号码");
			return false;
		}
		if (!Validator.validateMobile(phone)) {
			showToast("手机号码不正确");
			return false;
		}
		String verification = edt_verification_code.getText().toString();
		if (TextUtils.isEmpty(verification)) {
			showToast("验证码不能为空");
			return false;
		}

		if (businessVerifyCode == null
				|| !businessVerifyCode.getCode().equals(verification)) {
			showToast("验证码不正确");
			return false;

		}

		String password = edt_register_password.getText().toString();

		if (TextUtils.isEmpty(password)) {
			showToast("请输入密码");
			return false;
		}
		if (!Validator.validatePassword(password)) {
			showToast("密码为6-20数字或字母");
			return false;

		}
		String confirm_password = edt_confirm_password.getText().toString();

		if (TextUtils.isEmpty(confirm_password)) {
			showToast("请输入确认密码");
			return false;
		}
		if (!confirm_password.equals(password)) {
			showToast("确认密码与新密码不相同");
			return false;
		}
		return true;
	}

	/**
	 * @Title: setOnLiteners
	 * @Description:设置监听器
	 */

	private void setOnLiteners() {
		btn_verification_code.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String phone = edt_register_phone.getText().toString();
				if (TextUtils.isEmpty(phone)) {
					showToast("请输入电话号码");
					return;
				}
				if (!Validator.validateMobile(phone)) {
					showToast("手机号码不正确");
					return;
				}
				showProgress("");
				request(getActivity(), getVerificationData(type, phone),
						new OnRequestDataListener() {
							@Override
							public void onSuccess(String result) {
								timeCount.start();
								dismissProgress();

								try {
									Interface_005Response jsonToBean = (Interface_005Response) JacksonJsonUtil
											.jsonToBean(result,
													Interface_005Response.class);
									businessVerifyCode = jsonToBean.getBody()
											.getBusinessVerifyCode();
								showToast(businessVerifyCode.getCode());
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
		});

		btn_submit.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				submitRegister();
			}
		});
	}

	private void submitRegister() {

		if (!checkInput()) {
			return;
		}
		showProgress(null);
		request(getActivity(), getRequestData(), new OnRequestDataListener() {

			@Override
			public void onSuccess(String result) {
				 dismissProgress();
				try {
					Interface_002Response jsonToBean = (Interface_002Response) JacksonJsonUtil.jsonToBean(result, Interface_002Response.class) ;
					
				
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
	 * @Title: getRequestData
	 * @Description:获取数据
	 * @return
	 */
	private String getRequestData() {

		Interface_002Request request = new Interface_002Request();
		RequestHead requestHead = new RequestHead();
		cn.cooperlink.privatetutor.model.dto.mobileInterface.Interface_002Request.RequestBody requestBody = request.new RequestBody();
		BusinessUser businessUser = new BusinessUser();
		businessUser.setLoginName(edt_register_phone.getText().toString());
		businessUser.setPassword(edt_register_password.getText().toString());
		businessUser.setConfirmNewPassword(edt_confirm_password.getText()
				.toString());
		businessUser.setType(type);

		request.setHead(requestHead);
		request.setBody(requestBody);
		requestBody.setBusinessUser(businessUser);
		requestBody.setVerifyCode(edt_verification_code.getText().toString());

		requestHead.setInterfaceCode("interface_002");
		requestHead.setUuid(StringUtils.getUUID());
		try {
			String beanToJson = JacksonJsonUtil.beanToJson(request);
			return beanToJson;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * @Title: loginVerificationData
	 * @Description:
	 */

	private String getVerificationData(String type, String phone) {
		Interface_005Request request = new Interface_005Request();
		RequestHead requestHead = new RequestHead();
		RequestBody requestBody = request.new RequestBody();
		BusinessVerifyCode businessVerifyCode = new BusinessVerifyCode();
		businessVerifyCode.setPhoneNumber(phone);
		businessVerifyCode.setType(type);
		request.setHead(requestHead);
		request.setBody(requestBody);
		requestBody.setBusinessVerifyCode(businessVerifyCode);
		requestHead.setInterfaceCode("interface_005");
		requestHead.setUuid(UUID.randomUUID().toString());
		try {
			String beanToJson = JacksonJsonUtil.beanToJson(request);
			return beanToJson;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}

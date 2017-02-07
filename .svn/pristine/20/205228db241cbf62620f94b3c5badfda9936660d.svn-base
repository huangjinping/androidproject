/** 
 * Project Name：androidproject 
 * File Name：SettingFragment.java 
 * Package Name：cn.cooperlink.privatetutor.main.fragment 
 * Date：2015年7月23日 下午2:59:41 
 * Copyright (c) 2015, cooperlink.cn All Rights Reserved. 
 * 北京酷博灵科信息技术有限公司
 */
package cn.cooperlink.privatetutor.main.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import cn.cooperlink.privatetutor.R;
import cn.cooperlink.privatetutor.base.BaseFragment;
import cn.cooperlink.privatetutor.login.activity.ChangePasswordActivity;
import cn.cooperlink.privatetutor.login.activity.LoginActivity;
import cn.cooperlink.privatetutor.main.activity.IntegralActivity;
import cn.cooperlink.privatetutor.main.activity.ShareActivity;
import cn.cooperlink.privatetutor.students.activity.StudentsActivity;

/**
 * @Title：设置界面
 * @Description：
 * @Package cn.cooperlink.privatetutor.main.fragment
 * @ClassName SettingFragment
 * @author harrishuang
 * @date 2015年7月23日 下午2:59:41
 * @version
 */
public class SettingFragment extends BaseFragment {

	private ImageView img_setting_icon;
	private LinearLayout layout_integral;
	private LinearLayout layout_students;
	private LinearLayout layout_change;
	private LinearLayout layout_shared;
	private LinearLayout layout_logout;

	private void initView(View v) {
		img_setting_icon = (ImageView) v.findViewById(R.id.img_setting_icon);
		layout_integral = (LinearLayout) v.findViewById(R.id.layout_integral);
		layout_students = (LinearLayout) v.findViewById(R.id.layout_students);
		layout_change = (LinearLayout) v.findViewById(R.id.layout_change);
		layout_shared = (LinearLayout) v.findViewById(R.id.layout_shared);
		layout_logout = (LinearLayout) v.findViewById(R.id.layout_logout);
		
		layout_integral.setOnClickListener(new onSettingClickLitner());
		layout_students.setOnClickListener(new onSettingClickLitner());
		layout_change.setOnClickListener(new onSettingClickLitner());
		layout_shared.setOnClickListener(new onSettingClickLitner());
		layout_logout.setOnClickListener(new onSettingClickLitner());

	}

	private class onSettingClickLitner implements OnClickListener {

		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.layout_integral:
				Intent intentIntegral=new Intent(getActivity(), IntegralActivity.class);
				startActivity(intentIntegral);
				break;
			case R.id.layout_students:
				Intent intentStudents=new Intent(getActivity(), StudentsActivity.class);
				startActivity(intentStudents);
				
				break;
			case R.id.layout_change:
				Intent intent=new Intent(getActivity(), ChangePasswordActivity.class);
				startActivity(intent);
				break;
			case R.id.layout_shared:
				Intent intentShare=new Intent(getActivity(), ShareActivity.class);
				startActivity(intentShare);
				break;
			case R.id.layout_logout:
				Intent intentLogout=new Intent(getActivity(), LoginActivity.class);
				intentLogout.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intentLogout);
				getActivity().finish();
				break;
			}

		}
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_settting, container,
				false);
		initView(view);
		setLiteners();
		return view;
	}

	/**
	 * @Title: setLiteners
	 * @Description:设置监听器
	 */

	private void setLiteners() {
		img_setting_icon.setOnClickListener(new OnClickListener(
				) {
			@Override
			public void onClick(View v) {
           Intent intent=new Intent(getActivity(), StudentsActivity.class);
				 startActivity(intent);
			}
		});
	}

	
	
	
	
	
	
}

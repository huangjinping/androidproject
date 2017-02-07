/** 
 * Project Name：privateTutor 
 * File Name：RegisterActivity.java 
 * Package Name：cn.cooperlink.privatetutor.login 
 * Date：2015年7月18日 下午7:42:52 
 * Copyright (c) 2015, cooperlink.cn All Rights Reserved. 
 * 北京酷博灵科信息技术有限公司
 */
package cn.cooperlink.privatetutor.login.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import cn.cooperlink.privatetutor.R;
import cn.cooperlink.privatetutor.base.BaseActivity;
import cn.cooperlink.privatetutor.login.fragment.RegisterFragment;

/**
 * @Title：注册界面
 * @Description：
 * @Package cn.cooperlink.privatetutor.login
 * @ClassName RegisterActivity
 * @author harrishuang
 * @date 2015年7月18日 下午7:42:52
 * @version
 */
public class RegisterActivity extends BaseActivity {

	/**
	 * @Fields rag_register_segment: 选择器
	 */

	private RadioGroup rag_register_segment;
	private RadioButton rab_first;
	private RadioButton rab_secend;
	private FragmentManager supportFragmentManager;
	private ImageButton btn_left;
	private TextView txt_title;

	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		setContentView(R.layout.activity_register);
		initView();
		setOnLiteners();
		initHeader();
	}

	/**
	 * @Title: initHeader
	 * @Description:初始化头
	 */

	private void initHeader() {
		btn_left = (ImageButton) findViewById(R.id.btn_left);
		txt_title = (TextView) findViewById(R.id.txt_title);
		txt_title.setText(R.string.register);
		btn_left.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				RegisterActivity.this.finish();
			}
		});
	}

	/**
	 * 初始化数据
	 * 
	 */

	private void initView() {
		rag_register_segment = (RadioGroup) findViewById(R.id.rag_register_segment);
		rab_first = (RadioButton) findViewById(R.id.rab_first);
		rab_secend = (RadioButton) findViewById(R.id.rab_secend);
		supportFragmentManager = getSupportFragmentManager();

		setSegment(R.id.rab_first);
	}

	/**
	 * @Title: setOnLiteners
	 * @Description:设置监听器
	 */
	private void setOnLiteners() {
		rag_register_segment
				.setOnCheckedChangeListener(new OnCheckedChangeListener() {
					@Override
					public void onCheckedChanged(RadioGroup group, int checkedId) {
						setSegment(checkedId);
					}
				});
	}

	/**
	 * @Title: setSegment
	 * @Description:设置分离
	 * @param checkedId
	 */

	private void setSegment(int checkedId) {

		switch (checkedId) {
		case R.id.rab_first:
			RegisterFragment studentFragment = new RegisterFragment();
			rab_first.setTextColor(getResources().getColor(R.color.white));
			rab_secend.setTextColor(getResources().getColor(
					R.color.segment_chacked));
			Bundle bundle = new Bundle();
			bundle.putString("type", "1");
			studentFragment.setArguments(bundle);
			supportFragmentManager.beginTransaction()
					.replace(R.id.layout_register_content, studentFragment)
					.commit();
			break;
		case R.id.rab_secend:
			RegisterFragment teachersFragment = new RegisterFragment();
			Bundle bundleSecend = new Bundle();
			bundleSecend.putString("type", "2");
			teachersFragment.setArguments(bundleSecend);
			rab_first.setTextColor(getResources().getColor(
					R.color.segment_chacked));
			rab_secend.setTextColor(getResources().getColor(R.color.white));
			supportFragmentManager.beginTransaction()
					.replace(R.id.layout_register_content, teachersFragment)
					.commit();
			break;
		}

	}

}

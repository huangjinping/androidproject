/** 
 * Project Name：androidproject 
 * File Name：SearchActivity.java 
 * Package Name：cn.cooperlink.privatetutor.tutor 
 * Date：2015年7月22日 下午10:22:53 
 * Copyright (c) 2015, cooperlink.cn All Rights Reserved. 
 * 北京酷博灵科信息技术有限公司
 */
package cn.cooperlink.privatetutor.tutor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import cn.cooperlink.privatetutor.R;
import cn.cooperlink.privatetutor.base.BaseActivity;

/**
 * @Title：
 * @Description：
 * @Package cn.cooperlink.privatetutor.tutor
 * @ClassName SearchActivity
 * @author harrishuang
 * @date 2015年7月22日 下午10:22:53
 * @version
 */
public class SearchActivity extends BaseActivity {
	private ImageButton btn_left;
	private TextView txt_title;
	private TextView txt_right;
	private EditText edt_center_search;

	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		setContentView(R.layout.activity_search);
		initHeader();
	}
	
	private void initHeader() {
		btn_left = (ImageButton) findViewById(R.id.btn_left);
		txt_title=(TextView)findViewById(R.id.txt_title);
		txt_right=(TextView)findViewById(R.id.txt_right);
		edt_center_search=(EditText)findViewById(R.id.edt_center_search);
		edt_center_search.setVisibility(View.VISIBLE);
		txt_right.setText("取消");
		btn_left.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
			}
		});
	}
}

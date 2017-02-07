/** 
 * Project Name：privateTutor 
 * File Name：Screening_DIALOG.java 
 * Package Name：cn.cooperlink.privatetutor.dialog 
 * Date：2015年7月20日 下午11:14:51 
 * Copyright (c) 2015, cooperlink.cn All Rights Reserved. 
 * 北京酷博灵科信息技术有限公司
 */
package cn.cooperlink.privatetutor.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.RelativeLayout;
import cn.cooperlink.privatetutor.R;

/**
 * @Title：筛选
 * @Description：
 * @Package cn.cooperlink.privatetutor.dialog
 * @ClassName Screening_DIALOG
 * @author harrishuang   
 * @date 2015年7月20日 下午11:14:51
 * @version 
 */
public class ScreeningDialog  extends  AlertDialog {
	private RelativeLayout  layout_bottom;
	private   android.view.View.OnClickListener  onClickListener;
	public  ScreeningDialog(Context context,android.view.View.OnClickListener  onClickListener) {
		super(context);
		this.onClickListener=onClickListener;
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	setContentView(R.layout.dialog_screening);
	layout_bottom=(RelativeLayout)findViewById(R.id.layout_bottom);
	layout_bottom.setOnClickListener(onClickListener);
	}

}

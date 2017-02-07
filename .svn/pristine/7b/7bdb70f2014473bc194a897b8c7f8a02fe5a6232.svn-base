/** 
 * Project Name：privateTutor 
 * File Name：SortingDialog.java 
 * Package Name：cn.cooperlink.privatetutor.dialog 
 * Date：2015年7月20日 下午10:47:16 
 * Copyright (c) 2015, cooperlink.cn All Rights Reserved. 
 * 北京酷博灵科信息技术有限公司
 */
package cn.cooperlink.privatetutor.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import cn.cooperlink.privatetutor.R;

/**
 * @Title：
 * @Description：
 * @Package cn.cooperlink.privatetutor.dialog
 * @ClassName SortingDialog
 * @author harrishuang
 * @date 2015年7月20日 下午10:47:16
 * @version
 */
public class SortingDialog extends AlertDialog {
	private RadioGroup rag_sorting;
	private RelativeLayout layout_bottom;
	private TextView txt_sorting_title;
    private  android.view.View.OnClickListener   clickListener;
    
	public SortingDialog(Context context,android.view.View.OnClickListener   clickListener) {
		super(context);
		this.clickListener=clickListener;
		
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dialog_sorting);
		rag_sorting = (RadioGroup) findViewById(R.id.rag_sorting);
		layout_bottom = (RelativeLayout) findViewById(R.id.layout_bottom);
		txt_sorting_title = (TextView) findViewById(R.id.txt_sorting_title);
		setOnListeners();

	}

	/**
	 * @Title: setOnListeners
	 * @Description:设置属性
	 */

	private void setOnListeners() {
		rag_sorting.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				switch (checkedId) {
				case R.id.rab_comprehensive:
					txt_sorting_title.setText("综合排序");
					break;

				case R.id.rab_lowest_price:
					txt_sorting_title.setText("价格最低");
					break;
				case R.id.rab_highest_price:
					txt_sorting_title.setText("价格最高");
					break;
				}
			}
		});
		layout_bottom.setOnClickListener(clickListener);
	}

}

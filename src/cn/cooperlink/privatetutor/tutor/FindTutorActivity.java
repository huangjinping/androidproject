/** 
 * Project Name：privateTutor 
 * File Name：FindTutorActivity.java 
 * Package Name：cn.cooperlink.privatetutor.tutor 
 * Date：2015年7月19日 上午9:03:22 
 * Copyright (c) 2015, cooperlink.cn All Rights Reserved. 
 * 北京酷博灵科信息技术有限公司
 */
package cn.cooperlink.privatetutor.tutor;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import cn.cooperlink.privatetutor.R;
import cn.cooperlink.privatetutor.base.BaseActivity;
import cn.cooperlink.privatetutor.dialog.ScreeningDialog;
import cn.cooperlink.privatetutor.dialog.SortingDialog;
import cn.cooperlink.privatetutor.dialog.SubjectsDialog;
import cn.cooperlink.privatetutor.view.CircleImageView;

import com.handmark.pulltorefresh.library.PullToRefreshBase.Mode;
import com.handmark.pulltorefresh.library.PullToRefreshListView;

/**
 * @Title：找家教
 * @Description：
 * @Package cn.cooperlink.privatetutor.tutor
 * @ClassName FindTutorActivity
 * @author harrishuang   
 * @date 2015年7月19日 上午9:03:22
 * @version 
 */
public class FindTutorActivity extends BaseActivity{
	private CheckBox che_focus_course;
	private CheckBox che_focue_sorting;
	private CheckBox che_focue_screening;
	private SubjectsDialog subjectsDialog;
	private SortingDialog sortingDialog;
	private  ScreeningDialog screeningDialog;
	private PullToRefreshListView lisv_find_tutor;
	private List<String> dataList;
	private FindTutorAdapter adapter;
	private ImageButton btn_left;
	private TextView txt_title;
	private ImageView img_right;
	   @Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		setContentView(R.layout.layout_findtutor);
		initHeader();
		initView();
		initData();
	}
	   
		/**
		 * @Title: initHeader
		 * @Description:初始化头
		 */

		private void initHeader() {
			btn_left = (ImageButton) findViewById(R.id.btn_left);
			txt_title=(TextView)findViewById(R.id.txt_title);
			img_right=(ImageView)findViewById(R.id.img_right);
			img_right.setVisibility(View.VISIBLE);
			img_right.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent=new Intent(FindTutorActivity.this, SearchActivity.class);
					startActivity(intent);
				}
			});
			btn_left.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
				
				}
			});
		}
	   
	   private void initView() {
		   lisv_find_tutor = (PullToRefreshListView) findViewById(R.id.lisv_find_tutor);
		   lisv_find_tutor.setMode(Mode.BOTH);
		   che_focus_course = (CheckBox) findViewById(R.id.che_focus_course);
			che_focue_sorting = (CheckBox) findViewById(R.id.che_focue_sorting);
			che_focue_screening = (CheckBox) 
					findViewById(R.id.che_focue_screening);
			che_focus_course
					.setOnCheckedChangeListener(new onSortCheckedChangeLitener());
			che_focue_sorting
					.setOnCheckedChangeListener(new onSortCheckedChangeLitener());
			che_focue_screening
					.setOnCheckedChangeListener(new onSortCheckedChangeLitener());
	}
	   
	   /**
		 * @Title: initData
		 * @Description:
		 */

		private void initData() {
			dataList = new ArrayList<String>();
			for (int i = 0; i < 100; i++) {
				dataList.add(i + "------");
			}
			adapter = new FindTutorAdapter();
			// ArrayAdapter<String> adapter=new ArrayAdapter<String>(getActivity(),
			// android.R.layout.simple_list_item_1, dataList);
			lisv_find_tutor.setAdapter(adapter);
		}


/**
 * @Title：
 * @Description选择监听器
 * @Package cn.cooperlink.privatetutor.focus.fragment
 * @ClassName onSortCheckedChangeLitener
 * @author harrishuang
 * @date 2015年7月20日 下午4:42:33
 * @version
 */

private class onSortCheckedChangeLitener implements OnCheckedChangeListener {

	@Override
	public void onCheckedChanged(CompoundButton buttonView,
			boolean isChecked) {
		if (isChecked) {
			setClickedAll(false);
			buttonView.setChecked(true);
			if (che_focus_course == buttonView) {
				subjectsDialog = new SubjectsDialog(FindTutorActivity.this,
						new OnClickListener() {
							@Override
							public void onClick(View v) {
								subjectsDialog.dismiss();
								setClickedAll(false);
							}
						});
				subjectsDialog.show();
			} else if (che_focue_sorting == buttonView) {
				sortingDialog = new SortingDialog(FindTutorActivity.this,
						new OnClickListener() {

							@Override
							public void onClick(View v) {
								sortingDialog.dismiss();
								setClickedAll(false);
							}
						});
				sortingDialog.show();
				System.out.println("che_focue_sorting");
			} else if (che_focue_screening == buttonView) {
				screeningDialog=new  ScreeningDialog(FindTutorActivity.this, new OnClickListener() {
					@Override
					public void onClick(View v) {
						screeningDialog.dismiss();
						setClickedAll(false);
					}
				});
				screeningDialog.show();
			}
		}
	}}

private void   setClickedAll(Boolean  checked){
	
	
	che_focus_course.setChecked(checked);
	che_focue_sorting.setChecked(checked);
	che_focue_screening.setChecked(checked);
}


/**
 * @Title：内容适配器
 * @Description：
 * @Package cn.cooperlink.privatetutor.focus.activity
 * @ClassName FocusAdapter
 * @author harrishuang
 * @date 2015年7月17日 下午2:27:17
 * @version
 */
private class FindTutorAdapter extends BaseAdapter {

	private ViewHolder viewHolder;

	@Override
	public int getCount() {
		return dataList.size();
	}

	@Override
	public Object getItem(int position) {
		return dataList.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null) {
			convertView = LayoutInflater.from(FindTutorActivity.this).inflate(
					R.layout.item_focus, null);
			viewHolder = new ViewHolder();
			viewHolder.img_tutor_icon = (CircleImageView) convertView
					.findViewById(R.id.img_tutor_icon);
			viewHolder.txt_tutor_name = (TextView) convertView
					.findViewById(R.id.txt_tutor_name);
			viewHolder.txt_tutor_subjects = (TextView) convertView
					.findViewById(R.id.txt_tutor_subjects);
			viewHolder.btn_tutor_attention = (Button) convertView
					.findViewById(R.id.btn_tutor_attention);
			viewHolder.txt_tutor_price = (TextView) convertView
					.findViewById(R.id.txt_tutor_price);
			viewHolder.txt_tutor_praise = (TextView) convertView
					.findViewById(R.id.txt_tutor_praise);
			viewHolder.txt_tutor_comments = (TextView) convertView
					.findViewById(R.id.txt_tutor_comments);
			convertView.setTag(viewHolder);
		} else {
			viewHolder = (ViewHolder) convertView.getTag();
		}
		return convertView;
	}
}

/**
 * @Title：复用数据
 * @Description：
 * @Package cn.cooperlink.privatetutor.focus.fragment
 * @ClassName ViewHolder
 * @author harrishuang
 * @date 2015年7月19日 下午9:05:00
 * @version
 */

private class ViewHolder {
	private CircleImageView img_tutor_icon;
	private TextView txt_tutor_name;
	private TextView txt_tutor_subjects;
	private Button btn_tutor_attention;
	private TextView txt_tutor_price;
	private TextView txt_tutor_praise;
	private TextView txt_tutor_comments;
}
}

/** 
 * Project Name：androidproject 
 * File Name：DemandActivity.java 
 * Package Name：cn.cooperlink.privatetutor.demand.activity 
 * Date：2015年7月22日 上午10:23:02 
 * Copyright (c) 2015, cooperlink.cn All Rights Reserved. 
 * 北京酷博灵科信息技术有限公司
 */
package cn.cooperlink.privatetutor.demand.activity;

import java.util.ArrayList;
import java.util.List;

import com.handmark.pulltorefresh.library.PullToRefreshBase.Mode;
import com.handmark.pulltorefresh.library.PullToRefreshGridView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;
import cn.cooperlink.privatetutor.R;
import cn.cooperlink.privatetutor.base.BaseActivity;

/**
 * @Title：
 * @Description：
 * @Package cn.cooperlink.privatetutor.demand.activity
 * @ClassName DemandActivity
 * @author harrishuang
 * @date 2015年7月22日 上午10:23:02
 * @version
 */
public class DemandActivity extends BaseActivity {
	private PullToRefreshGridView grv_community;
	private List<String> dataList;
	private ImageButton btn_left;
	private TextView txt_title;
	private DemandAdapter adapter;

	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		setContentView(R.layout.activity_demand);
		initHeader();
		initView();
	}

	/**
	 * @Title: initView
	 * @Description:
	 */

	private void initView() {
		grv_community = (PullToRefreshGridView) findViewById(R.id.grv_community);
		grv_community.setMode(Mode.BOTH);
		dataList = new ArrayList<String>();
		for (int i = 0; i < 100; i++) {
			dataList.add("");
		}
		adapter = new DemandAdapter();
		grv_community.setAdapter(adapter);
	}

	/**
	 * @Title: initHeader
	 * @Description:初始化头
	 */

	private void initHeader() {
		btn_left = (ImageButton) findViewById(R.id.btn_left);
		txt_title = (TextView) findViewById(R.id.txt_title);
		txt_title.setText("需求");
		btn_left.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				DemandActivity.this.finish();
			}
		});
	}

	public void onAdd(View v) {
   Intent intent=new Intent(this, AddDemandActivity.class);
   startActivity(intent);
	}

	/**
	 * @Title：适配器
	 * @Description：
	 * @Package cn.cooperlink.privatetutor.demand.activity
	 * @ClassName DemandAdapter
	 * @author harrishuang
	 * @date 2015年7月22日 下午1:53:55
	 * @version
	 */

	private class DemandAdapter extends BaseAdapter {
		private ViewHodler viewHolder;

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
				convertView = LayoutInflater.from(DemandActivity.this).inflate(
						R.layout.item_demand, null);
				viewHolder = new ViewHodler();
				viewHolder.txt_demand_title = (TextView) findViewById(R.id.txt_demand_title);
				viewHolder.txt_demand_price = (TextView) findViewById(R.id.txt_demand_price);
				viewHolder.txt_demand_program = (TextView) findViewById(R.id.txt_demand_program);
				viewHolder.txt_demand_num = (TextView) findViewById(R.id.txt_demand_num);
				viewHolder.txt_demand__attitude = (TextView) findViewById(R.id.txt_demand__attitude);
				convertView.setTag(viewHolder);
			} else {
				viewHolder = (ViewHodler) convertView.getTag();
			}
			return convertView;
		}
	}

	/**
	 * @Title：
	 * @Description：
	 * @Package cn.cooperlink.privatetutor.demand.activity
	 * @ClassName ViewHodler
	 * @author harrishuang
	 * @date 2015年7月22日 下午2:17:22
	 * @version
	 */
	private class ViewHodler {
		private TextView txt_demand_title;
		private TextView txt_demand_price;
		private TextView txt_demand_program;
		private TextView txt_demand_num;
		private TextView txt_demand__attitude;
	}
}

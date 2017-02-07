/** 
 * Project Name：androidproject 
 * File Name：TopicDetailsActivity.java 
 * Package Name：cn.cooperlink.privatetutor.community 
 * Date：2015年7月25日 下午6:05:09 
 * Copyright (c) 2015, cooperlink.cn All Rights Reserved. 
 * 北京酷博灵科信息技术有限公司
 */
package cn.cooperlink.privatetutor.community;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import cn.cooperlink.privatetutor.R;
import cn.cooperlink.privatetutor.base.BaseActivity;

/**
 * @Title：
 * @Description：
 * @Package cn.cooperlink.privatetutor.community
 * @ClassName TopicDetailsActivity
 * @author harrishuang
 * @date 2015年7月25日 下午6:05:09
 * @version
 */
public class TopicDetailsActivity extends BaseActivity {
	private ListView lisv_topic;
	private List<String> dataList;
	private TopicAdapter adapter;
	
	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		setContentView(R.layout.activity_topicdetails);
		initView();
		initHeaderListView();
	}

	private void initView() {
		lisv_topic = (ListView) findViewById(R.id.lisv_topic);
		lisv_topic.addHeaderView(initHeaderListView());
		dataList = new ArrayList<String>();
		adapter = new TopicAdapter();
		lisv_topic.setAdapter(adapter);
		
	}
	/**
	 * @Title: initHeaderListView
	 * @Description:
	 * @return
	 */
	private View initHeaderListView() {
		View view = LayoutInflater.from(this).inflate(
				R.layout.layout_topic_head, null);
		return view;
	}

	private class TopicAdapter extends BaseAdapter {

		private ViewHolder    viewHolder;
		
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
			if (convertView==null) {
				convertView=LayoutInflater.from(TopicDetailsActivity.this).inflate(R.layout.item_topic_details, null);
				viewHolder=new ViewHolder();
				viewHolder.img_user_icon=(ImageView)convertView.findViewById(R.id.img_user_icon);
				viewHolder.txt_user_title=(TextView)convertView.findViewById(R.id.txt_user_title);
				viewHolder.txt_user_time=(TextView)convertView.findViewById(R.id.txt_user_time);
				viewHolder.txt_user_content=(TextView)convertView.findViewById(R.id.txt_user_content);
				convertView.setTag(viewHolder);
			}else{
				viewHolder= (ViewHolder) convertView.getTag();
			}
			return convertView;
		}

	}

	  private class ViewHolder{
		  private   ImageView    img_user_icon;
		  private  TextView    txt_user_title;
		  private  TextView  txt_user_time;
		  private   TextView   txt_user_content;
	  }
}

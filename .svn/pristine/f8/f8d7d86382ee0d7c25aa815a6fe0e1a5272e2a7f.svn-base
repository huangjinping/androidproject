/** 
 * Project Name：privateTutor 
 * File Name：CommunityActivity.java 
 * Package Name：cn.cooperlink.privatetutor.community 
 * Date：2015年7月19日 上午9:12:47 
 * Copyright (c) 2015, cooperlink.cn All Rights Reserved. 
 * 北京酷博灵科信息技术有限公司
 */
package cn.cooperlink.privatetutor.community;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import cn.cooperlink.privatetutor.R;
import cn.cooperlink.privatetutor.base.BaseActivity;
import cn.cooperlink.privatetutor.common.LoadMode;
import cn.cooperlink.privatetutor.model.BbsTopic;
import cn.cooperlink.privatetutor.model.dto.mobileInterface.Interface_032Request;
import cn.cooperlink.privatetutor.model.dto.mobileInterface.Interface_032Response;
import cn.cooperlink.privatetutor.model.dto.mobileInterface.RequestHead;
import cn.cooperlink.privatetutor.net.OnRequestDataListener;
import cn.cooperlink.privatetutor.utils.JacksonJsonUtil;
import cn.cooperlink.privatetutor.utils.StringUtils;
import cn.cooperlink.privatetutor.utils.UserManager;
import cn.cooperlink.privatetutor.view.CircleImageView;

import com.handmark.pulltorefresh.library.PullToRefreshBase.Mode;
import com.handmark.pulltorefresh.library.PullToRefreshListView;

/**
 * @Title：社区
 * @Description：
 * @Package cn.cooperlink.privatetutor.community
 * @ClassName CommunityActivity
 * @author harrishuang
 * @date 2015年7月19日 上午9:12:47
 * @version
 */
public class CommunityActivity extends BaseActivity {
	private PullToRefreshListView lisv_community;
	private List<BbsTopic> dataList;
	private CommunityAdapter adapter;
	private ImageButton btn_left;
	private TextView txt_title;

	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		setContentView(R.layout.activity_community);
		initHeader();
		initView();
		setOnLitenrs();
		loadDade(LoadMode.NOMAL);
	}
	
	
	
	
	
	
	
	/**
	 * @Title: setOnLitenrs
	 * @Description:
	 */
		
	private void setOnLitenrs() {
		lisv_community.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				try {
					Intent  intent=new Intent(CommunityActivity.this,TopicDetailsActivity.class);
					startActivity(intent);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * @Title: initHeader
	 * @Description:初始化头
	 */

	private void initHeader() {
		btn_left = (ImageButton) findViewById(R.id.btn_left);
		txt_title = (TextView) findViewById(R.id.txt_title);
		txt_title.setText("社区");
		btn_left.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				CommunityActivity.this.finish();
			}
		});
	}

	public void onPosting(View v) {
		Intent intent = new Intent(this, PostingActivity.class);
		startActivity(intent);
	}

	private void loadDade(LoadMode loadMode) {

		if (loadMode == LoadMode.NOMAL) {
			showProgress("");
		}
		request(this, getJsonDada(), new OnRequestDataListener() {

			@Override
			public void onSuccess(String result) {
				dismissProgress();
				try {
					Interface_032Response  interface_032Response=(Interface_032Response) JacksonJsonUtil.jsonToBean(result, Interface_032Response.class);
					List<BbsTopic> list = interface_032Response.getBody().getList();
					dataList.clear();
					dataList.addAll(list);
					adapter.notifyDataSetChanged();
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

	private String getJsonDada() {
		try {
			Interface_032Request request = new Interface_032Request();
			RequestHead requestHead = new RequestHead();
			requestHead.setInterfaceCode("interface_032");
			requestHead.setTokenId(UserManager.getUser(this).getBody()
					.getTokenId());
			requestHead.setUuid(StringUtils.getUUID());
			request.setHead(requestHead);
			String beanToJson = JacksonJsonUtil.beanToJson(request);
			return beanToJson;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * @Title: initView
	 * @Description:
	 */
	private void initView() {
		lisv_community = (PullToRefreshListView) findViewById(R.id.lisv_community);
		lisv_community.setMode(Mode.PULL_FROM_START);
		dataList = new ArrayList<BbsTopic>();
		adapter = new CommunityAdapter();
		lisv_community.setAdapter(adapter);
	}

	/**
	 * @Title：适配器
	 * @Description：
	 * @Package cn.cooperlink.privatetutor.community
	 * @ClassName CommunityAdapter
	 * @author harrishuang
	 * @date 2015年7月19日 上午9:59:07
	 * @version
	 */
	private class CommunityAdapter extends BaseAdapter {
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
				viewHolder = new ViewHolder();
				convertView = LayoutInflater.from(CommunityActivity.this)
						.inflate(R.layout.item_community, null);
				viewHolder.img_tutor_icon = (CircleImageView) convertView
						.findViewById(R.id.img_tutor_icon);
				viewHolder.txt_tutor_name = (TextView) convertView
						.findViewById(R.id.txt_tutor_name);
				viewHolder.txt_title = (TextView) convertView
						.findViewById(R.id.txt_comm_title);
				viewHolder.txt_comm_time = (TextView) convertView
						.findViewById(R.id.txt_comm_time);
				viewHolder.txt_comm_content = (TextView) convertView
						.findViewById(R.id.txt_comm_content);
				viewHolder.txt_comm_save = (TextView) convertView
						.findViewById(R.id.txt_comm_save);
				viewHolder.txt_comm_message = (TextView) convertView
						.findViewById(R.id.txt_comm_message);
				convertView.setTag(viewHolder);
			} else {
				viewHolder = (ViewHolder) convertView.getTag();
			}
			BbsTopic bbsTopic = dataList.get(position);
			if (!TextUtils.isEmpty(bbsTopic.getTitle())) {
				viewHolder.txt_title.setText(bbsTopic.getTitle());
			}
			
			if (!TextUtils.isEmpty(bbsTopic.getContent())) {
				viewHolder.txt_comm_content.setText(bbsTopic.getContent());
			}
			
			if (!TextUtils.isEmpty(bbsTopic.getBusinessUserId())) {
				viewHolder.txt_tutor_name.setText(bbsTopic.getBusinessUserId());
			}
			
			viewHolder.txt_comm_save.setText("("+bbsTopic.getBrowseNumber()+")");
			viewHolder.txt_comm_message.setText("("+bbsTopic.getPraiseNumber()+")");
			return convertView;
		}

		private class ViewHolder {
			private CircleImageView img_tutor_icon;
			private TextView txt_tutor_name;
			private TextView txt_title;
			private TextView txt_comm_time;
			private TextView txt_comm_content;
			private TextView txt_comm_save;
			private TextView txt_comm_message;
		}

	}

}

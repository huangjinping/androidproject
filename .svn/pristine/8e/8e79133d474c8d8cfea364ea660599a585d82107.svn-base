/** 
 * Project Name：privateTutor 
 * File Name：HistoryFragment.java 
 * Package Name：cn.cooperlink.privatetutor.history.fragment 
 * Date：2015年7月20日 上午9:59:21 
 * Copyright (c) 2015, cooperlink.cn All Rights Reserved. 
 * 北京酷博灵科信息技术有限公司
 */
package cn.cooperlink.privatetutor.history.fragment;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import cn.cooperlink.privatetutor.R;
import cn.cooperlink.privatetutor.base.BaseFragment;
import cn.cooperlink.privatetutor.view.CircleImageView;

import com.handmark.pulltorefresh.library.PullToRefreshBase.Mode;
import com.handmark.pulltorefresh.library.PullToRefreshListView;

/**
 * @Title：设置属性
 * @Description：
 * @Package cn.cooperlink.privatetutor.history.fragment
 * @ClassName HistoryFragment
 * @author harrishuang
 * @date 2015年7月20日 上午9:59:21
 * @version
 */
public class HistoryFragment extends BaseFragment {

	private List<String> dataList;
	private PullToRefreshListView lisv_history;
	private HistoryAdapter adapter;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_history, container,
				false);
		initView(view);
		initData();
		return view;
	}

	/**
	 * @Title: initData
	 * @Description:
	 */

	private void initData() {
		dataList = new ArrayList<String>();
		for (int i = 0; i < 100; i++) {
			dataList.add("");
		}
		adapter = new HistoryAdapter();
		lisv_history.setAdapter(adapter);
	}

	/**
	 * @Title: initView
	 * @Description:
	 * @param v
	 */

	private void initView(View v) {
		lisv_history = (PullToRefreshListView) v
				.findViewById(R.id.lisv_history);
		lisv_history.setMode(Mode.BOTH);
	}

	private class HistoryAdapter extends BaseAdapter {
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
				convertView = LayoutInflater.from(getActivity()).inflate(
						R.layout.item_appointment, null);
				viewHolder = new ViewHolder();
				viewHolder.txt_order_time = (TextView) convertView
						.findViewById(R.id.txt_order_time);
				viewHolder.txt_order_state = (TextView) convertView
						.findViewById(R.id.txt_order_state);
				viewHolder.img_tutor_icon = (CircleImageView) convertView
						.findViewById(R.id.img_tutor_icon);
				viewHolder.txt_tutor_name = (TextView) convertView
						.findViewById(R.id.txt_tutor_name);
				viewHolder.txt_tutor_subjects = (TextView) convertView
						.findViewById(R.id.txt_tutor_subjects);
				viewHolder.txt_order_pay = (TextView) convertView
						.findViewById(R.id.txt_order_pay);
				viewHolder.txt_order_again = (TextView) convertView
						.findViewById(R.id.txt_order_again);

				convertView.setTag(viewHolder);
			} else {
				viewHolder = (ViewHolder) convertView.getTag();
			}
			return convertView;
		}
	}

	/**
	 * @Title：
	 * @Description：
	 * @Package cn.cooperlink.privatetutor.history.fragment
	 * @ClassName ViewHolder
	 * @author harrishuang
	 * @date 2015年7月20日 下午1:29:36
	 * @version
	 */

	private class ViewHolder {
		private TextView txt_order_time;
		private TextView txt_order_state;
		private CircleImageView img_tutor_icon;
		private TextView txt_tutor_name;
		private TextView txt_tutor_subjects;
		private TextView txt_order_pay;
		private TextView txt_order_again;
	}
}

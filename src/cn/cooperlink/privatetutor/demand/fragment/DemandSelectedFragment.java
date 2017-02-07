/** 
 * Project Name：androidproject 
 * File Name：DemandSelectedFragment.java 
 * Package Name：cn.cooperlink.privatetutor.demand.activity 
 * Date：2015年7月27日 下午8:24:37 
 * Copyright (c) 2015, cooperlink.cn All Rights Reserved. 
 * 北京酷博灵科信息技术有限公司
 */
package cn.cooperlink.privatetutor.demand.fragment;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;
import cn.cooperlink.privatetutor.R;
import cn.cooperlink.privatetutor.base.BaseFragment;

/**
 * @Title：
 * @Description：
 * @Package cn.cooperlink.privatetutor.demand.activity
 * @ClassName DemandSelectedFragment
 * @author harrishuang
 * @date 2015年7月27日 下午8:24:37
 * @version
 */
public class DemandSelectedFragment extends BaseFragment {
	private GridView grv_selected_content;
	private ArrayList<String> dataList;
	private List<Boolean> dataState;
	private SelectedAdapter adapter;
	private OnSelectedClickListener onSelectedClickListener;

	public void setOnSelectedClickListener(
			OnSelectedClickListener onSelectedClickListener) {
		this.onSelectedClickListener = onSelectedClickListener;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_demandselected,
				container, false);
		initView(view);
		setOnListeners();
		return view;
	}

	private void initView(View v) {
		grv_selected_content = (GridView) v
				.findViewById(R.id.grv_selected_content);
		dataList = new ArrayList<String>();
		adapter = new SelectedAdapter();
		grv_selected_content.setAdapter(adapter);
		dataList = getArguments().getStringArrayList("data");
		initState();
		adapter.notifyDataSetChanged();
	}

	private void initState() {
		dataState = new ArrayList<Boolean>();
		for (int i = 0; i < dataList.size(); i++) {
			dataState.add(false);
		}
	}

	/**
	 * @Title: setOnLinters
	 * @Description:
	 */

	private void setOnListeners() {
		grv_selected_content.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				restartState();
				dataState.set(position, true);
				adapter.notifyDataSetChanged();
				if (onSelectedClickListener != null) {
					onSelectedClickListener.onItem(dataList.get(position),
							position);
				}
			}
		});
	}

	private void restartState() {
		for (int i = 0; i < dataState.size(); i++) {
			dataState.set(i, false);
		}
	}

	private class SelectedAdapter extends BaseAdapter {
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

				convertView = LayoutInflater.from(getActivity()).inflate(
						R.layout.item_selected, null);
				viewHolder.txt_item = (TextView) convertView
						.findViewById(R.id.txt_item);
				convertView.setTag(viewHolder);
			} else {
				viewHolder = (ViewHolder) convertView.getTag();
			}
			String title = dataList.get(position);
			Boolean state = dataState.get(position);
			viewHolder.txt_item.setText(title);

			if (state) {
				viewHolder.txt_item.setTextColor(getResources().getColor(
						R.color.segment_chacked));
				viewHolder.txt_item
						.setBackgroundResource(R.drawable.shape_pay_enabletrue);
			} else {
				viewHolder.txt_item.setTextColor(getResources().getColor(
						R.color.text_hint_color));
				viewHolder.txt_item
						.setBackgroundResource(R.drawable.shape_pay_enablefalse);
			}
			return convertView;
		}

		private class ViewHolder {
			private TextView txt_item;
		}
	}

	public interface OnSelectedClickListener {
		void onItem(String title, int position);
	}
}

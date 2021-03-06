/** 
 * Project Name：privateTutor 
 * File Name：FocusFragment.java 
 * Package Name：cn.cooperlink.privatetutor.focus.activity 
 * Date：2015年7月17日 下午2:20:11 
 * Copyright (c) 2015, cooperlink.cn All Rights Reserved. 
 * 北京酷博灵科信息技术有限公司
 */
package cn.cooperlink.privatetutor.focus.fragment;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import cn.cooperlink.privatetutor.R;
import cn.cooperlink.privatetutor.base.BaseTableBarFragment;
import cn.cooperlink.privatetutor.model.dto.mobileInterface.Interface_021Request;
import cn.cooperlink.privatetutor.model.dto.mobileInterface.Interface_021Request.RequestBody;
import cn.cooperlink.privatetutor.model.dto.mobileInterface.RequestHead;
import cn.cooperlink.privatetutor.utils.JacksonJsonUtil;
import cn.cooperlink.privatetutor.utils.StringUtils;
import cn.cooperlink.privatetutor.utils.UserManager;
import cn.cooperlink.privatetutor.view.CircleImageView;

import com.handmark.pulltorefresh.library.PullToRefreshBase.Mode;
import com.handmark.pulltorefresh.library.PullToRefreshListView;

/**
 * @Title：
 * @Description：
 * @Package cn.cooperlink.privatetutor.focus.activity
 * @ClassName FocusFragment
 * @author harrishuang
 * @date 2015年7月17日 下午2:20:11
 * @version
 */
public class FocusFragment extends BaseTableBarFragment {

	private PullToRefreshListView lisv_focus;
	private List<String> dataList;
	private FocusAdapter adapter;
	 /** 标志位，标志已经初始化完成 */
    private boolean isPrepared;
    /** 是否已被加载过一次，第二次就不再去请求数据了 */
    private boolean mHasLoadedOnce;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_focus, container, false);
		
		  isPrepared = true;
          lazyLoad();
		initView(view);
		
		return view;
	}

	
	
	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		
		System.out.println("---------->>>");
	}
	
	
	
	
	
	/**
	 * @Title: initView
	 * @Description:初始化View
	 * @param v
	 */

	private void initView(View v) {
		lisv_focus = (PullToRefreshListView) v.findViewById(R.id.lisv_focus);
		lisv_focus.setMode(Mode.BOTH);
		
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
		System.out.println("---"+dataList);
		adapter = new FocusAdapter();
		// ArrayAdapter<String> adapter=new ArrayAdapter<String>(getActivity(),
		// android.R.layout.simple_list_item_1, dataList);
		lisv_focus.setAdapter(adapter);
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
	private class FocusAdapter extends BaseAdapter {

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

	@Override
	protected void lazyLoad() {
		  if (!isPrepared || !isVisible || mHasLoadedOnce) {
	            return;
	        }		
		  initData();
	}
	


}

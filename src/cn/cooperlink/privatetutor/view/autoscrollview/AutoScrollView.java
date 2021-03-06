/** 
 * Project Name：Westinghouse 
 * File Name：AutoScrollView.java 
 * Package Name：cn.cooperlink.attea.view.autoscrollpager 
 * Date：2015-1-31 上午9:25:52 
 * Copyright (c) 2015, cooperlink.cn All Rights Reserved. 
 * 北京酷博灵科信息技术有限公司
 */
package cn.cooperlink.privatetutor.view.autoscrollview;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.tsz.afinal.FinalBitmap;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import cn.cooperlink.privatetutor.R;
import cn.cooperlink.privatetutor.model.BusinessAdvertisement;

/**
 * @Title：轮播图
 * @Description：
 * @Package cn.cooperlink.attea.view.autoscrollpager
 * @ClassName AutoScrollView
 * @author harris
 * @date 2015-1-31 上午9:25:52
 * @version
 */
@SuppressLint("ClickableViewAccessibility")
public class AutoScrollView extends LinearLayout {

	private AutoScrollViewPager vip_autoscroll;
	private LinearLayout layout_indicator;
	/**
	 * @Fields dataList: 数据源
	 */

	List<View> viewList;
	private Activity context;

	private List<BusinessAdvertisement> dataAllList;
	/**
	 * @Fields metrics: 计算长度
	 */
	public DisplayMetrics metrics; 
	
	 FinalBitmap finalBitmap;
	 
	public AutoScrollView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		this.context = (Activity) context;
		initView(context);
	}

	private void initView(Context context) {
		// TODO Auto-generated method stub
		this.setOrientation(LinearLayout.VERTICAL);
		dataAllList = new ArrayList<BusinessAdvertisement>();
		finalBitmap=FinalBitmap.create(context);
		
		View view = View.inflate(context, R.layout.layout_autoscrollviewpager,
				null);
		vip_autoscroll = (AutoScrollViewPager) view
				.findViewById(R.id.vip_autoscroll);
		layout_indicator = (LinearLayout) view
				.findViewById(R.id.layout_indicator);
		metrics = new DisplayMetrics();
		Activity activity = (Activity) context;
		activity.getWindowManager().getDefaultDisplay().getMetrics(metrics);
		
		int w = metrics.widthPixels;
		int h = (metrics.widthPixels * 130) / 320;
		LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(w, h);
		this.addView(view, params);
		vip_autoscroll.setOnTouchListener(new OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				switch (event.getAction()) {
				case MotionEvent.ACTION_DOWN:
					vip_autoscroll.stopTimer();
					break;
				case MotionEvent.ACTION_UP:
					vip_autoscroll.startTimer();
					break;
				}
				return true;
			}
		});
	}

	public void initCarouslview(List<BusinessAdvertisement> dataList) {
		// TODO Auto-generated method stub
		this.dataAllList = dataList;

		if (dataList == null || dataList.size() == 0) {
			this.setVisibility(View.GONE);
			return;
		}
		this.setVisibility(View.VISIBLE);
		viewList = new ArrayList<View>();

		for (int i = 0; i < dataList.size(); i++) {
			ImageView imageView = new ImageView(context);
			imageView.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {// 设置图片点击事件
//					@SuppressWarnings("unchecked")
//					Map<String, Object> event = (Map<String, Object>) dataAllList
//							.get(vip_autoscroll.getCurIndex()).get("event");
//					eventIntent(event);
				}
			});
//			Map<String, Object> map = dataList.get(i);
//			String imageUrl = (String) map.get("imageUrl");
//			imageLoader.displayImage(NetConst.imageUrl(imageUrl), imageView, options);
			
				
				if (i==0) {
					finalBitmap.display(imageView, "http://a2.att.hudong.com/00/92/19300001263502133108923257181_950.jpg");
				}else{
					finalBitmap.display(imageView, "http://a3.att.hudong.com/56/80/19300001302824131183805460273_950.jpg");
				}
			imageView.setScaleType(ScaleType.FIT_XY);
			viewList.add(imageView);
		}
		vip_autoscroll.start(context, viewList, 4000, layout_indicator,
				R.layout.ad_bottom_item, R.id.ad_item_v,
				R.drawable.dot_focused, R.drawable.dot_normal);
	}

	public void onRestart() {
		if (vip_autoscroll.isStoped) {
			vip_autoscroll.startTimer();
		}

	}

	public void onStop() {
		vip_autoscroll.stopTimer();
	}
}

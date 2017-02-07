/** 
 * Project Name：privateTutor 
 * File Name：IndexActivity.java 
 * Package Name：privateTutor 
 * Date：2015年7月16日 下午6:14:29 
 * Copyright (c) 2015, cooperlink.cn All Rights Reserved. 
 * 北京酷博灵科信息技术有限公司
 */
package cn.cooperlink.privatetutor.main.activity;

import java.util.ArrayList;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import cn.cooperlink.privatetutor.R;
import cn.cooperlink.privatetutor.appointment.fragment.AppointmentFragment;
import cn.cooperlink.privatetutor.focus.fragment.FocusFragment;
import cn.cooperlink.privatetutor.history.fragment.HistoryFragment;
import cn.cooperlink.privatetutor.main.fragment.MainFragment;
import cn.cooperlink.privatetutor.main.fragment.SettingFragment;
import cn.cooperlink.privatetutor.view.IndexViewPager;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;

/**
 * @Title：首页的
 * @Description：
 * @Package privateTutor
 * @ClassName IndexActivity
 * @author harrishuang
 * @date 2015年7月16日 下午6:14:29
 * @version
 */

public class IndexActivity extends SlidingFragmentActivity {
	private SlidingMenu slidingMenu;
	private SettingFragment menuFragment;
	private FragmentManager supportFragmentManager;
	private ImageButton btn_left;
	private IndexViewPager vip_index;
	private RadioGroup rag_bottom;
	private ArrayList<Fragment> fragmentsList;
	private IndexPageAdapter pageAdapter;
	private String[] item_arr;
	private TextView txt_title;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_index);
		initSlidingMenu(R.layout.layout_slidingmenu);
		initHeader();
		menuFragment = new SettingFragment();
		supportFragmentManager = getSupportFragmentManager();
		supportFragmentManager.beginTransaction()
				.replace(R.id.layout_menu, menuFragment).commit();
		item_arr = getResources().getStringArray(R.array.item_title);
		initView();
		setOnLiteners();
	}

	/**
	 * @Title: setOnLiteners
	 * @Description:设置监听器
	 */

	private void setOnLiteners() {
		rag_bottom.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				try {
					setCurrentItem(checkedId);
//					vip_index.setCurrentItem(checkedId, false);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * @Title: initView
	 * @Description:初始化View
	 */

	private void initView() {
		// TODO Auto-generated method stub
		fragmentsList = new ArrayList<Fragment>();
		vip_index = (IndexViewPager) findViewById(R.id.vip_index);
		rag_bottom = (RadioGroup) findViewById(R.id.rag_bottom);
		initData();
		pageAdapter = new IndexPageAdapter(supportFragmentManager);
		vip_index.setAdapter(pageAdapter);
		pageAdapter.notifyDataSetChanged();
	}

	/**
	 * @Title: initData
	 * @Description:数据添加
	 */

	private void initData() {
		MainFragment mainFragment = new MainFragment();
		fragmentsList.add(mainFragment);
		FocusFragment focusFragment = new FocusFragment();
		fragmentsList.add(focusFragment);
		AppointmentFragment appointmentFragment=new AppointmentFragment();
		fragmentsList.add(appointmentFragment);
		HistoryFragment   historyFragment=new HistoryFragment();
		fragmentsList.add(historyFragment);
		
		
		addChild(0, "主页", R.drawable.selector_radio_home);
		addChild(1, "关注家教", R.drawable.selector_radio_focus);
		addChild(2, "我的预约", R.drawable.selector_radio_appointment);
		addChild(3, "历史订单", R.drawable.selector_radio_history);
		setCurrentItem(0);
	}

	/**
	 * @Title: setCurrentItem
	 * @Description:设置当前属性
	 * @param index
	 */

	private void setCurrentItem(int index) {
		RadioButton button = (RadioButton) rag_bottom.getChildAt(index);
		button.performClick();
		txt_title.setText(	item_arr[index]);
		vip_index.setCurrentItem(index, false);

	}

	/**
	 * @Title: addChild
	 * @Description:添加一个孩子
	 */

	private void addChild(int id, String title, int drawable) {
		RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(0,
				LayoutParams.MATCH_PARENT, 1);
		RadioButton button = (RadioButton) RadioButton.inflate(this,
				R.layout.item_bottom_child, null);
		button.setId(id);
		button.setText(title);
		Drawable topDrawable = getResources().getDrawable(drawable);
		topDrawable.setBounds(0, 0, 40, 40);
		button.setCompoundDrawables(null, topDrawable, null, null);
		rag_bottom.addView(button, layoutParams);
		rag_bottom.invalidate();
	}

	/**
	 * 初始化滑动菜单
	 * 
	 * @param resId
	 */
	public void initSlidingMenu(int resId) {
		setBehindContentView(resId);
		slidingMenu = getSlidingMenu();
		slidingMenu.setBehindOffset((getWidth() / 4));
		slidingMenu.setMode(SlidingMenu.LEFT);
		slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
	}

	/**
	 * 获取屏幕宽度像素
	 * 
	 * @return
	 */
	public int getWidth() {
		DisplayMetrics metrics = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(metrics);
		return metrics.widthPixels;
	}

	/**
	 * @Title: initHeader
	 * @Description:初始化头
	 */

	private void initHeader() {
		btn_left = (ImageButton) findViewById(R.id.btn_left);
		txt_title=(TextView)findViewById(R.id.txt_title);
		btn_left.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (slidingMenu.isMenuShowing()) {
					slidingMenu.toggle();
				} else {
					slidingMenu.showMenu();
				}
			}
		});
	}

	/**
	 * @Title：
	 * @Description：
	 * @Package cn.cooperlink.privatetutor.main.activity
	 * @ClassName IndexPageAdapter
	 * @author harrishuang   
	 * @date 2015年7月20日 上午9:41:54
	 * @version 
	 */ 
	
	
	
		
	private class IndexPageAdapter extends FragmentPagerAdapter {

		public IndexPageAdapter(FragmentManager fm) {
			super(fm);
			// TODO Auto-generated constructor stub
		}

		@Override
		public Fragment getItem(int arg0) {
			// TODO Auto-generated method stub
			return fragmentsList.get(arg0);
		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return fragmentsList.size();
		}

		@Override
		public int getItemPosition(Object object) {
			// TODO Auto-generated method stub
			return super.getItemPosition(object);
		}

	}

}

/** 
 * Project Name：MyViewPagerActivity 
 * File Name：MyViewPager.java 
 * Package Name：huahua.viewpager 
 * Date：2015年6月29日 上午9:41:04 
 * Copyright (c) 2015, cooperlink.cn All Rights Reserved. 
 * 北京酷博灵科信息技术有限公司
 */
package cn.cooperlink.privatetutor.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * @Title：
 * @Description：
 * @Package huahua.viewpager
 * @ClassName IndexViewPager
 * @author harrishuang   
 * @date 2015年6月29日 上午9:41:04
 * @version 
 */
public class IndexViewPager  extends ViewPager{

	public IndexViewPager(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	@SuppressLint("ClickableViewAccessibility")
	@Override
	public boolean onTouchEvent(MotionEvent arg0) {
		// TODO Auto-generated method stub
//		return super.onTouchEvent(arg0);
		
		
		return  false;
		
		
	}
	
	
	@Override
	public boolean onInterceptTouchEvent(MotionEvent arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	
}

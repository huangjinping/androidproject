/** 
 * Project Name：androidproject 
 * File Name：AddDemandActivity.java 
 * Package Name：cn.cooperlink.privatetutor.demand.activity 
 * Date：2015年7月27日 下午7:45:42 
 * Copyright (c) 2015, cooperlink.cn All Rights Reserved. 
 * 北京酷博灵科信息技术有限公司
 */
package cn.cooperlink.privatetutor.demand.activity;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import cn.cooperlink.privatetutor.R;
import cn.cooperlink.privatetutor.base.BaseActivity;
import cn.cooperlink.privatetutor.demand.fragment.DemandSelectedFragment;
import cn.cooperlink.privatetutor.demand.fragment.DemandSelectedFragment.OnSelectedClickListener;

/**
 * @Title：
 * @Description：
 * @Package cn.cooperlink.privatetutor.demand.activity
 * @ClassName AddDemandActivity
 * @author harrishuang
 * @date 2015年7月27日 下午7:45:42
 * @version
 */
public class AddDemandActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		setContentView(R.layout.activity_adddemand);
		addSubjects();
		addSituation();
		addPriceRange();
	}

	private void addSubjects() {
		DemandSelectedFragment demandSelectedFragment = new DemandSelectedFragment();
		demandSelectedFragment
				.setOnSelectedClickListener(new OnSelectedClickListener() {
					@Override
					public void onItem(String title, int position) {
                System.out.println(title+"---------"+position);
					}
				});
		ArrayList<String> list = new ArrayList<String>();
		list.add("设计文");
		list.add("一年级");
		list.add("二年级");
		Bundle bundle = new Bundle();
		bundle.putStringArrayList("data", list);
		demandSelectedFragment.setArguments(bundle);
		FragmentTransaction beginTransaction = getSupportFragmentManager()
				.beginTransaction();
		beginTransaction.replace(R.id.layout_demand_subjects,
				demandSelectedFragment);
		beginTransaction.commit();

	}

	private void addSituation() {
		DemandSelectedFragment demandSelectedFragment = new DemandSelectedFragment();
		demandSelectedFragment
				.setOnSelectedClickListener(new OnSelectedClickListener() {
					@Override
					public void onItem(String title, int position) {
                System.out.println(title+"---------"+position);
					}
				});
		ArrayList<String> list = new ArrayList<String>();
		list.add("设计文");
		list.add("一年级");
		list.add("二年级");
		Bundle bundle = new Bundle();
		bundle.putStringArrayList("data", list);
		demandSelectedFragment.setArguments(bundle);
		FragmentTransaction beginTransaction = getSupportFragmentManager()
				.beginTransaction();
		beginTransaction.replace(R.id.layout_learning_situation,
				demandSelectedFragment);
		beginTransaction.commit();

	}
	private void addPriceRange() {
		DemandSelectedFragment demandSelectedFragment = new DemandSelectedFragment();
		demandSelectedFragment
				.setOnSelectedClickListener(new OnSelectedClickListener() {
					@Override
					public void onItem(String title, int position) {
                System.out.println(title+"---------"+position);
					}
				});
		ArrayList<String> list = new ArrayList<String>();
		list.add("设计文");
		list.add("一年级");
		list.add("二年级");
		Bundle bundle = new Bundle();
		bundle.putStringArrayList("data", list);
		demandSelectedFragment.setArguments(bundle);
		FragmentTransaction beginTransaction = getSupportFragmentManager()
				.beginTransaction();
		beginTransaction.replace(R.id.layout_price_range,
				demandSelectedFragment);
		beginTransaction.commit();

	}
	
	
	public void onSubmit(View  v){
		
	}
}

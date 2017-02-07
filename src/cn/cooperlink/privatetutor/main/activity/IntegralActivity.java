/** 
 * Project Name：androidproject 
 * File Name：IntegralActivity.java 
 * Package Name：cn.cooperlink.privatetutor.main.activity 
 * Date：2015年7月25日 下午12:19:26 
 * Copyright (c) 2015, cooperlink.cn All Rights Reserved. 
 * 北京酷博灵科信息技术有限公司
 */
package cn.cooperlink.privatetutor.main.activity;

import android.os.Bundle;
import android.widget.TextView;
import cn.cooperlink.privatetutor.R;
import cn.cooperlink.privatetutor.base.BaseActivity;

/**
 * @Title：积分界面
 * @Description：
 * @Package cn.cooperlink.privatetutor.main.activity
 * @ClassName IntegralActivity
 * @author harrishuang   
 * @date 2015年7月25日 下午12:19:26
 * @version 
 */
public class IntegralActivity  extends  BaseActivity{

	   private  TextView  txt_integral_num;
	   
	  @Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		setContentView(R.layout.activity_integral);
		txt_integral_num=(TextView)findViewById(R.id.txt_integral_num);
	}
}

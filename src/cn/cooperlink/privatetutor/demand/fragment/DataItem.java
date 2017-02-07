/** 
 * Project Name：androidproject 
 * File Name：DataItem.java 
 * Package Name：cn.cooperlink.privatetutor.demand.fragment 
 * Date：2015年7月27日 下午8:52:39 
 * Copyright (c) 2015, cooperlink.cn All Rights Reserved. 
 * 北京酷博灵科信息技术有限公司
 */
package cn.cooperlink.privatetutor.demand.fragment;

/**
 * @Title：
 * @Description：
 * @Package cn.cooperlink.privatetutor.demand.fragment
 * @ClassName DataItem
 * @author harrishuang   
 * @date 2015年7月27日 下午8:52:39
 * @version 
 */
public class DataItem {
    private  String title;
    private boolean   isChecked;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isChecked() {
		return isChecked;
	}
	public void setChecked(boolean isChecked) {
		this.isChecked = isChecked;
	}
	@Override
	public String toString() {
		return "DataItem [title=" + title + ", isChecked=" + isChecked + "]";
	}
	
	
	
	
	
	
	
	
	
	
    
}

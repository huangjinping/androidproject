/** 
 * Project Name：androidproject 
 * File Name：BaseTableBarFragment.java 
 * Package Name：cn.cooperlink.privatetutor.base 
 * Date：2015年7月22日 上午9:50:08 
 * Copyright (c) 2015, cooperlink.cn All Rights Reserved. 
 * 北京酷博灵科信息技术有限公司
 */
package cn.cooperlink.privatetutor.base;

/**
 * @Title：
 * @Description：
 * @Package cn.cooperlink.privatetutor.base
 * @ClassName BaseTableBarFragment
 * @author harrishuang   
 * @date 2015年7月22日 上午9:50:08
 * @version 
 */
public abstract  class BaseTableBarFragment extends  BaseFragment {
	 
		/** Fragment当前状态是否可见 */
	    protected boolean isVisible;
		
	    @Override
	    public void setUserVisibleHint(boolean isVisibleToUser) {
	    	// TODO Auto-generated method stub
	    	super.setUserVisibleHint(isVisibleToUser);
	    	   
	        if(getUserVisibleHint()) {
	            isVisible = true;
	            onVisible();
	        } else {
	            isVisible = false;
	            onInvisible();
	        }
	    }
	    
	    
	    /**
	     * 可见
	     */
	    protected void onVisible() {
	        lazyLoad();     
	    }
	     
	     
	    /**
	     * 不可见
	     */
	    protected void onInvisible() {
	         
	         
	    }
	     
	     
	    /** 
	     * 延迟加载
	     * 子类必须重写此方法
	     */
	    protected abstract void lazyLoad();
}

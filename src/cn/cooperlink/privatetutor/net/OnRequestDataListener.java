/** 
 * Project Name：androidproject 
 * File Name：OnRequestDataListener.java 
 * Package Name：cn.cooperlink.privatetutor.net 
 * Date：2015年7月22日 下午6:17:29 
 * Copyright (c) 2015, cooperlink.cn All Rights Reserved. 
 * 北京酷博灵科信息技术有限公司
 */
package cn.cooperlink.privatetutor.net;

/**
 * @Title：
 * @Description：
 * @Package cn.cooperlink.privatetutor.net
 * @ClassName OnRequestDataListener
 * @author harrishuang   
 * @date 2015年7月22日 下午6:17:29
 * @version 
 */
public interface OnRequestDataListener {

	void onSuccess(String result);

	void onFail(String eirr);
}

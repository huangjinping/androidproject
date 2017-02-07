/** 


 * Project Name：Westinghouse 
 * File Name：UserManager.java 
 * Package Name：cn.cooperlink.westinghouse.util 
 * Date：2015-2-28 上午9:19:33 
 * Copyright (c) 2015, cooperlink.cn All Rights Reserved. 
 * 北京酷博灵科信息技术有限公司
 */
package cn.cooperlink.privatetutor.utils;

import android.content.Context;
import cn.cooperlink.privatetutor.model.dto.mobileInterface.Interface_001Response;


/**
 * @Title：用户管理
 * @Description：
 * @Package
 * @ClassName UserManager
 * @author harris
 * @date 2015-2-28 上午9:19:33
 * @version
 */
public class UserManager {
	private static  final     String  LOGIN_USER="LOGIN_USER";
	
	   
	
	
	
	
	public  static   void   saveUser(Context  context,Interface_001Response response){
		PreferencesUtils utils = new PreferencesUtils(context, LOGIN_USER);
		try {
			utils.putString(LOGIN_USER, JacksonJsonUtil.beanToJson(response));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Interface_001Response getUser(Context context) {
		PreferencesUtils utils = new PreferencesUtils(context, LOGIN_USER);
		String userMessage = utils.getString(LOGIN_USER, "");
		Interface_001Response body = null;
		try {
			body = (Interface_001Response) JacksonJsonUtil.jsonToBean(userMessage, Interface_001Response.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return body;
	}
}

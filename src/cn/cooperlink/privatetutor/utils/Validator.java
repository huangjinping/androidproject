/** 
 * Project Name：Westinghouse 
 * File Name：Validator.java 
 * Package Name：cn.cooperlink.westinghouse.util 
 * Date：2014-10-22 下午1:55:59 
 * Copyright (c) 2014, cooperlink.cn All Rights Reserved. 
 * 北京酷博灵科信息技术有限公司
 */
package cn.cooperlink.privatetutor.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Title：校验类
 * @Description：
 * @Package cn.cooperlink.westinghouse.util
 * @ClassName Validator
 * @author harris
 * @date 2014-10-22 下午1:55:59
 * @version
 */
public class Validator {

	public  static  final String   USERNAME_REGEX ="^[0-9a-zA-Z_]{6,10}$";
	/** 密码正则 */
	public static final String PASSWORD_REGEX = "^[a-zA-Z0-9_]+$";
	/** 手机号码长度11位 */
	public static final int MOBILE_NUM_LENGTH = 11;
	/** 验证手机号码正则 */
	public static final String MOBILE_NUM_REGEX = "^0{0,1}(13[0-9]|15[0-9]|18[0-9]|14[0-9])[0-9]{8}$";

	public  static  final String  EMAIL=	"^\\s*\\w+(?:\\.{0,1}[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+\\s*$";
	/**
	 * 验证电话号码是否合法。
	 * 
	 * @param mobileNum
	 *            手机号码
	 * @return true 合法； false 不合法
	 */
	public static boolean validateMobile(String mobileNum) {
		mobileNum = mobileNum.trim();
		if (mobileNum.length() != MOBILE_NUM_LENGTH
				|| !StringUtils.isNumber(mobileNum)) {
			// 手机长度11位，切为纯数字
			return false;
		}
		return doMatches(MOBILE_NUM_REGEX, mobileNum);
	}

	
	
	
	
	/**
	 * @Title: validateEmail
	 * @Description:教研邮箱
	 * @param email
	 * @return
	 */
		
	public static boolean  validateEmail(String  email){
		
	
		
		
		return doMatches(EMAIL, email);
		
	}
	
	
	
	
	/**
	 * 正则表达式验证。
	 * 
	 * @param regex
	 *            正则表达式
	 * @param input
	 *            要验证的字符串
	 * @return true 验证通过；false 验证失败
	 */
	public static boolean doMatches(String regex, String input) {
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		return m.matches();
	}

	/**
	 * @Title: validatorPassword
	 * @Description:教研密码
	 * @param input
	 * @return
	 */

	public static boolean validatorPassword(String input) {
		Pattern pat = Pattern.compile("[\\da-zA-Z]{6,20}");
		Pattern patno = Pattern.compile(".*\\d.*");
		Pattern paten = Pattern.compile(".*[a-zA-Z].*");
		Matcher mat = pat.matcher(input);
		Matcher matno = patno.matcher(input);
		Matcher maten = paten.matcher(input);
		if (matno.matches() && maten.matches() && mat.matches()) {
			return true;
		}
		return false;
	}
	
	
    
    /**
     * @Title: validateName
     * @Description:校验用户名   true:校验正确， false:校验失败；
     * @param name
     * @return
     */
    	
    public static  boolean  validateName(String name ){
    	
		return doMatches(USERNAME_REGEX, name);
    }
	
	
	
	
	/**
	 * 验证密码是否合法。
	 * @param password 密码
	 * @return true 合法； false 不合法
	 */
	public static boolean validatePassword(String password) {
		int len = password.length();
		if (len > 20 || len < 6) {
			return false;
		}
		return doMatches(PASSWORD_REGEX, password);
	}
}

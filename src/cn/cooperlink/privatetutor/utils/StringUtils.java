/** 
 * Project Name：CommunityService 
 * File Name：StringUtils.java 
 * Package Name：com.cooperlink.communityservice.utils 
 * Date：2015-4-10 下午8:45:03 
 * Copyright (c) 2015, cooperlink.cn All Rights Reserved. 
 * 北京酷博灵科信息技术有限公司
 */
package cn.cooperlink.privatetutor.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.widget.TextView;

/**
 * @Title：字符串工具
 * @Description：
 * @Package com.cooperlink.communityservice.utils
 * @ClassName StringUtils
 * @author harris   
 * @date 2015-4-10 下午8:45:03
 * @version 
 */
@SuppressLint("SimpleDateFormat")
public class StringUtils {

	
	public  static final String  FORMATESTRING="0.00";
	
	
	
	
	/**
	 * @Title: getAppendPicIdString
	 * @Description:字符串拼接图片id
	 * @param list
	 * @return
	 */
		
	public  static String getAppendPicIdString(List<String> list) {
		// TODO Auto-generated method stub

		StringBuffer buffer=new StringBuffer();
		for (String picID:list) {
			if (!TextUtils.isEmpty(picID)) {
				buffer.append(picID);
				buffer.append(",");
			}
		}
		
		String  content = buffer.toString();
		if (content.length()>1) {
			content=content.substring(0, content.length()-1);
			
		}else{
			
			content="";
		}
		return content;
	}
	
	
	
	
	
	
	

	
	/**
	 * @Title: getSimpleFormatString
	 * @Description:简单的格式
	 * @param strDate
	 * @return
	 */
		
	public static String  getSimpleFormatString(String strDate){
		String format="";
		
		try {
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//小写的mm表示的是分钟  
	
		Date date=sdf.parse(strDate);
			
			
		 format = sdf.format(date);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			format="";
			
		}
		return format;  

		
	}
	
	
	
	
	/**
	 * 验证为空（不对入参去空格处理，" " 也表示有字符）
	 * 
	 * @param str
	 * @return true 空；false 非空
	 */
	public static boolean isEmpty(String str) {
		if (str == null || "".equals(str)) {
			return true;
		}
		return false;
	}

	/**
	 * 验证非空（不对入参去空格处理，" " 也表示有字符）
	 * 
	 * @param str
	 * @return true 非空；false 空
	 */
	public static boolean isNotEmpty(String str) {
		if (str != null && str.length() > 0) {
			return true;
		}
		return false;
	}

	/**
	 * 验证为空（会对入参去空格处理）
	 * 
	 * @param str
	 * @return true 空；false 非空
	 */
	public static boolean isBlank(String str) {
		if (str == null || "".equals(str.trim())) {
			return true;
		}
		return false;
	}

	/**
	 * 验证非空（会对入参去空格处理）
	 * 
	 * @param str
	 * @return true 非空；false 空
	 */
	public static boolean isNoBlank(String str) {
		if (str != null && str.trim().length() > 0) {
			return true;
		}
		return false;
	}

	/**
	 * 将年月日合并为给定分隔符的字符串 例：year=2013，month=1，day=31，toten=/ 合并结果 2013/01/31
	 * 
	 * @param year
	 *            年
	 * @param month
	 *            月 1-12
	 * @param day
	 *            日 1-31
	 * @param token
	 *            分割符号
	 * @return 日期字符串
	 */
	public static String combinateDate2String(int year, int month, int day,
			String token) {
		String m = (month > 9 ? String.valueOf(month) : "0" + month);
		String d = (day > 9 ? String.valueOf(day) : "0" + day);
		return year + token + m + token + d;
	}

	/**
	 * 字符串是否是纯数字
	 * 
	 * @param c
	 * @return true 数字； false 非数字
	 */
	public static boolean isNumber(String str) {
		if (isBlank(str)) {
			return false;
		}
		char c;
		int len = str.length();
		for (int i = 0; i < len; i++) {
			c = str.charAt(i);
			if (c < '0' || c > '9') {
				return false;
			}
		}
		return true;
	}

	/**
	 * 字符是否是数字
	 * 
	 * @param c
	 * @return true 数字； false 非数字
	 */
	public static boolean isNumber(char c) {
		if (c < '0' || c > '9') {
			return false;
		}
		return true;
	}

	/**
	 * 将首字符转换为大写
	 * 
	 * @param str
	 * @return
	 */
	public static String initcap(String str) {
		if (isBlank(str)) {
			return null;
		}
		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}

	/**
	 * 从身份证中提取生日。
	 * 
	 * @param idCard
	 * @param token
	 *            间隔符号
	 * @return
	 */
	public static String fetchBirthdayFromIdCard(String idCard, String token) {
		if (idCard == null || idCard.length() < 14) {
			return "";
		}
		String year = "";
		String month = "";
		String day = "";

		if (idCard.length() == 15) {
			idCard = idCard.substring(0, 6) + "19" + idCard.substring(6);
		}
		year = idCard.substring(6, 10);
		month = idCard.substring(10, 12);
		day = idCard.substring(12, 14);
		return year + token + month + token + day;
	}

	/**
	 * 从身份证中提取性别
	 * 
	 * @param idCard
	 * @return
	 */
	public static String fetchGenderFromIdCard(String idCard) {
		if (idCard == null || idCard.length() < 15) {
			return null;
		}
		if (idCard.length() == 15) {
			char c = idCard.charAt(14);
			System.out.println(c);
			if (c % 2 == 0) {
				return "2";
			}
			return "1";
		}
		if (idCard.length() == 18) {
			char c = idCard.charAt(16);
			System.out.println(c);
			if (c % 2 == 0) {
				return "2";
			}
			return "1";
		}
		return null;
	}

	
	
	
	
	
	
	
	/**
	 * @Title: setNumberShow  显示字段
	 * @param number  
	 * @param int_view
	 * @param float_view
	 */
	public static    void     setNumberShow(String  number,TextView int_view,TextView float_view){
		 int_view.setText("");
		 float_view.setText("");
		try {
			if (TextUtils.isEmpty(number)) {
			return;
			
			}
			if (!number.contains(".")) {
				   
				int_view.setText(number);
			}else{
				String[] split = number.split("[.]+");
				int_view.setText(split[0]);
				 float_view.setText("."+split[1]);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		
	}
	
	public static    String   getUUID() {
return  UUID.randomUUID().toString();

	}
	
}

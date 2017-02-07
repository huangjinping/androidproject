package cn.cooperlink.privatetutor.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class StringAndDateUtil
{
	//FIXME 此为常用日期格式，如有特殊需要请自行修改
	static SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	
	
	
	public static String  getTimeString(Date date){
		String format = dateformat.format(date);
		return format;
		
		
		
	}
	
	
	
	
	/**
	 * 将字符串转换为日期
	 */
	public static Date getTimeStemp(String str){
        Date d = null;
        try {
            d = dateformat.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return d;
    }
	public static boolean checkInput(String aString,String reg)
	{
		
		if(aString == null || aString.length() == 0)
			return false;
		Pattern pattern = Pattern.compile(reg);
		Matcher isNum = pattern.matcher(aString);
		if( !isNum.matches() )
		{
			return false;
		}
		return true;
	}
    /**
     * @param DATE1 当前日期
     * @param DATE2 选择日期
     * @return
     */
    public static boolean compare_date(String DATE1, String DATE2) {
        
        try {
            Date dt1 = dateformat.parse(DATE1);
            Date dt2 = dateformat.parse(DATE2);
            if (dt1.getTime() > dt2.getTime()) {
                return true;
            } else if (dt1.getTime() < dt2.getTime()) {
                return false;
            } else {
                return true;
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return false;
    }

    /**
     * 字符串转化为日期
     * @param date
     * @return
     */
    public static Date strToDate(String date){
		Date t;
		try {
			t = dateformat.parse(date);
			return t;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
    
	/**
	 * 得到当前日期
	 * @return
	 */
	public static String getCurDate(){
		Calendar  date	  = Calendar.getInstance();
		String curDate	 =  dateformat.format( date.getTime());
		return curDate;
	}
    /**
     * compare the date
     * @param inputDate
     * @return
     */
    public static  boolean getDateTest(Date inputDate){
		Calendar c = Calendar.getInstance();
		Calendar c1 = Calendar.getInstance();
		
		c.setTime(inputDate);
        c1.setTime(new Date());
        
		int year = c.get(Calendar.YEAR);
		int year_now = c1.get(Calendar.YEAR); 
		int month = c.get(Calendar.MONTH);
        int month_now = c1.get(Calendar.MONTH);
        boolean flag  = false;
		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		int dayofMonth_now = c1.get(Calendar.DAY_OF_MONTH);
		if(year_now - year > 18){
			flag = true;
		}
		if(year_now - year == 18){
			if(month_now - month >= 0 ){
				if(dayofMonth_now - dayOfMonth >= 0){
					flag = true;
				}
			}
		}
 		
		return flag;
	}
    /**
     *未成年年龄的判断 
     * @param DATE1
     * @param DATE2
     * @return
     */
    public static boolean isYounth(String DATE2){
        try {
        	String DATE1 = dateformat.format(new Date());
            Date dt1 = dateformat.parse(DATE1);
            Date dt2 = dateformat.parse(DATE2);
            long eighteenTime = 18 * 365;
            eighteenTime*= 24;
            eighteenTime *= 3600000;
            
            long dt1_time = dt1.getTime();
            long birth_add_time = dt2.getTime() + eighteenTime;
            
            if (dt1_time> birth_add_time){
                return false;
            } else if (dt1_time < birth_add_time) {
                return true;
            } else {
                return false;
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return false;
    }

    	
}

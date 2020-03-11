package com.utils.dateutil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
	
public class DateUtil {
	
	//获取第一天 String类型参数
	public static Date getFirstDateForMonth(String date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date parse=null;
		try {
			parse = format.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date dateInfo = getFirstDateForMonth(parse);
		return dateInfo;
	}
	

	//获取第一天 Date类型参数
	public static Date getFirstDateForMonth(Date date) {
		Calendar calendar =Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.DAY_OF_MONTH,1);
		calendar.set(Calendar.HOUR_OF_DAY,0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		
		return calendar.getTime();
	} 
	
	//获取最后一天 String类型参数
	public  static Date getLastDateForMonth(String date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date parse=null;
		try {
			parse = format.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date dateInfo = getLastDateForMonth(date);
		return dateInfo;
		
		
	}
	
	//获取最后一天 Date类型参数
	public  static Date getLastDateForMonth(Date date) {
		Calendar calendar =Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH,1);
		Date firstDateForMonth = getFirstDateForMonth(calendar.getTime());
		calendar.setTime(firstDateForMonth);
		calendar.add(Calendar.SECOND, -1);
		return calendar.getTime();
	}
	
	
}

package com.stly7.eland.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 找出下个月的倒数第3天是哪天
 * @author Administrator
 *
 */
public class month_calendar {
	
	//因为calendar是单例设计模式
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		//首先知道现在是哪一个月
		 Calendar c =  Calendar.getInstance();
		 
		 //获取当前的事件
		 Date now = c.getTime();
		 
		 c.setTime(now);
		 c.add(Calendar.MONTH, 2);
		 c.set(Calendar.DATE, -3);
		 
		 SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		 System.out.println(format.format(c.getTime()));
	}
}

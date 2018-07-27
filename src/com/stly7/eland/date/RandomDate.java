package com.stly7.eland.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RandomDate {
	
	public static void main(String[] args) throws Exception {
		//首先需要把事件转换成10进制的数
        String start_str = "1995.1.1 00:00:00";
        String end_str = "1995.12.31 23:59:59";
        
        SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        Date start_date = format.parse(start_str);
        Date end_date = format.parse(end_str);
        
        long start = start_date.getTime();
        long end = end_date.getTime();
        
        long r = start + (long) (Math.random() * (end - start));
        Date r_date = new Date(r);
        System.out.println(r_date);
        
        
	}
}

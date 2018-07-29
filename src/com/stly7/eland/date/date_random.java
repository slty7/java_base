package com.stly7.eland.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * ���������������һ����1995.1.1 00:00:00 �� 1995.12.31 23:59:59 ֮����������
 * @author Administrator
 *
 */
public class date_random {
	
	public static void main(String[] args) throws Exception {
		
		//������Ҫ���¼�ת����10���Ƶ���
		String start_str = "1995.1.1 00:00:00";
		String end_str = "1995.12.31 23:59:59";
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		Date start_date = format.parse(start_str);
		Date end_date = format.parse(end_str);
		
		long start = start_date.getTime();
		long end= end_date.getTime();
		
		int bound = (int) (end - start);
		
		Random random = new Random();
		int r = random.nextInt(bound);
		System.out.println(r);
		
		Date r_date = new Date(start + r);
		System.out.println(start_date);
		System.out.println(end_date);
		System.out.println(r_date);
		
	}
}

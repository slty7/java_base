package com.stly7.eland.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * �ҳ��¸��µĵ�����3��������
 * @author Administrator
 *
 */
public class month_calendar {
	
	//��Ϊcalendar�ǵ������ģʽ
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		//����֪����������һ����
		 Calendar c =  Calendar.getInstance();
		 
		 //��ȡ��ǰ���¼�
		 Date now = c.getTime();
		 
		 c.setTime(now);
		 c.add(Calendar.MONTH, 2);
		 c.set(Calendar.DATE, -3);
		 
		 SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		 System.out.println(format.format(c.getTime()));
	}
}

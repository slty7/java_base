package com.stly7.eland.date;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * ׼��һ��������9����������
	ʹ��1970��-2000��֮���������ڳ�ʼ��������
	������Щ���ڵ�ʱ�������������
	���� 1988-1-21 12:33:22 �ͻ����� 1978-4-21 19:07:23 ǰ�棬��Ϊ����ʱ���С����Ȼ���ڸ���
 * @author Administrator
 *
 */
public class DateArray_sort {
	int length = 9;
	
	static Date[] arr_date = new Date[9];
	//���ڴ洢ת��
	static String[] strs = new String[9];
	//���ڴ�String[] �����ĶԱȵ�ֵ
	static Date[] new_arr_date = new Date[9];
	//��ʽ��Date yyyy-MM-dd HH:mm:ss
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	
	//������
	public static void main(String[] args) throws Exception {
		DateArray_sort dateArray = new DateArray_sort();
		dateArray.GenDateArrayAndSort();
		
	}
	
	// ���������������
	public void GenDateArrayAndSort() throws Exception {
		//���ڽ�ȡ���һ�ε��ַ���
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		for (int i = 0; i < arr_date.length; i++) {
			arr_date[i] = RandomDate();
			//���´���һ��������еĸ�ʽ
			System.out.println("����--->" + simpleDateFormat.format(arr_date[i]));
		}
		System.out.println("=================");
		
		// ���ɲ���
		for (int i = 0; i < strs.length; i++) {
			//���ת������Ҫ
			strs[i] = sdf.format(arr_date[i]);
		}
		// ����
		Arrays.sort(strs);
		
		for (int i = 0; i < strs.length; i++) {
			for (int j = 0; j < arr_date.length; j++) {
				//����һ��Ҫ��equles,��ͬ�ľ�ֱ�Ӹ��Ƶ��µ�������
				if (strs[i].equals(sdf.format(arr_date[j]))) {
					new_arr_date[i] = arr_date[j];
				}
			}
		}
		
		// ����ֵ��ͨ��ֵ�����һ������.
		for (Date date : new_arr_date) {
			System.out.println(simpleDateFormat.format(date));
		}
		
	}
	
	// �����������
	public Date RandomDate() throws Exception {
		
		String end_str = "1999-12-31 23:59:59";
		Date end_date = simpleDateFormat.parse(end_str);
		long r = end_date.getTime() - new Date(0).getTime();
		r = (long) (Math.random() * r);
		
		return new Date(new Date(0).getTime() + r);
	}
	
}

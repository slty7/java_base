package com.stly7.eland.collection.arrayList_vs_linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * �Ƚ� ArrayList��LinkedList ����������100000�����ݣ�˭��˭����Ϊʲô��
 * @author Administrator
 *
 */
public class LastInsert {
	
	public static void main(String[] args) {
		List list;
		list = new ArrayList<>();
		insert(list, "ArrayList");
		list = new LinkedList<>();
		insert(list, "LinkedList");
	}
	public static void insert(List list, String Type) {
		// TODO Auto-generated method stub
		//��100 * 1000��ʱ��arrayList ��LinkedList
		int total = 1000 * 1000;
		final int number = 5;
		/**
		 * ֱ�ӵ���add�������ͱ�ʾ������������
		 * ��Ϊ�ǲ���������棬���Զ���������ԣ���û��һ���ƶ��ܶ����ݵ���Ҫ������Ҳ�ǳ��Ŀ�
		 * ��������ͺܿ죬���۲���������
		 */
		long start = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			list.add(number);
	    }
		long end = System.currentTimeMillis();
		System.out.println(Type + "-----" + (end - start));
	}
}

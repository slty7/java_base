package com.stly7.eland.collection.arrayList_vs_linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * ��ʾ�ڵ�ǰ������һ���λ�ã���������
 * �����λ�ò�������
 * ���鶨λ�ܿ죬�������ݱȽ���
 * ����λ�������������ݱȽϿ�
 * ����֣���������10000����ʱ������λ���ܿ�֧Ҫ�����������ܿ�֧���࣬�������������֣��������á�
 * ���������1000����������ܾͲ�һ���ˡ�
 * @author Administrator
 *
 */
public class MindInsert {

	public static void main(String[] args) {
		List list;
		list = new ArrayList<>();
		mindInsert(list, "ArrayList");
		list = new LinkedList<>();
		mindInsert(list, "LinkedList");
	}
	public static void mindInsert(List list, String type) {
		// TODO Auto-generated method stub
		int total = 100000;
		final int number = 5;
		/**
		 * ֱ�ӵ���add�������ͱ�ʾ������������
		 * ��Ϊ�ǲ���������棬���Զ���������ԣ���û��һ���ƶ��ܶ����ݵ���Ҫ������Ҳ�ǳ��Ŀ�
		 * ��������ͺܿ죬���۲���������
		 */
		long start = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			list.add(list.size() / 2 ,number);
	    }
		//�����������һ��������ArrayList�ȽϿ�
		//list.add(list.size() / 2, number);
		long end = System.currentTimeMillis();
		System.out.println(type + (end - start));
	}
}

package com.stly7.eland.collection.compara;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Ĭ������£�TreeSet�е������Ǵ�С��������ģ�����TreeSet�Ĺ��췽��֧�ִ���һ��Comparator
 * public TreeSet(Comparator comparator) 
 * ͨ��������췽������һ��TreeSet��ʹ�����еĵ������ǵ������
 * @author Administrator
 *
 */
public class MyTreeSet {
	public static void main(String[] args) {
		// ����һ��comparator�Ƚ���
		Comparator c = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		};
		
		
		Set<Integer> set = new TreeSet<>(c);
		for (int i = 0; i < 10; i++) {
			set.add(i);
		}
		System.out.println(set);
	}
}

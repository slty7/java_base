package com.stly7.eland.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.stly7.eland.collection.bean.Hero;

/*
 * ʹ��HashMap ��ͬ���Ĳ���
 * 1. ��ʼ��2000000������HashMap�С�
 * 2. ����10�β�ѯ
 * 3. ͳ��ÿһ�εĲ�ѯ���ĵ�ʱ��
 * ���Թ۲쵽����������ʱ�䣬���ѵ�ʱ����1��������
 */
public class HashMapSearch {
	
	public static void main(String[] args) {
		Map<String, Hero> map = new HashMap<>();
		//��������
		int totle = 2000000;
		//��Ҫ��ѯ�Ĵ���
		int counter = 10;
		//searchKey
		String searchKey = "hero 1000000";
		
		for (int i = 0; i < totle; i++) {
			Hero hero = new Hero("hero " + i, i);
			map.put(hero.getName(), hero);
		}
		
		for (int i = 0; i < counter; i++) {
			long start = System.currentTimeMillis();
			Hero hero = map.get(searchKey);
			System.out.println(hero);
			long end = System.currentTimeMillis();
			System.out.println("��" + i + "�λ���ʱ��" + (end - start));
		}
	}
}

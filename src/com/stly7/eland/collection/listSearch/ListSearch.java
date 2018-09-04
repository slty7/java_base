package com.stly7.eland.collection.listSearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.stly7.eland.collection.bean.Hero;

/**
 * ������List�д�������ظ����ƣ�û��˳���2000000��Hero
 * Ҫ�����ֽ�����hero 1000000���Ķ����ҳ���
 * List�������Ƕ�ÿһ�����а���������ֱ���ҵ����ֽ�����hero 1000000����Ӣ�ۡ�
 * ��������£���Ҫ�����ͱȽ�2000000�Σ������ҵ���Ӧ��Ӣ�ۡ�
 * �����߼���
 * 1. ��ʼ��2000000������ArrayList��
 * 2. ���������е�����˳��
 * 3. ����10�β�ѯ��ͳ��ÿһ�����ĵ�ʱ��
 * ��ͬ���������������£�������ʱ����������ġ� �ڱ����ϣ�������ʱ������600��������
 * @author Administrator
 *
 */
public class ListSearch {
	public static void main(String[] args) {
		List<Hero> list = new ArrayList<>();
		int totle = 2000000;
		String regix = "hero 1000000";
		
		for (int i = 0; i < totle; i++) {
			list.add(new Hero("hero " + i, i));
		}
		
		for (int i = 0; i < 10; i++) {
			Collections.shuffle(list);
			long start = System.currentTimeMillis();
			for (Hero hero : list) {
				if (regix.equals(hero.getName())) {
					break;
				}
			}
			long end = System.currentTimeMillis();
			System.out.println("��" + i + "��: ����ʱ��Ϊ" + (end - start));
		}
	}
}

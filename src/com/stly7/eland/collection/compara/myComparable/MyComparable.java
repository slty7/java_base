package com.stly7.eland.collection.compara.myComparable;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
/**
 * ����Comparable�ӿڣ�ʹItem�߱����ռ۸�Ӹߵ�������
 * ��ʼ��10��Item,������Collections.sort�������򣬲鿴������
 * @author Administrator
 *
 */
public class MyComparable {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Set<Item> itemTreeSet = new TreeSet<>();
		
		
		for (int i = 0; i < 10; i++) {
			itemTreeSet.add(new Item("item " + i, new Random().nextInt(100)));
		}
		
		System.out.println(itemTreeSet);
	}
}

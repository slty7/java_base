package com.stly7.eland.collection.compara.myComparable;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
/**
 * 借助Comparable接口，使Item具备按照价格从高到低排序。
 * 初始化10个Item,并且用Collections.sort进行排序，查看排序结果
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

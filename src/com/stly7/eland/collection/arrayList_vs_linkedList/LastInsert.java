package com.stly7.eland.collection.arrayList_vs_linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * 比较 ArrayList和LinkedList 在最后面插入100000条数据，谁快谁慢？为什么？
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
		//当100 * 1000的时候arrayList 慢LinkedList
		int total = 1000 * 1000;
		final int number = 5;
		/**
		 * 直接调用add方法，就表示在最后插入数据
		 * 因为是插入在最后面，所以对于数组而言，并没有一个移动很多数据的需要，所以也非常的快
		 * 而链表本身就很快，无论插入在哪里
		 */
		long start = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			list.add(number);
	    }
		long end = System.currentTimeMillis();
		System.out.println(Type + "-----" + (end - start));
	}
}

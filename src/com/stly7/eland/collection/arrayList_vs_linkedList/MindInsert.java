package com.stly7.eland.collection.arrayList_vs_linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * 表示在当前容器的一半的位置，插入数据
 * 在这个位置插入数据
 * 数组定位很快，插入数据比较慢
 * 链表定位很慢，插入数据比较快
 * 最后发现，当总数是10000条的时候，链表定位的总开支要比数组插入的总开支更多，所以最后整体表现，数组会更好。
 * 如果总数是1000条，结果可能就不一样了。
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
		 * 直接调用add方法，就表示在最后插入数据
		 * 因为是插入在最后面，所以对于数组而言，并没有一个移动很多数据的需要，所以也非常的快
		 * 而链表本身就很快，无论插入在哪里
		 */
		long start = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			list.add(list.size() / 2 ,number);
	    }
		//如果单独插入一个个话是ArrayList比较快
		//list.add(list.size() / 2, number);
		long end = System.currentTimeMillis();
		System.out.println(type + (end - start));
	}
}

package com.stly7.eland.collection.compara;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 默认情况下，TreeSet中的数据是从小到大排序的，不过TreeSet的构造方法支持传入一个Comparator
 * public TreeSet(Comparator comparator) 
 * 通过这个构造方法创建一个TreeSet，使得其中的的数字是倒排序的
 * @author Administrator
 *
 */
public class MyTreeSet {
	public static void main(String[] args) {
		// 传入一个comparator比较器
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

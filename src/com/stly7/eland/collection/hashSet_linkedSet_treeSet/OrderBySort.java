package com.stly7.eland.collection.hashSet_linkedSet_treeSet;

import java.nio.charset.Charset;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 利用LinkedHashSet的既不重复，又有顺序的特性，把Math.PI中的数字，
 * 按照出现顺序打印出来，相同数字，只出现一次
 * @author Administrator
 *
 */
public class OrderBySort {
	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		double pi = Math.PI;
		String str = String.valueOf(pi);
		
		str = str.replace(".", "");
		System.out.println(str);
		char[] cs = str.toCharArray();
		
		for (char c : cs) {
			set.add(Integer.parseInt(String.valueOf(c)));
		}
		System.out.println(set);
	}
}

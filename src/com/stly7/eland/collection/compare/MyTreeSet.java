package com.stly7.eland.collection.compare;

import java.util.Comparator;

/**
 * 默认情况下，TreeSet中的数据是从小到大排序的，不过TreeSet的构造方法支持传入一个Comparator
 * public TreeSet(Comparator comparator) 
 * 通过这个构造方法创建一个TreeSet，使得其中的的数字是倒排序的
 * @author Administrator
 *
 */
public class MyTreeSet {
	
	public MyTreeSet() {
		
	}
	
	public MyTreeSet(Comparator comparator){
		this();
	}
}

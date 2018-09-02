package com.stly7.eland.collection.arrayList_vs_hashSet;

import java.util.HashSet;
import java.util.Random;

/**
 * 生成50个 0-9999之间的随机数，要求不能有重复的
 * @author Administrator
 *
 */
public class Test {
	
	public static void main(String[] args) {
		Random random = new Random();
		
		HashSet<Integer> hashSet = new HashSet<>();
		
		//注意随机的数的范围一定要大于size
		while(hashSet.size() < 51) {
			hashSet.add(random.nextInt(9999));
		}
		
		System.out.println(hashSet);
	}
}

package com.stly7.eland.collection.arrayList_vs_hashSet;

import java.util.HashSet;
import java.util.Random;

/**
 * ����50�� 0-9999֮����������Ҫ�������ظ���
 * @author Administrator
 *
 */
public class Test {
	
	public static void main(String[] args) {
		Random random = new Random();
		
		HashSet<Integer> hashSet = new HashSet<>();
		
		//ע����������ķ�Χһ��Ҫ����size
		while(hashSet.size() < 51) {
			hashSet.add(random.nextInt(9999));
		}
		
		System.out.println(hashSet);
	}
}

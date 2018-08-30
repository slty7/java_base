package com.stly7.eland.collection.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * ���ȳ�ʼ��һ��List,������10��ֵ��0-9��
 * Ȼ�󲻶ϵ�shuffle��ֱ��ǰ3λ����
 * 3 1 4
 * shuffle 1000,000 �Σ�ͳ�Ƴ��ֵĸ���
 * @author Administrator
 *
 */
public class Count {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		//����̰߳�ȫ����
		AtomicInteger count =  new AtomicInteger(0);
		AtomicInteger c =  new AtomicInteger(0);
		int counter = 0;
		
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		//Ȼ��ת���̰߳�ȫ��
		List<Integer> synchronizedList = Collections.synchronizedList(list);
		while(count.getAndIncrement() < 1000000) {
			Collections.shuffle(synchronizedList);
			if (synchronizedList.get(0) == 3 && synchronizedList.get(1) == 1 && synchronizedList.get(2) == 4) {
				counter = c.getAndIncrement();
			}
		}
		System.out.println(counter);
	}
}

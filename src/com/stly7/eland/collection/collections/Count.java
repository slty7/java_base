package com.stly7.eland.collection.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 首先初始化一个List,长度是10，值是0-9。
 * 然后不断的shuffle，直到前3位出现
 * 3 1 4
 * shuffle 1000,000 次，统计出现的概率
 * @author Administrator
 *
 */
public class Count {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		//解决线程安全问题
		AtomicInteger count =  new AtomicInteger(0);
		AtomicInteger c =  new AtomicInteger(0);
		int counter = 0;
		
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		//然后转成线程安全的
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

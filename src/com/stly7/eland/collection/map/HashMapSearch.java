package com.stly7.eland.collection.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.stly7.eland.collection.bean.Hero;
/**
 * 准备一个ArrayList其中存放3000000(三百万个)Hero对象，其名称是随机的,格式是hero-[4位随机数]
 * hero-3229
 * hero-6232
 * hero-9365
 * @author Administrator
 *
 */
public class HashMapSearch {
	
	
	public static void main(String[] args) {
		List<Hero> list = new ArrayList<>();
		List<Hero> list1;
		List<Hero> list2;
		HashMapSearch search = new HashMapSearch();
		list1 = search.add(list);
		list2 = list1;
		
		long start1 = System.currentTimeMillis();
		search.forEch(list1);
		long end1 = System.currentTimeMillis();
		System.out.println(end1 - start1);
	}
	
	//添加随机数
	public List<Hero> add(List<Hero> list) {
		Random random = new Random();
		for (int i = 0; i < 3000000; i++) {
			list.add(new Hero("hero" + random.nextInt(10000), i));
		}
		return list;
	}
	
	//用for循环找出来
	public void forEch(List<Hero> list) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			if ("hero-5555".equals(list.get(i).getName())) {
				System.out.println(list.get(i).getName());
				count ++;
			}
		}
		System.out.println(count);
	}
	
	
}

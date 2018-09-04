package com.stly7.eland.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.stly7.eland.collection.bean.Hero;

/*
 * 使用HashMap 做同样的查找
 * 1. 初始化2000000个对象到HashMap中。
 * 2. 进行10次查询
 * 3. 统计每一次的查询消耗的时间
 * 可以观察到，几乎不花时间，花费的时间在1毫秒以内
 */
public class HashMapSearch {
	
	public static void main(String[] args) {
		Map<String, Hero> map = new HashMap<>();
		//插入总数
		int totle = 2000000;
		//需要查询的次数
		int counter = 10;
		//searchKey
		String searchKey = "hero 1000000";
		
		for (int i = 0; i < totle; i++) {
			Hero hero = new Hero("hero " + i, i);
			map.put(hero.getName(), hero);
		}
		
		for (int i = 0; i < counter; i++) {
			long start = System.currentTimeMillis();
			Hero hero = map.get(searchKey);
			System.out.println(hero);
			long end = System.currentTimeMillis();
			System.out.println("第" + i + "次花费时间" + (end - start));
		}
	}
}

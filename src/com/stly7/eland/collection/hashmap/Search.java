package com.stly7.eland.collection.hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.stly7.eland.collection.bean.Hero;

public class Search {
	public static void main(String[] args) {
		List<Hero> list = new ArrayList<>();
		int totle = 20000;
		String regix = "hero 10000";
		
		MyHashMap map = new MyHashMap();
		for (int i = 0; i < totle; i++) {
			Hero hero = new Hero("hero " + i, i);
			list.add(hero);
			map.put(hero.getName(), hero);
		}
		listSearch(list, regix);
		
		long start = System.currentTimeMillis();
		map.get(regix);
		long end = System.currentTimeMillis();
		System.out.println("map所用的时间" + (end - start));
		
	}
	
	// list查询
	private static void listSearch(List<Hero> list, String regix) {
		Collections.shuffle(list);
		long start = System.currentTimeMillis();
		for (Hero hero : list) {
			if (regix.equals(hero.getName())) {
				break;
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("list所用的时间" + (end - start));
	}
	
}

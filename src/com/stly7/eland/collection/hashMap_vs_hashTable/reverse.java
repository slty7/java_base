package com.stly7.eland.collection.hashMap_vs_hashTable;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * HashMap和Hashtable都实现了Map接口，都是键值对保存数据的方式
 * 区别1： 
 * HashMap可以存放 null
 * Hashtable不能存放null
 * 区别2：
 * HashMap不是线程安全的类
 * Hashtable是线程安全的类
 * 
 * 鉴于目前学习的进度，不对线程安全做展开，在线程章节会详细讲解
 * @author Administrator
 *
 */
public class reverse {
	/**
	 * 使用如下键值对，初始化一个HashMap：
	 * adc - 物理英雄
	 * apc - 魔法英雄
	 * t - 坦克
	 * 对这个HashMap进行反转，key变成value,value变成key
	 * 提示： keySet()可以获取所有的key, values()可以获取所有的value
	 */
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		Map<String, String> newMap = new HashMap<>();
		map.put("adc", "物理英雄");
		map.put("apc", "魔法英雄");
		map.put("t", "坦克");
		
		System.out.println("反转前"+ map);
		
		Set<String> keySet = map.keySet();
		System.out.println("---" + keySet);
		// 清除还不能乱添加
		// map.clear();
		for (String key : keySet) {
			String value = map.get(key);
			newMap.put(value, key);
		}
		map.clear();
		System.out.println("反转后"+ newMap);
	}
	
}

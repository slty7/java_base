package com.stly7.eland.collection.hashmap;

import java.util.LinkedList;

/**
 * 根据前面学习的hashcode的原理和自定义hashcode, 设计一个MyHashMap，实现接口IHashMap
 * MyHashMap内部由一个长度是2000的对象数组实现。
 * 设计put(String key,Object value)方法
 * 首先通过上一个自定义字符串的hashcode练习获取到该字符串的hashcode,然后把这个hashcode作为下标，定位到数组的指定位置。 
 * 如果该位置没有数据，则把字符串和对象组合成键值对Entry，再创建一个LinkedList，把键值对，放进LinkedList中，最后把LinkedList 保存在这个位置。
 * 如果该位置有数据，一定是一个LinkedList,则把字符串和对象组合成键值对Entry，插入到LinkedList后面。
 * 
 * 设计 Object get(String key) 方法
 * 首先通过上一个自定义字符串的hashcode练习获取到该字符串的hashcode,然后把这个hashcode作为下标，定位到数组的指定位置。 
 * 如果这个位置没有数据，则返回空
 * 如果这个位置有数据，则挨个比较其中键值对的键-字符串，是否equals，找到匹配的，把键值对的值，返回出去。找不到匹配的，就返回空
 * @author Administrator
 *
 */
public class MyHashMap implements IHashMap {
	//2000是hash的算法值
	LinkedList<Entry>[] values = new LinkedList[2000];
	
	@Override
	public void put(String key, Object object) {		// TODO Auto-generated method stub
		int hashcode = hashcode(key);
		
		//招到对应的LinkedList
		LinkedList<Entry> list = values[hashcode];
		// 如果LinkedList是null，则创建一个LinkedList
        if (null == list) {
            list = new LinkedList<>();
            values[hashcode] = list;
        }
        
        // 判断该key是否已经有对应的键值对
        boolean found = false;
        for (Entry entry : list) {
            // 如果已经有了，则替换掉
            if (key.equals(entry.key)) {
                entry.value = object;
                found = true;
                break;
            }
        }
 
        // 如果没有已经存在的键值对，则创建新的键值对
        if (!found) {
            Entry entry = new Entry(key, object);
            list.add(entry);
        }
        
        // 如果没有已经存在的键值对，则创建新的键值对
        if (!found) {
            Entry entry = new Entry(key, object);
            list.add(entry);
        }
        
	}

	@Override
	public Object get(String key) {
		 int hashcode = hashcode(key);
	        // 找到hashcode对应的LinkedList
	        LinkedList<Entry> list = values[hashcode];
	        if (null == list)
	            return null;
	 
	        Object result = null;
	 
	        // 挨个比较每个键值对的key，找到匹配的，返回其value
	        for (Entry entry : list) {
	            if (entry.key.equals(key)) {
	                result = entry.value;
	                break;
	            }
	        }
	 
	        return result;
	}
	
	
	// 生成本地的hashcode
	private static int hashcode(String str) {
		if(0==str.length())
            return 0;
         
        int hashcode = 0;
        char[]cs= str.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            hashcode +=cs[i];
        }
        hashcode*=23;
        //取绝对值
        hashcode = hashcode<0?0-hashcode:hashcode;
        //落在0-1999之间
        hashcode %=2000;
        
        return hashcode;
	}
	
}

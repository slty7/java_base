package com.stly7.eland.collection.hashmap;

import java.util.ArrayList;
import java.util.List;

import com.stly7.eland.collection.bean.Hero;
/**
 * 根据前面学习的hashcode的原理和自定义hashcode, 设计一个MyHashMap，实现接口IHashMap

MyHashMap内部由一个长度是2000的对象数组实现。

设计put(String key,Object value)方法
首先通过上一个自定义字符串的hashcode练习获取到该字符串的hashcode,然后把这个hashcode作为下标，定位到数组的指定位置。 
如果该位置没有数据，则把字符串和对象组合成键值对Entry，再创建一个LinkedList，把键值对，放进LinkedList中，最后把LinkedList 保存在这个位置。
如果该位置有数据，一定是一个LinkedList,则把字符串和对象组合成键值对Entry，插入到LinkedList后面。

设计 Object get(String key) 方法
首先通过上一个自定义字符串的hashcode练习获取到该字符串的hashcode,然后把这个hashcode作为下标，定位到数组的指定位置。 
如果这个位置没有数据，则返回空
如果这个位置有数据，则挨个比较其中键值对的键-字符串，是否equals，找到匹配的，把键值对的值，返回出去。找不到匹配的，就返回空
 * @author Administrator
 *
 */
public class List_vs_Map {
	    public static void main(String[] args) {
	        List<Hero> hs =new ArrayList<>();
	        System.out.println("初始化开始");
	        for (int i = 0; i < 100000; i++) {
	            Hero h = new Hero("hero-" + random(), i);
	            hs.add(h);
	        }
	        //名字作为key
	        //名字相同的hero，放在一个List中，作为value
	        MyHashMap heroMap =new MyHashMap();
	        for (Hero h : hs) {
	            List<Hero> list= (List<Hero>) heroMap.get( h.getName());
	            if(list==null){
	                list = new ArrayList<>();
	                heroMap.put(h.getName(), list);
	            }
	            list.add(h);
	        }
	          
	        System.out.println("初始化结束");
	        System.out.println("开始查找");
	        findByIteration(hs);
	        findByMap(heroMap);
	          
	    }
	    private static List<Hero> findByMap(MyHashMap m) {
	        long start =System.currentTimeMillis();
	        List <Hero>result= (List<Hero>) m.get("hero-5555");
	        long end =System.currentTimeMillis();
	        System.out.printf("通过map查找，一共找到%d个英雄，耗时%d 毫秒%n",result.size(),end-start);
	        return result;
	    }
	    private static List<Hero> findByIteration (List<Hero> hs) {
	        long start =System.currentTimeMillis();
	        List<Hero> result =new ArrayList<>();
	        for (Hero h : hs) {
	            if(h.getName().equals("hero-5555")){
	                result.add(h);
	            }
	        }
	        long end =System.currentTimeMillis();
	        System.out.printf("通过for查找，一共找到%d个英雄，耗时%d 毫秒%n", result.size(),end-start);
	        return result;
	    }
	    public static int random(){
	        return ((int)(Math.random()*9000)+1000);
	    }
}

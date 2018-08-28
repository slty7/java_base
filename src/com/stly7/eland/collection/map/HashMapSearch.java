package com.stly7.eland.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
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
		HashMapSearch search = new HashMapSearch();
		for (int i = 0; i < 3000000; i++) {
			list.add(new Hero("hero-" + new Random().nextInt(10000), i));
		}
		long start1 = System.currentTimeMillis();
		search.forEch(list);
		long end1 = System.currentTimeMillis();
		System.out.println(end1 - start1);
		
		//名字作为key
        //名字相同的hero，放在一个List中，作为value
		HashMap<String,List<Hero>> heroMap =new HashMap();
        for (Hero h : list) {
            List<Hero> reustList = heroMap.get( h.getName());
            if(list==null){
            	reustList = new ArrayList<>();
                heroMap.put(h.getName(), reustList);
            }
            reustList.add(h);
        }
		
	}
	
	//用for循环找出来
	public void forEch(List<Hero> list) {
		// TODO Auto-generated method stub
		List<Hero> heroList = new ArrayList<>();
		for (Hero hero : list) {
			if ("hero-5555".equals(hero.getName())) {
				heroList.add(hero);
			}
		}
		System.err.println(heroList.size());
	}
	
	
	
}

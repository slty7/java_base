package com.stly7.eland.collection.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.stly7.eland.collection.arrayList.genericheros.Hero;

public class ForEch {
	
	public static void main(String[] args) {
		List<Hero> list = new ArrayList<>();
		List<Hero> new_list = new ArrayList<>();
		
		
		//用for循环添加数据
		for (int i = 0; i < 100; i++) {
			list.add(new Hero("hero" + i));
			new_list.add(new Hero("hero" + i));
		}
		
		fore(list);
		_iterator(new_list);
		
	}

	private static void fore(List<Hero> list) {
		//由于list是自伸缩,便利原来的长度会导致索引越界
		/*for (int i = 0; i < 100; i++) {
			if (i % 8 == 0 && i > 0) {
				continue;
			}else {
				new_list.add(list.get(i));
			}
		}
		list = new_list;*/
		//倒过来循环就没有这个问题
		for (int i = 99; i >= 0; i--) {
			if (i % 8 == 0 && i > 0) {
				list.remove(i);
			}
		}
		
		System.out.println(list.size());
		System.out.println(list);
	}
	
	//迭代器进行便利
	public static void _iterator(List heroes){
		Iterator it = heroes.iterator();
		
		//从最开始的位置判断"下一个"位置是否有数据
        //如果有就通过next取出来，并且把指针向下移动
        //直到"下一个"位置没有数据
		
		System.out.println("迭代器的形式开始了");
        while(it.hasNext()){
            Hero h = (Hero) it.next();
            String temp = h.getName();
			temp = temp.replaceAll("hero", "");
			int i = Integer.valueOf(temp);
			if(i % 8 == 0 && i != 0){
				it.remove();
			}
        }
        
        //迭代器的for写法
        /*System.out.println("--------使用for的iterator-------");
        for (Iterator<Hero> iterator = heroes.iterator(); iterator.hasNext();) {
            Hero hero = (Hero) iterator.next();
            String temp = hero.getName();
			temp = temp.replaceAll("hero", "");
			int i = Integer.valueOf(temp);
			if(i % 8 == 0 && i != 0){
				it.remove();
			}
        }*/
        System.out.println(heroes.size());
        System.out.println(heroes);
	}
}

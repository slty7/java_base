package com.stly7.eland.collection.listSearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.stly7.eland.collection.bean.Hero;

/**
 * 假设在List中存放着无重复名称，没有顺序的2000000个Hero
 * 要把名字叫做“hero 1000000”的对象找出来
 * List的做法是对每一个进行挨个遍历，直到找到名字叫做“hero 1000000”的英雄。
 * 最差的情况下，需要遍历和比较2000000次，才能找到对应的英雄。
 * 测试逻辑：
 * 1. 初始化2000000个对象到ArrayList中
 * 2. 打乱容器中的数据顺序
 * 3. 进行10次查询，统计每一次消耗的时间
 * 不同计算机的配置情况下，所花的时间是有区别的。 在本机上，花掉的时间大概是600毫秒左右
 * @author Administrator
 *
 */
public class ListSearch {
	public static void main(String[] args) {
		List<Hero> list = new ArrayList<>();
		int totle = 2000000;
		String regix = "hero 1000000";
		
		for (int i = 0; i < totle; i++) {
			list.add(new Hero("hero " + i, i));
		}
		
		for (int i = 0; i < 10; i++) {
			Collections.shuffle(list);
			long start = System.currentTimeMillis();
			for (Hero hero : list) {
				if (regix.equals(hero.getName())) {
					break;
				}
			}
			long end = System.currentTimeMillis();
			System.out.println("第" + i + "次: 所用时间为" + (end - start));
		}
	}
}

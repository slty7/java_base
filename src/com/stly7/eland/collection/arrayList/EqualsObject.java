package com.stly7.eland.collection.arrayList;

import java.util.ArrayList;
import java.util.List;

import com.stly7.eland.collection.arrayList.bean.Hero;

/**
 * 如果就是要判断集合里是否存在一个 name等于 "hero 1"的对象，应该怎么做？
 * @author Administrator
 *
 */
public class EqualsObject {
	public static void main(String[] args) {
		List heros = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			heros.add(new Hero("hero " + i));
		}
		String name = "hero " + 1;
		boolean flag = false;
		for (int i = 0; i < heros.size(); i++) {
			Hero hero = (Hero) heros.get(i);
			flag = hero.toString().equals(name);
			if (flag) {
				System.out.println("存在");
			}
		}
		
	}
}

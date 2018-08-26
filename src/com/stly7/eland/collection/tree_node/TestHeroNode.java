package com.stly7.eland.collection.tree_node;

import java.util.List;
import java.util.Random;

import com.stly7.eland.collection.bean.Hero;

public class TestHeroNode {
	
	public static void main(String[] args) {
		HeroNode node = new HeroNode();
		Random random = new Random();
		// 添加10个对象进去
		for (int i = 0; i < 10; i++) {
			node.add(new Hero("hero" + i, random.nextInt(900) + 100));
		}
		
		List<Hero> value = node.getValue();
		for (Hero hero : value) {
			System.out.println(hero);
		}
	}
}

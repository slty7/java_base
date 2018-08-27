package com.stly7.eland.collection.tree_node.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

import com.stly7.eland.collection.bean.Hero;

public class HeroNode2 {
	public static void main(String[] args) {
        System.out.println("初始化10个Hero。");
        Random rand = new Random();
        Hero heros[] = new Hero[10];
        for (int i = 0; i < 10; i++) {
            String name = "Hero" + i;
            int hp = rand.nextInt(100) + 1;
            // new一个对象的同时，左边是构造对象，右边是实例化对象
            Hero h = new Hero(name, hp);
            heros[i] = h;
            System.out.print(h);
        }
        System.out.println("根据血量倒排序后的Hero:");
        // 定义一个自定义类MyComparator1的对象
        Comparator<Hero> cmp = new MyComparator();
        Arrays.sort(heros, cmp);
        for (Object even : heros)
            System.out.print(even);
    }
}

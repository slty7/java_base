package com.stly7.eland.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;
/**
 * 首选准备10个Hero对象，hp和damage都是随机数。
 * 分别用传统方式和聚合操作的方式，把hp第三高的英雄名称打印出来
 * @author Administrator
 *
 */
public class TestAggregate3 {
	public static void main(String[] args) {
        Random r = new Random();
        List<Hero> heros = new ArrayList<Hero>();
        for (int i = 0; i < 10; i++) {
            heros.add(new Hero("hero " + i, r.nextInt(1000), r.nextInt(100)));
        }
        System.out.println("遍历集合中的每个数据");
        Collections.sort(heros, (h1, h2) -> h1.hp - h2.hp > 0 ? -1 : 1);
        int count = 1;
        for (Hero hero : heros) {
			if (count == 3) {
				System.out.println(hero);
			}
			count ++;
		}
        
        for (Hero hero : heros) {
			System.out.println(hero);
		}
        
        
        // 聚合方式
        String name = heros
            .stream()
            .sorted((h1,h2)->h1.hp>h2.hp?-1:1)
            .skip(2)
            .map(h->h.getName())
            .findFirst()
            .get();
        
 
        System.out.println("通过聚合操作找出来的hp第三高的英雄名称是:" + name);
        
        
    }
}

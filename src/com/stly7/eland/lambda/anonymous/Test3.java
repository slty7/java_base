package com.stly7.eland.lambda.anonymous;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * 使用Lambda方式筛选出数据
 * filter(heros,(h)->h.hp>100 && h.damage<50);
 * 
 * 同样是调用filter方法，从上一步的传递匿名类对象，变成了传递一个Lambda表达式进去
 * h->h.hp>100 && h.damage<50
 * 
 * 咋一看Lambda表达式似乎不好理解，其实很简单，下一步讲解如何从一个匿名类一点点演变成Lambda表达式
 * @author Administrator
 *
 */
public class Test3 {
	public static void main(String[] args) {
        Random r = new Random();
        List<Hero> heros = new ArrayList<Hero>();
        // 添加数据
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i, r.nextInt(1000), r.nextInt(100)));
        }
        System.out.println("初始化后的集合：");
        System.out.println(heros);
        System.out.println("使用Lamdba的方式，筛选出 hp>100 && damange<50的英雄");
        //用lambda方法进行(理解匿名内部类,不传接口直接传简写方式)
        filter(heros,h->h.hp>100 && h.damage<50);
    }
 
    private static void filter(List<Hero> heros,HeroChecker checker) {
        for (Hero hero : heros) {
            if(checker.test(hero))
                System.out.print(hero);
        }
    }
}

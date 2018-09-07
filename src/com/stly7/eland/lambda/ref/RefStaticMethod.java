package com.stly7.eland.lambda.ref;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.stly7.eland.lambda.anonymous.Hero;
import com.stly7.eland.lambda.anonymous.HeroChecker;

/**
 * 首先为TestLambda添加一个静态方法：
 
public static boolean testHero(Hero h) {
   return h.hp>100 && h.damage<50;
}
 

Lambda表达式：
 
filter(heros, h->h.hp>100 && h.damage<50);
 

在Lambda表达式中调用这个静态方法：
 
filter(heros, h -> TestLambda.testHero(h) );
 

调用静态方法还可以改写为：
 
filter(heros, TestLambda::testHero);
 

这种方式就叫做引用静态方法
 * @author Administrator
 *
 */
public class RefStaticMethod {
	
	public static void main(String[] args) {
		Random random = new Random();
		List<Hero> heroes = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			heroes.add(new Hero("hero " + i, random.nextInt(1000), random.nextInt(100)));
		}
		
		System.out.println("初始化后的集合：");
        System.out.println(heroes);
        HeroChecker c = new HeroChecker() {
			
			@Override
			public boolean test(Hero h) {
				// TODO Auto-generated method stub
				return h.hp > 100 && h.damage < 50;
				// 这里也可以调用静态方法与这个效果一样的
			}
		};
		
		System.out.println("使用匿名类过滤");
        filter(heroes, c);
        System.out.println("使用Lambda表达式");
        filter(heroes, h->h.hp>100 && h.damage<50);
        System.out.println("Lambda表达式中使用静态方法调用");
        filter(heroes, h -> RefStaticMethod.testHero(h));
        System.out.println("直接引用静态方法");
        filter(heroes, RefStaticMethod :: testHero);
	}
	
	// 这个静态方法的与接口的作用是一样的
	public static boolean testHero(Hero h) {
		
		return h.hp > 100 && h.damage < 50;
	}
	
	private static void filter(List<Hero> heros,HeroChecker checker) {
        for (Hero hero : heros) {
            if(checker.test(hero))
                System.out.print(hero);
        }
    }
}

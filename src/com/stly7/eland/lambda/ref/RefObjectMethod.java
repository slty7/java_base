package com.stly7.eland.lambda.ref;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 与引用静态方法很类似，只是传递方法的时候，需要一个对象的存在
 
TestLambda testLambda = new TestLambda();  ==> new TestLambda()
filter(heros, testLambda::testHero);
 * @author Administrator
 *
 */
public class RefObjectMethod {
	public static void main(String[] args) {
		List<Hero> heroes = new ArrayList<>();
		Random random = new Random();
		// 先添加数据
		for (int i = 0; i < 5; i++) {
			heroes.add(new Hero("hero " + i, random.nextInt(1000), random.nextInt(100)));
		}
		
		System.out.println("使用匿名类过滤");
        HeroChecker c = new HeroChecker() {
			@Override
			public boolean test(Hero hero) {
				// TODO Auto-generated method stub
				return hero.hp > 100 && hero.damage < 50;
			}
		};
		filter(heroes, c );
        System.out.println("使用Lambda表达式");
        filter(heroes, h->h.hp>100 && h.damage<50);
        
        System.out.println("Lambda表达式中使用静态方法调用");
        filter(heroes, h -> (new RefObjectMethod().testHero(h)));
        
        System.out.println("直接引用静态方法");
        filter(heroes, new RefObjectMethod() :: testHero);
	}
	
	// 这里是调用接口进行判断
	private static void filter(List<Hero> heroes, HeroChecker checker) {
		for (Hero hero : heroes) {
			if (checker.test(hero)) {
				System.out.println(hero);
			}
		}
	}
	
	// 这里不是静态方法了需要创建对象进行调用了,与HeroChecker接口功能一样的,调用引用的时候就与返回值有关就可以了
	public boolean testHero(Hero hero) {
		
		return hero.hp > 100 && hero.damage < 50;
	}
}

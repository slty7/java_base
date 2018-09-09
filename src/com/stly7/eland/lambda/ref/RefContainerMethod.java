package com.stly7.eland.lambda.ref;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * 首先为Hero添加一个方法
 
public boolean matched(){
   return this.hp>100 && this.damage<50;
}
 

使用Lambda表达式
 
filter(heros,h-> h.hp>100 && h.damage<50 );
 

在Lambda表达式中调用容器中的对象Hero的方法matched
 
filter(heros,h-> h.matched() );
 

matched恰好就是容器中的对象Hero的方法，那就可以进一步改写为
 
filter(heros, Hero::matched);
 
 * @author Administrator
 *
 */
public class RefContainerMethod {
	public static void main(String[] args) {
		List<Hero> heroes = new ArrayList<>();
		Random random = new Random();
		// 添加数据
		for (int i = 0; i < 5; i++) {
			heroes.add(new Hero("hero " + i,  random.nextInt(1000), random.nextInt(100)));
		}
		
		HeroChecker c = new HeroChecker() {
			
			@Override
			public boolean test(Hero hero) {
				// TODO Auto-generated method stub
				return hero.hp > 100 && hero.damage < 50;
			}
		};
		// 这里是原来的匿名内部类的接口写法
		System.out.println("使用匿名类过滤");
		filter(heroes, c);
		// lambda
		System.out.println("使用Lambda表达式");
		filter(heroes, h -> h.damage < 100 && h.damage > 50);
		
		// 调用其他方法的, 变种lamdba写法 引用对象原生
		System.out.println("Lambda表达式中使用对象方法调用,只是把静态改成 new Object()");
		filter(heroes, h -> new RefContainerMethod().testHero(h));
		// 引用对象简写
		System.out.println("直接引用对象方法,只是把静态改成 new Object()");
		filter(heroes, new RefContainerMethod() :: testHero);
		
		// 引用容器的写法, 但是容器(bean)里面的方法与现在方法返回值类型一样
		System.out.println("Lambda表达式中使用容器(bean)方法调用,只是把静态改成 new Object()");
		filter(heroes, h -> new Hero().matched());
		System.out.println("Lambda表达式中使用容器(bean)方法调用");
		filter(heroes, h -> h.matched());
		System.out.println("直接引用容器方法,容器相当于一个静态东西不用再进行new");
		filter(heroes, Hero :: matched);
		
	}
	
	// 过滤的方法
	private static void filter(List<Hero> heroes, HeroChecker checker) {
		for (Hero hero : heroes) {
			if (checker.test(hero)) {
				System.out.println(hero);
			}
		}
	}
	
	// 不管怎么样主要是看返回结果的 引用的时候
	public boolean testHero(Hero hero) {
		
		return hero.hp > 100 && hero.damage < 50;
	}
}

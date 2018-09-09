package com.stly7.eland.lambda.ref;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * ����ΪHero���һ������
 
public boolean matched(){
   return this.hp>100 && this.damage<50;
}
 

ʹ��Lambda���ʽ
 
filter(heros,h-> h.hp>100 && h.damage<50 );
 

��Lambda���ʽ�е��������еĶ���Hero�ķ���matched
 
filter(heros,h-> h.matched() );
 

matchedǡ�þ��������еĶ���Hero�ķ������ǾͿ��Խ�һ����дΪ
 
filter(heros, Hero::matched);
 
 * @author Administrator
 *
 */
public class RefContainerMethod {
	public static void main(String[] args) {
		List<Hero> heroes = new ArrayList<>();
		Random random = new Random();
		// �������
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
		// ������ԭ���������ڲ���Ľӿ�д��
		System.out.println("ʹ�����������");
		filter(heroes, c);
		// lambda
		System.out.println("ʹ��Lambda���ʽ");
		filter(heroes, h -> h.damage < 100 && h.damage > 50);
		
		// ��������������, ����lamdbaд�� ���ö���ԭ��
		System.out.println("Lambda���ʽ��ʹ�ö��󷽷�����,ֻ�ǰѾ�̬�ĳ� new Object()");
		filter(heroes, h -> new RefContainerMethod().testHero(h));
		// ���ö����д
		System.out.println("ֱ�����ö��󷽷�,ֻ�ǰѾ�̬�ĳ� new Object()");
		filter(heroes, new RefContainerMethod() :: testHero);
		
		// ����������д��, ��������(bean)����ķ��������ڷ�������ֵ����һ��
		System.out.println("Lambda���ʽ��ʹ������(bean)��������,ֻ�ǰѾ�̬�ĳ� new Object()");
		filter(heroes, h -> new Hero().matched());
		System.out.println("Lambda���ʽ��ʹ������(bean)��������");
		filter(heroes, h -> h.matched());
		System.out.println("ֱ��������������,�����൱��һ����̬���������ٽ���new");
		filter(heroes, Hero :: matched);
		
	}
	
	// ���˵ķ���
	private static void filter(List<Hero> heroes, HeroChecker checker) {
		for (Hero hero : heroes) {
			if (checker.test(hero)) {
				System.out.println(hero);
			}
		}
	}
	
	// ������ô����Ҫ�ǿ����ؽ���� ���õ�ʱ��
	public boolean testHero(Hero hero) {
		
		return hero.hp > 100 && hero.damage < 50;
	}
}

package com.stly7.eland.lambda.ref;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * �����þ�̬���������ƣ�ֻ�Ǵ��ݷ�����ʱ����Ҫһ������Ĵ���
 
TestLambda testLambda = new TestLambda();  ==> new TestLambda()
filter(heros, testLambda::testHero);
 * @author Administrator
 *
 */
public class RefObjectMethod {
	public static void main(String[] args) {
		List<Hero> heroes = new ArrayList<>();
		Random random = new Random();
		// ���������
		for (int i = 0; i < 5; i++) {
			heroes.add(new Hero("hero " + i, random.nextInt(1000), random.nextInt(100)));
		}
		
		System.out.println("ʹ�����������");
        HeroChecker c = new HeroChecker() {
			@Override
			public boolean test(Hero hero) {
				// TODO Auto-generated method stub
				return hero.hp > 100 && hero.damage < 50;
			}
		};
		filter(heroes, c );
        System.out.println("ʹ��Lambda���ʽ");
        filter(heroes, h->h.hp>100 && h.damage<50);
        
        System.out.println("Lambda���ʽ��ʹ�þ�̬��������");
        filter(heroes, h -> (new RefObjectMethod().testHero(h)));
        
        System.out.println("ֱ�����þ�̬����");
        filter(heroes, new RefObjectMethod() :: testHero);
	}
	
	// �����ǵ��ýӿڽ����ж�
	private static void filter(List<Hero> heroes, HeroChecker checker) {
		for (Hero hero : heroes) {
			if (checker.test(hero)) {
				System.out.println(hero);
			}
		}
	}
	
	// ���ﲻ�Ǿ�̬��������Ҫ����������е�����,��HeroChecker�ӿڹ���һ����,�������õ�ʱ����뷵��ֵ�йؾͿ�����
	public boolean testHero(Hero hero) {
		
		return hero.hp > 100 && hero.damage < 50;
	}
}

package com.stly7.eland.lambda.ref;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.stly7.eland.lambda.anonymous.Hero;
import com.stly7.eland.lambda.anonymous.HeroChecker;

/**
 * ����ΪTestLambda���һ����̬������
 
public static boolean testHero(Hero h) {
   return h.hp>100 && h.damage<50;
}
 

Lambda���ʽ��
 
filter(heros, h->h.hp>100 && h.damage<50);
 

��Lambda���ʽ�е��������̬������
 
filter(heros, h -> TestLambda.testHero(h) );
 

���þ�̬���������Ը�дΪ��
 
filter(heros, TestLambda::testHero);
 

���ַ�ʽ�ͽ������þ�̬����
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
		
		System.out.println("��ʼ����ļ��ϣ�");
        System.out.println(heroes);
        HeroChecker c = new HeroChecker() {
			
			@Override
			public boolean test(Hero h) {
				// TODO Auto-generated method stub
				return h.hp > 100 && h.damage < 50;
				// ����Ҳ���Ե��þ�̬���������Ч��һ����
			}
		};
		
		System.out.println("ʹ�����������");
        filter(heroes, c);
        System.out.println("ʹ��Lambda���ʽ");
        filter(heroes, h->h.hp>100 && h.damage<50);
        System.out.println("Lambda���ʽ��ʹ�þ�̬��������");
        filter(heroes, h -> RefStaticMethod.testHero(h));
        System.out.println("ֱ�����þ�̬����");
        filter(heroes, RefStaticMethod :: testHero);
	}
	
	// �����̬��������ӿڵ�������һ����
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

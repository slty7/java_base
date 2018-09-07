package com.stly7.eland.lambda.anonymous;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Lambda���ʽ���Կ�����������һ����ݱ����
1. �����������д��
 
HeroChecker c1 = new HeroChecker() {
    public boolean test(Hero h) {
        return (h.hp>100 && h.damage<50);
    }
};
 

2. ������Ŀ���ȥ��
ֻ�������������ͷ�����
�����ͷ�����֮����Ϸ��� ->
 
HeroChecker c2 = (Hero h) ->{
	return h.hp>100 && h.damage<50;
};
 


3. ��return��{}ȥ��
 
HeroChecker c3 = (Hero h) ->h.hp>100 && h.damage<50;
 


4. �� �������ͺ�Բ����ȥ��(ֻ��һ��������ʱ�򣬲ſ���ȥ��Բ����)
 
HeroChecker c4 = h ->h.hp>100 && h.damage<50;
 


5. ��c4��Ϊ�������ݽ�ȥ
 
filter(heros,c4);
 


6. ֱ�Ӱѱ��ʽ���ݽ�ȥ
 
filter(heros, h -> h.hp > 100 && h.damage < 50);
 * @author Administrator
 *
 */
public class anonymous_to_lambda {
	
	public static void main(String[] args) {
		Random r = new Random();
		List<Hero> heroes = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			heroes.add(new Hero("hero " + i, r.nextInt(1000), r.nextInt(100)));
		}
		
		System.out.println("��ʼ����ļ��ϣ�");
        System.out.println(heroes);
        System.out.println("ʹ��������ķ�ʽ��ɸѡ�� hp>100 && damange<50��Ӣ��");
        
        // �����ڲ����д��
        HeroChecker checker1 = new HeroChecker() {
			
			@Override
			public boolean test(Hero h) {
				// TODO Auto-generated method stub
				return (h.hp > 100 && h.damage < 50);
			}
		};
		
		// ��new HeroChcekcer������������������������Ϣȥ��
        // ֻ�������������ͷ�����
        // �����ͷ�����֮����Ϸ��� ->
		HeroChecker checker2 = (Hero h) -> {
			return h.hp > 100 && h.damage < 50;
		};
		
		// ��  {} ��  return ȥ��
		HeroChecker checker3 = (Hero h) ->  h.hp > 100 && h.damage < 50;
		
		// �� �������� �� Բ����ȥ��
		HeroChecker checker4 = h -> h.hp > 100 && h.damage < 50;
		
		// Ȼ�����ȥ
		filter(heroes, checker4);
		
		// ������ֱ��ʹ��lamdba��ʽ
		filter(heroes, h -> h.hp > 100 && h.damage < 50);
	}
	
	private static void filter(List<Hero> heroes, HeroChecker heroChercker) {
		for (Hero hero : heroes) {
			if (heroChercker.test(hero)) {
				System.out.println(hero);
			}
		}
	}
}

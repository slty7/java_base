package com.stly7.eland.lambda.anonymous;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * ʹ��Lambda��ʽɸѡ������
 * filter(heros,(h)->h.hp>100 && h.damage<50);
 * 
 * ͬ���ǵ���filter����������һ���Ĵ�����������󣬱���˴���һ��Lambda���ʽ��ȥ
 * h->h.hp>100 && h.damage<50
 * 
 * զһ��Lambda���ʽ�ƺ�������⣬��ʵ�ܼ򵥣���һ��������δ�һ��������һ����ݱ��Lambda���ʽ
 * @author Administrator
 *
 */
public class Test3 {
	public static void main(String[] args) {
        Random r = new Random();
        List<Hero> heros = new ArrayList<Hero>();
        // �������
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i, r.nextInt(1000), r.nextInt(100)));
        }
        System.out.println("��ʼ����ļ��ϣ�");
        System.out.println(heros);
        System.out.println("ʹ��Lamdba�ķ�ʽ��ɸѡ�� hp>100 && damange<50��Ӣ��");
        //��lambda��������(��������ڲ���,�����ӿ�ֱ�Ӵ���д��ʽ)
        filter(heros,h->h.hp>100 && h.damage<50);
    }
 
    private static void filter(List<Hero> heros,HeroChecker checker) {
        for (Hero hero : heros) {
            if(checker.test(hero))
                System.out.print(hero);
        }
    }
}

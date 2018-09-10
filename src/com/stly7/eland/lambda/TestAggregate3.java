package com.stly7.eland.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;
/**
 * ��ѡ׼��10��Hero����hp��damage�����������
 * �ֱ��ô�ͳ��ʽ�;ۺϲ����ķ�ʽ����hp�����ߵ�Ӣ�����ƴ�ӡ����
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
        System.out.println("���������е�ÿ������");
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
        
        
        // �ۺϷ�ʽ
        String name = heros
            .stream()
            .sorted((h1,h2)->h1.hp>h2.hp?-1:1)
            .skip(2)
            .map(h->h.getName())
            .findFirst()
            .get();
        
 
        System.out.println("ͨ���ۺϲ����ҳ�����hp�����ߵ�Ӣ��������:" + name);
        
        
    }
}

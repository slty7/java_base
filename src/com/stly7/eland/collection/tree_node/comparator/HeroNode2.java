package com.stly7.eland.collection.tree_node.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

import com.stly7.eland.collection.bean.Hero;

public class HeroNode2 {
	public static void main(String[] args) {
        System.out.println("��ʼ��10��Hero��");
        Random rand = new Random();
        Hero heros[] = new Hero[10];
        for (int i = 0; i < 10; i++) {
            String name = "Hero" + i;
            int hp = rand.nextInt(100) + 1;
            // newһ�������ͬʱ������ǹ�������ұ���ʵ��������
            Hero h = new Hero(name, hp);
            heros[i] = h;
            System.out.print(h);
        }
        System.out.println("����Ѫ����������Hero:");
        // ����һ���Զ�����MyComparator1�Ķ���
        Comparator<Hero> cmp = new MyComparator();
        Arrays.sort(heros, cmp);
        for (Object even : heros)
            System.out.print(even);
    }
}

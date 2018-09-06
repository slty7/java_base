package com.stly7.eland.collection.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 * ����Hero���������� name,hp,damage
һ�������зŴ��10��Hero,ͨ��Collections.sort����10����������
��ô������hpС�ķ�ǰ�棿����damageС�ķ�ǰ�棿Collections.sortҲ�޷�ȷ��
����Ҫָ�����װ����������Խ�������
�������Ҫ�ṩһ��Comparator������ν�����������֮��Ĵ�С�Ƚ�
 * @author Administrator
 *
 */
public class TestComparator {
	public static void main(String[] args) {
        Random r =new Random();
        List<Hero_comparator> heros = new ArrayList<Hero_comparator>();
            
        for (int i = 0; i < 10; i++) {
            //ͨ�����ֵʵ����hero��hp��damage
            heros.add(new Hero_comparator("hero "+ i, r.nextInt(100), r.nextInt(100)));
        }
        System.out.println("��ʼ����ļ��ϣ�");
        System.out.println(heros);
            
        //ֱ�ӵ���sort����ֱ��������ΪHero�и�������
        //���װ����������Խ��бȽϣ�CollectionsҲ��֪������ȷ��������û����
        //Collections.sort(heros);
            
        //����Comparator��ָ���Ƚϵ��㷨
        Comparator c = new Comparator<Hero_comparator>() {
            @Override
            public int compare(Hero_comparator h1, Hero_comparator h2) {
                //����hp��������
                if(h1.hp>=h2.hp) {
                    return 1;  //������ʾh1��h2Ҫ��
                }else{
                	return -1;
                }
            }
        };
        Collections.sort(heros,c);
        System.out.println("����Ѫ�������ļ��ϣ�");
        System.out.println(heros);
    }
}

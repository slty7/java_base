package com.stly7.eland.lambda.comparator_lambda;

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
        List<Hero> heros = new ArrayList<Hero>();
            
        for (int i = 0; i < 10; i++) {
        	
            //�������������޷�ȥ��Բ����
        	
        	
            //ͨ�����ֵʵ����hero��hp��damage
            heros.add(new Hero("hero "+ i, r.nextInt(100), r.nextInt(100)));
        }
        System.out.println("��ʼ����ļ��ϣ�");
        System.out.println(heros);
        Comparator<Hero> c = new Comparator<Hero>() {
        	@Override
        	public int compare(Hero h1, Hero h2) {
        		//����hp��������
        		if(h1.hp >= h2.hp) {
        			return 1;  //������ʾh1��h2Ҫ��
        		}else{
        			return -1;
        		}
        	}
        };
        
        //Lambda���ʽ
        c = (Hero h1, Hero h2)-> {
        	return h1.hp>=h2.hp?1:-1;
        };
        //ȥ�� return�ʹ�����
        c = (Hero h1, Hero h2)->h1.hp>=h2.hp?1:-1;
        //ȥ�� ��������       
        c = (h1, h2) -> h1.hp >= h2.hp ? 1 : -1;
            
        //ֱ�ӵ���sort����ֱ��������ΪHero�и�������
        //���װ����������Խ��бȽϣ�CollectionsҲ��֪������ȷ��������û����
        //Collections.sort(heros);
            
        //����Comparator��ָ���Ƚϵ��㷨
        Collections.sort(heros,c);
        
         
        Collections.sort(heros, (h1, h2) -> h1.hp > h2.hp ? 1 : -1);
        System.out.println("����Ѫ�������ļ��ϣ�");
        System.out.println(heros);
    }
}

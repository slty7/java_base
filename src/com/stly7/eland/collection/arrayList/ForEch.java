package com.stly7.eland.collection.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.stly7.eland.collection.arrayList.genericheros.Hero;

public class ForEch {
	
	public static void main(String[] args) {
		List<Hero> list = new ArrayList<>();
		List<Hero> new_list = new ArrayList<>();
		
		
		//��forѭ���������
		for (int i = 0; i < 100; i++) {
			list.add(new Hero("hero" + i));
			new_list.add(new Hero("hero" + i));
		}
		
		fore(list);
		_iterator(new_list);
		
	}

	private static void fore(List<Hero> list) {
		//����list��������,����ԭ���ĳ��Ȼᵼ������Խ��
		/*for (int i = 0; i < 100; i++) {
			if (i % 8 == 0 && i > 0) {
				continue;
			}else {
				new_list.add(list.get(i));
			}
		}
		list = new_list;*/
		//������ѭ����û���������
		for (int i = 99; i >= 0; i--) {
			if (i % 8 == 0 && i > 0) {
				list.remove(i);
			}
		}
		
		System.out.println(list.size());
		System.out.println(list);
	}
	
	//���������б���
	public static void _iterator(List heroes){
		Iterator it = heroes.iterator();
		
		//���ʼ��λ���ж�"��һ��"λ���Ƿ�������
        //����о�ͨ��nextȡ���������Ұ�ָ�������ƶ�
        //ֱ��"��һ��"λ��û������
		
		System.out.println("����������ʽ��ʼ��");
        while(it.hasNext()){
            Hero h = (Hero) it.next();
            String temp = h.getName();
			temp = temp.replaceAll("hero", "");
			int i = Integer.valueOf(temp);
			if(i % 8 == 0 && i != 0){
				it.remove();
			}
        }
        
        //��������forд��
        /*System.out.println("--------ʹ��for��iterator-------");
        for (Iterator<Hero> iterator = heroes.iterator(); iterator.hasNext();) {
            Hero hero = (Hero) iterator.next();
            String temp = hero.getName();
			temp = temp.replaceAll("hero", "");
			int i = Integer.valueOf(temp);
			if(i % 8 == 0 && i != 0){
				it.remove();
			}
        }*/
        System.out.println(heroes.size());
        System.out.println(heroes);
	}
}

package com.stly7.eland.collection.arrayList;

import java.util.ArrayList;
import java.util.List;

import com.stly7.eland.collection.arrayList.bean.Hero;

/**
 * �������Ҫ�жϼ������Ƿ����һ�� name���� "hero 1"�Ķ���Ӧ����ô����
 * @author Administrator
 *
 */
public class EqualsObject {
	public static void main(String[] args) {
		List heros = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			heros.add(new Hero("hero " + i));
		}
		String name = "hero " + 1;
		boolean flag = false;
		for (int i = 0; i < heros.size(); i++) {
			Hero hero = (Hero) heros.get(i);
			flag = hero.toString().equals(name);
			if (flag) {
				System.out.println("����");
			}
		}
		
	}
}

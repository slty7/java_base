package com.stly7.eland.oop.extends_interface;
/**
 * ����Ӣ��,��Ҫʵ�����ƽӿ�
 * @author Administrator
 *
 */
public class Support extends Hero implements Healer {

	@Override
	public void heal(Hero hero, int hp) {
		System.out.println("��" + hero + "����" + hp);
	}

	@Override
	public void heal(Hero... heros) {
		for (Hero hero : heros) {
			System.out.println("��" + hero + "����" + hero.getHp());
		}
	}

}

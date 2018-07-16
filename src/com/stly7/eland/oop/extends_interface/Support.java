package com.stly7.eland.oop.extends_interface;
/**
 * 辅助英雄,需要实现治疗接口
 * @author Administrator
 *
 */
public class Support extends Hero implements Healer {

	@Override
	public void heal(Hero hero, int hp) {
		System.out.println("给" + hero + "加了" + hp);
	}

	@Override
	public void heal(Hero... heros) {
		for (Hero hero : heros) {
			System.out.println("给" + hero + "加了" + hero.getHp());
		}
	}

}

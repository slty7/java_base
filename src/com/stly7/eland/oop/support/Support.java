package com.stly7.eland.oop.support;


public class Support extends Hero{
	
	
	public void heal() {
		System.out.println("׼����Ѫ��");
	}
	
	public void heal(Hero hero) {
		System.out.println("��" + hero.HeroName + "��Ѫ��");
	}
	
	public void heal(Hero hero, int hp) {
		System.out.println("��" + hero.HeroName + "��Ѫ��" + hp);
	}
	
}

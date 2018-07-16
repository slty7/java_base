package com.stly7.eland.oop.support;


public class Support extends Hero{
	
	
	public void heal() {
		System.out.println("准备加血了");
	}
	
	public void heal(Hero hero) {
		System.out.println("给" + hero.HeroName + "加血了");
	}
	
	public void heal(Hero hero, int hp) {
		System.out.println("给" + hero.HeroName + "加血了" + hp);
	}
	
}

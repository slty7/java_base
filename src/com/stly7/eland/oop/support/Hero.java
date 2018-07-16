package com.stly7.eland.oop.support;

public class Hero {
	
	String HeroName;
	float HeroHp;
	float heroArmor;
	int heroMoveSpeed;
	
	public Hero(){}
	public Hero(String heroName, float heroHp, float heroArmor, int heroMoveSpeed) {
		super();
		HeroName = heroName;
		HeroHp = heroHp;
		this.heroArmor = heroArmor;
		this.heroMoveSpeed = heroMoveSpeed;
	};
	
}

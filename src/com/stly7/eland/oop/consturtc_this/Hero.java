package com.stly7.eland.oop.consturtc_this;

public class Hero {
	String name;
	float hp;
	float armor;
	int moveSpeed;
	
	public Hero() {
		super();
	}

	public Hero(String name, float hp, float armor, int moveSpeed) {
		super();
		this.name = name;
		this.hp = hp;
		this.armor = armor;
		this.moveSpeed = moveSpeed;
	}
	
	public Hero(String name, float hp) {
		super();
		this.name = name;
		this.hp = hp;
	}
	
	/*
	 * 此处需要配合public Hero(String name){this.name = name;}
	 */
//	public Hero(String name, float hp) {
//		this(name);
//		this.hp = hp;
//	}
	
	
	public static void main(String[] args) {
		Hero hero = new Hero("盲僧", 400);
		System.out.println(hero.name + hero.hp);
	}
	
}

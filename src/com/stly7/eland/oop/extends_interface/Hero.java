package com.stly7.eland.oop.extends_interface;
/**
 * 英雄类
 * @author Administrator
 *
 */
public class Hero {
	
	//名字,血量,布甲
	String name;
	float hp;
	float armor;
	
	public Hero() {
		super();
	}

	public Hero(String name, float hp, float armor) {
		super();
		this.name = name;
		this.hp = hp;
		this.armor = armor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getHp() {
		return hp;
	}

	public void setHp(float hp) {
		this.hp = hp;
	}

	public float getArmor() {
		return armor;
	}

	public void setArmor(float armor) {
		this.armor = armor;
	}
	
	
}

package com.stly7.eland.oop.extends_interface;
/**
 * Ӣ����
 * @author Administrator
 *
 */
public class Hero {
	
	//����,Ѫ��,����
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

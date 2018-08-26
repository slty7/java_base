package com.stly7.eland.collection.bean;

public class Hero {
	
	private String name;
	private float hp;
	
	public Hero() {
		super();
	}

	public Hero(String name, float hp) {
		super();
		this.name = name;
		this.hp = hp;
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

	@Override
	public String toString() {
		return "Hero [name=" + name + ", hp=" + hp + "]";
	}
	
}

package com.stly7.eland.collection.arrayList.genericheros;

public class Hero extends Parent {
	public String name;
	
	public Hero() {
		super();
	}
	
	public Hero(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Hero [name=" + name + "]";
	}
}

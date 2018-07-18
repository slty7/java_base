package com.stly7.eland.oop.abstract_class;

public abstract class Item {
	
	String name;
	float price;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	//抽象方法子类中必须重写父类的中所有抽象方法
	public abstract boolean disposable();
	
}

package com.stly7.eland.oop.inner_class;

public abstract class Item {
	
	private String name;
	private float price;
	
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

	public String toString() {
		return "Item [name=" + name + ", price=" + price + "]";
	}

	//抽象方法子类中必须重写父类的中所有抽象方法
	public abstract boolean disposable();
	
}

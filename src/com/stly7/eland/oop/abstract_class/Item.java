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

	//���󷽷������б�����д����������г��󷽷�
	public abstract boolean disposable();
	
}

package com.stly7.eland.oop.armor;

public class Item {
	
	public String name;
	public float price;
	public int level;
	
	@Override
	public String toString() {
		return "Item [level=" + level + ", name=" + name + ", price=" + price + "]";
	}
	
}

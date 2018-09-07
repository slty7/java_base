package com.stly7.eland.collection.compara.myComparable;

public class Item implements Comparable<Item> {
	private String name;
	private float price;
	
	public Item() {
		super();
	}

	public Item(String name, float price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	// 返回1就是大的在前面,小的在后面,返回0值一样不分先后
	// 返回-1就是大的在后面,小的在前面,
	@Override
	public int compareTo(Item anotherItem) {
		
		return price - anotherItem.price > 0 ? 1 : -1;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + "]";
	}
	
}

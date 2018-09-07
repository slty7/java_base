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
	
	// ����1���Ǵ����ǰ��,С���ں���,����0ֵһ�������Ⱥ�
	// ����-1���Ǵ���ں���,С����ǰ��,
	@Override
	public int compareTo(Item anotherItem) {
		
		return price - anotherItem.price > 0 ? 1 : -1;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + "]";
	}
	
}

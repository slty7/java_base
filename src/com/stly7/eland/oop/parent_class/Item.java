package com.stly7.eland.oop.parent_class;

public class Item {
	
	String name;
	float price;
	
	//构造方法
	public Item() {
		super();
	}
	public Item(String name, float price) {
		super();
		this.name = name;
		this.price = price;
		System.out.println("构造创建对象" + this.name);
	}
	
	//重写toString
	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + "]";
	}
	
	//重写equals
	@Override
	public boolean equals(Object obj) {
		//equals(Object o) 首先判断o是否是Item类型，然后比较两个Item的price是否相同
		if (obj instanceof Item) {
			Item item = (Item) obj;
			return this.price == item.price;
		}
		return false;
	}
	
	//重写垃圾回收
	@Override
	public void finalize() {
		System.out.println("----->" + this.name + "正在被回收");
	}
}

package com.stly7.eland.oop.parent_class;

public class Item {
	
	String name;
	float price;
	
	//���췽��
	public Item() {
		super();
	}
	public Item(String name, float price) {
		super();
		this.name = name;
		this.price = price;
		System.out.println("���촴������" + this.name);
	}
	
	//��дtoString
	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + "]";
	}
	
	//��дequals
	@Override
	public boolean equals(Object obj) {
		//equals(Object o) �����ж�o�Ƿ���Item���ͣ�Ȼ��Ƚ�����Item��price�Ƿ���ͬ
		if (obj instanceof Item) {
			Item item = (Item) obj;
			return this.price == item.price;
		}
		return false;
	}
	
	//��д��������
	@Override
	public void finalize() {
		System.out.println("----->" + this.name + "���ڱ�����");
	}
}

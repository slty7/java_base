package com.stly7.eland.oop.parent_class;

public class TestItem {
	
	public static void main(String[] args) {
		for (int i = 0; i < 15000; i++) {
			//因为垃圾回收需要达到一定量才能自动回收所以需要不断创建对象
			Item item = new Item("复活甲", 1000);
		}
		System.out.println("===================");
		Item item1 = new Item("药品", 400);
		Item item2 = new Item("粮食", 100);
		System.out.println(item1.equals(item2));
	}
}

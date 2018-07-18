package com.stly7.eland.oop.inner_class;

public class TestItem {
	public static void main(String[] args) {
		Item item = new Item() {
			
			@Override
			public boolean disposable() {
				System.out.println("创建一个内部类");
				return false;
			}
		};
		
		item.setName("内部类");
		item.setPrice(0);
		System.out.println(item + "---------" + item.disposable());
	}
}

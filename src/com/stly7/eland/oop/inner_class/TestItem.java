package com.stly7.eland.oop.inner_class;

public class TestItem {
	public static void main(String[] args) {
		Item item = new Item() {
			
			@Override
			public boolean disposable() {
				System.out.println("����һ���ڲ���");
				return false;
			}
		};
		
		item.setName("�ڲ���");
		item.setPrice(0);
		System.out.println(item + "---------" + item.disposable());
	}
}

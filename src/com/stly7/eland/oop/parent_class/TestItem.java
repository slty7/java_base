package com.stly7.eland.oop.parent_class;

public class TestItem {
	
	public static void main(String[] args) {
		for (int i = 0; i < 15000; i++) {
			//��Ϊ����������Ҫ�ﵽһ���������Զ�����������Ҫ���ϴ�������
			Item item = new Item("�����", 1000);
		}
		System.out.println("===================");
		Item item1 = new Item("ҩƷ", 400);
		Item item2 = new Item("��ʳ", 100);
		System.out.println(item1.equals(item2));
	}
}

package com.stly7.eland.oop.abstract_class;

public class TestItem {
	//����ʹ����ƿ������
	public static void main(String[] args) {
		Item armor = new Armor();
		armor.setName("�з�����");
		armor.setPrice(10000);
		
		Item magicPotion = new MagicPotion();
		magicPotion.setName("���и�");
		magicPotion.setPrice(100);
		
		System.out.println(armor.disposable());
		System.out.println(magicPotion.disposable());
	}
}

package com.stly7.eland.oop.armor;

/**
 * ���һ����Armor����
�̳�Item�࣬���Ҷ����ṩһ������ac: ���׵ȼ� int����

ʵ��������������
���� �۸� ���׵ȼ�
���� 300 15
���Ӽ� 500 40
 * @author Administrator
 *
 */
public class TestArmor {
	
	public static void main(String[] args) {
		Armor armor1 = new Armor();
		Armor armor2 = new Armor();
		
		armor1.catgraoy = "ac";
		armor1.name = "����";
		armor1.price = 300f;
		armor1.level = 15;
		
		armor2.catgraoy = "ac";
		armor2.name = "���Ӽ�";
		armor2.price = 500f;
		armor2.level = 40;
		
		System.out.println(armor1);
		System.out.println(armor2);
	}
	
	
}

package com.stly7.eland.oop.singleton;
/**
 * ����ʽ
 * @author Administrator
 *
 */
public class Item {
	
	//˽�й���
	private Item(){}
	
	//˽��Ψһ��������
	private static Item instance;
	
	//�ṩ���з����������ʵ��,���Ҹ�ֵ��Ψһ������
	public static Item getInstance() {
		
		if (instance == null) {
			instance = new Item();
		}
		
		return instance;
	}
}

package com.stly7.eland.oop.singleton;
/**
 * ����ʽ
 * @author Administrator
 *
 */
public class Hero {
	
	//˽�л�����
	private Hero(){}
	
	//˽�л�Ψһ����ʵ��
	private static Hero instance = new Hero();
	
	//�ṩһ�����ʷ���,���ҷ���һ��Ψһʵ��
	public static Hero getInstance() {
		return instance;
	}
}

package com.stly7.eland.oop.singleton;
/**
 * ����ʽ����
 * @author Administrator
 *
 */
public class GiantDragon {
	
	//˽�л����췽��ʹ�ø����޷����ⲿͨ��new ����ʵ����
	private GiantDragon(){
	}
	//׼��һ�������ԣ�ָ��һ��ʵ�������� ��Ϊ�������ԣ�����ֻ��һ�����Թ���һ���Ļ�ֻ��static����
	private static GiantDragon instance = new GiantDragon();
		
	//�ṩ���÷���,����һ��ʵ������
	public static GiantDragon getInstance() {
		
		return instance;
	}
}

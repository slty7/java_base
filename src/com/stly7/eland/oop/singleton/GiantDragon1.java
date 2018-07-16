package com.stly7.eland.oop.singleton;

public class GiantDragon1 {
	
	//˽�й���
	private GiantDragon1() {
		
	}
	
	//׼��һ�������ԣ�����ָ��һ��ʵ�������󣬵�����ʱָ��null
	private static GiantDragon1 instance;
	
	//ͨ����������һ��ʵ������
	public static GiantDragon1 getInstance() {
		//��һ�η��ʵ�ʱ�򣬷���instanceû��ָ���κζ�����ʱʵ����һ������
		if (instance == null) {
			instance =  new GiantDragon1();
		}
		//����ʵ������
		return instance;
	}
}

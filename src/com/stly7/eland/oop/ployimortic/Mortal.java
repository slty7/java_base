package com.stly7.eland.oop.ployimortic;

public interface Mortal {
	
	public void die();
	
	//����������Ҫ�����޸ĺ����ʵ��,������д.
	default public void revive() {
		System.out.println("Ӣ�۸�����....");
	}
}

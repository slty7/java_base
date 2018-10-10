package com.stly7.eland.multiplethread.touch;

public class Hero {
	
	public volatile String name;
	public volatile float hp;
	public volatile int damage;
	
	// ��Ѫ����
	public synchronized void recover() {
		hp = hp + 1;
	}
	
	// �ж���Ѫ
	public synchronized void hurt() {
		hp = hp - 1;
	}
	
	// ����
	public void attacHero(Hero h) {
		h.hp -= damage;
		System.out.format("%s ���ڹ���  %s, %s ��Ѫ����� %f %n", name, h.name, h.name, h.hp);
		
		if (isDead()) {
			System.out.println(h.hp + "����...");
		}
	}
	
	// �ж��Ƿ�����
	public boolean isDead() {
		
		return 0 > hp ? true : false;
	}
	
}

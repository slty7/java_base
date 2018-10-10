package com.stly7.eland.multiplethread.touch._new;

public class Hero {
	
	public volatile String name;
	public float hp;
	public volatile int damage;
	
	// ��Ѫ����
	public synchronized void recover() {
		hp = hp + 1;
		System.out.format("%s ��1��Ѫ, %s ��ǰѪ��Ϊ%f %n", name, name, hp);
		try {
			this.notify();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// �ж���Ѫ
	public synchronized void hurt() {
		if (hp == 1) {
			try {
				this.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		hp = hp - 1;
		System.out.format("%s ��1��Ѫ, %s ��ǰѪ��Ϊ%f %n", name, name, hp);
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

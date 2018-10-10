package com.stly7.eland.multiplethread.touch;

public class Hero {
	
	public volatile String name;
	public volatile float hp;
	public volatile int damage;
	
	// 回血方法
	public synchronized void recover() {
		hp = hp + 1;
	}
	
	// 中毒掉血
	public synchronized void hurt() {
		hp = hp - 1;
	}
	
	// 攻击
	public void attacHero(Hero h) {
		h.hp -= damage;
		System.out.format("%s 正在攻击  %s, %s 的血变成了 %f %n", name, h.name, h.name, h.hp);
		
		if (isDead()) {
			System.out.println(h.hp + "死了...");
		}
	}
	
	// 判断是否死亡
	public boolean isDead() {
		
		return 0 > hp ? true : false;
	}
	
}

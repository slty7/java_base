package com.stly7.eland.multiplethread.touch._new;

public class Hero {
	
	public volatile String name;
	public float hp;
	public volatile int damage;
	
	// 回血方法
	public synchronized void recover() {
		hp = hp + 1;
		System.out.format("%s 加1滴血, %s 当前血量为%f %n", name, name, hp);
		try {
			this.notify();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 中毒掉血
	public synchronized void hurt() {
		if (hp == 1) {
			try {
				this.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		hp = hp - 1;
		System.out.format("%s 减1滴血, %s 当前血量为%f %n", name, name, hp);
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

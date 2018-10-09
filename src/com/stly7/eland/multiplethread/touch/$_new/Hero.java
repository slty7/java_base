package com.stly7.eland.multiplethread.touch.$_new;

public class Hero {
	
	public String name;
	public float hp;
	public int damage;
	
	// 回血方法
	public synchronized void recover() {
		
		//if (hp >= 1000){
		// if就会出现血是负数的现象,但是只是改一个hurt几率会小很多,也存在线程击穿
		while(hp >= 1000) {
			try {
				this.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
			// 此处加上一个if判断还是会出现击穿现象,但是有多个出现wait击穿1-2个值
			/*if (hp >= 1000) {
				try {
					this.wait();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}*/
		}
		
		hp = hp + 1;
		System.out.format("%s 加1滴血, %s 当前血量为%f %n", name, name, hp);
		this.notify();
	}
	
	// 中毒掉血
	public synchronized void hurt() {
		// 掉血之后，唤醒等待的线程
		//把if改为while，被唤醒后，会重复查看hp的值，只有hp大于1，才会往下执行
        //if (hp <= 1) {
		while(hp <= 1) {
			try {
				this.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			// 此处加上一个if判断还是会出现击穿现象,但是有多个出现wait击穿1-2个值
			/*if(hp <= 1) {
				try {
					this.wait();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}*/
		}
		hp = hp - 1;
		System.out.format("%s 减1滴血, %s 当前血量为%f %n", name, name, hp);
		this.notify();
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

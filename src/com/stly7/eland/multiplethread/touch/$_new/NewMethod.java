package com.stly7.eland.multiplethread.touch.$_new;
/**
 * 假设加血线程运行得更加频繁，英雄的最大血量是1000
 * 设计加血线程和减血线程的交互，让回血回满之后，加血线程等待，直到有减血线程减血
 * 
 * 主要是承兑的wait notify 的用法
 * 	注意这里不使用notifyAll
 * @author Administrator
 *
 */
public class NewMethod {
	
	public static void main(String[] args) {
		final Hero gareen = new Hero();
		gareen.name = "盖伦";
		gareen.hp = 612;
		
		Thread t1 = new Thread(){
			@Override
			public void run() {
				while (true) {
					gareen.hurt();
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		};
		t1.start();
		
		Thread t2 = new Thread(){
			@Override
			public void run() {
				while (true) {
					gareen.recover();
					try {
						Thread.sleep(10);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		};
		t2.start();
	}
}

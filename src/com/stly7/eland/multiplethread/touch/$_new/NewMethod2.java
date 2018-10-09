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
public class NewMethod2 {
	
	public static void main(String[] args) {
		final Hero gareen = new Hero();
		gareen.name = "盖伦";
		gareen.hp = 612;
		
		for (int i = 0; i < 2; i++) {
            new RecoverThread(gareen).start();
        }
        for (int i = 0; i < 5; i++) {
            new HurtThread(gareen).start();
        }
		
		
	}
	
	static class RecoverThread extends Thread {
		public Hero h;
		public RecoverThread(Hero h) {
			super();
			this.h = h;
		}


		public void run() {
			while (true) {
				h.recover();
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	static class HurtThread extends Thread {
		public Hero h;
		public HurtThread(Hero h) {
			super();
			this.h = h;
		}


		public void run() {
			while (true) {
				h.hurt();
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}

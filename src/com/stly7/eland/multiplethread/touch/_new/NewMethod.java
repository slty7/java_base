package com.stly7.eland.multiplethread.touch._new;

public class NewMethod {
	
	public static void main(String[] args) {
		final Hero gareen = new Hero();
		gareen.name = "¸ÇÂ×";
		gareen.hp = 612;
		
		Thread t1 = new Thread(){
			@Override
			public void run() {
				while (true) {
					gareen.hurt();
					try {
						Thread.sleep(10);
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
						Thread.sleep(100);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		};
		t2.start();
	}
}

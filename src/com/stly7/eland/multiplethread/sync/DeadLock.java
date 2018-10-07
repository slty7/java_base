package com.stly7.eland.multiplethread.sync;
/**
 * 3个同步对象a, b, c
 * 3个线程 t1,t2,t3
 * 
 * 故意设计场景，使这3个线程彼此死锁
 * @author Administrator
 *
 */
public class DeadLock {
	
	public static void main(String[] args) {
		
		Object a = new Object();
		Object b = new Object();
		Object c = new Object();
		
		// 使用线程的时候一定注意sleep的使用,因为线程的处理速度太快,死锁现象不明显
		
		Thread t1 = new Thread(){
			@Override
			public void run() {
				synchronized (a) {
					try {
						// 停一秒,等有足够的时间占领b,和c对象
						// 如果不停止的话就会产生线程1执行完成了再启动线程2或者线程3
						Thread.sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					synchronized (b) {
						synchronized (b) {
						}
					}
				}
			}
		};
		
		Thread t2 = new Thread(){
			@Override
			public void run() {
				synchronized (b) {
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					synchronized (c) {
						synchronized (a) {
						}
					}
				}
			}
		};
		
		Thread t3 = new Thread(){
			@Override
			public void run() {
				synchronized (c) {
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					synchronized (a) {
						synchronized (b) {
						}
					}
				}
			}
		};
		
		t1.start();
		t2.start();
		t3.start();
	}
}

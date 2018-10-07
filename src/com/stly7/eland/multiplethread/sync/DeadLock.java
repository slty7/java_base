package com.stly7.eland.multiplethread.sync;
/**
 * 3��ͬ������a, b, c
 * 3���߳� t1,t2,t3
 * 
 * ������Ƴ�����ʹ��3���̱߳˴�����
 * @author Administrator
 *
 */
public class DeadLock {
	
	public static void main(String[] args) {
		
		Object a = new Object();
		Object b = new Object();
		Object c = new Object();
		
		// ʹ���̵߳�ʱ��һ��ע��sleep��ʹ��,��Ϊ�̵߳Ĵ����ٶ�̫��,������������
		
		Thread t1 = new Thread(){
			@Override
			public void run() {
				synchronized (a) {
					try {
						// ͣһ��,�����㹻��ʱ��ռ��b,��c����
						// �����ֹͣ�Ļ��ͻ�����߳�1ִ��������������߳�2�����߳�3
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

package com.stly7.eland.multiplethread.pool;

import java.util.LinkedList;

public class ThreadPool {
	
	// �̳߳ش�С
	int ThreadPoolSize;
	
	// ��������
	LinkedList<Runnable> tasks = new LinkedList<Runnable>();

	// ��ͼ���������߳�,������
	public ThreadPool() {
		ThreadPoolSize = 10;
		
		// ����10�������������߳�
		synchronized (tasks) {
			for (int i = 0; i < ThreadPoolSize; i++) {
				new TaskConsumerThread("�������߳�" + i).start();
			}
		}
	}
	
	// ����̵߳��̳߳�
	public void add(Runnable r) {
		synchronized (tasks) {
			tasks.add(r);
			// ���ѵȴ��������������߳�
			tasks.notifyAll();
		}
	}
	
	// �ڲ���,�������߳�
	class TaskConsumerThread extends Thread {
		public TaskConsumerThread(String name) {
			super(name);
		}
		Runnable task;
		
		public void run() {
			System.out.println("����: " + this.getName());
			while (true) {
				synchronized (tasks) {
					while (tasks.isEmpty()) {
						try {
							tasks.wait();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					// ÿ���Ƴ��̳߳ؾ͸�ֵ���������
					task = tasks.removeLast();
					// �������������߳̿��Լ����������
					tasks.notifyAll();
				}
				System.out.println(this.getName() + "��ȡ������,����ִ��");
				task.run();
			}
		}
	}
	
}

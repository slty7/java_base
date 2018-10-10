package com.stly7.eland.multiplethread.pool;

import java.util.LinkedList;

public class ThreadPool {
	
	// 线程池大小
	int ThreadPoolSize;
	
	// 任务容器
	LinkedList<Runnable> tasks = new LinkedList<Runnable>();

	// 试图消费任务线程,调用了
	public ThreadPool() {
		ThreadPoolSize = 10;
		
		// 启动10个任务消费者线程
		synchronized (tasks) {
			for (int i = 0; i < ThreadPoolSize; i++) {
				new TaskConsumerThread("消费者线程" + i).start();
			}
		}
	}
	
	// 添加线程到线程池
	public void add(Runnable r) {
		synchronized (tasks) {
			tasks.add(r);
			// 唤醒等待的任务消费者线程
			tasks.notifyAll();
		}
	}
	
	// 内部类,消费者线程
	class TaskConsumerThread extends Thread {
		public TaskConsumerThread(String name) {
			super(name);
		}
		Runnable task;
		
		public void run() {
			System.out.println("启动: " + this.getName());
			while (true) {
				synchronized (tasks) {
					while (tasks.isEmpty()) {
						try {
							tasks.wait();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					// 每次移除线程池就赋值到这个变量
					task = tasks.removeLast();
					// 允许添加任务的线程可以继续添加任务
					tasks.notifyAll();
				}
				System.out.println(this.getName() + "获取到任务,并且执行");
				task.run();
			}
		}
	}
	
}

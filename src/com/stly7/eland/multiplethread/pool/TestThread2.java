package com.stly7.eland.multiplethread.pool;
/**
 *创造一个情景，每个任务执行的时间都是1秒
 *刚开始是间隔1秒钟向线程池中添加任务
 *
 *然后间隔时间越来越短，执行任务的线程还没有来得及结束，新的任务又来了。
 *就会观察到线程池里的其他线程被唤醒来执行这些任务。
 * @author Administrator
 *
 */
public class TestThread2 {
	public static void main(String[] args) {
		// 开启一个线程池 10条线程
		ThreadPool pool = new ThreadPool();
		int sleep = 1000;
		// 创建5个任务,然后添加到线程池中.每个任务的间隔时间是1秒
		while(true) {
			Runnable task = new Runnable() {
				
				@Override
				public void run() {
					//System.out.println("执行任务");
					 try {
						 Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
			};
			pool.add(task);
			try {
				Thread.sleep(sleep);
				sleep = sleep > 100 ? sleep - 100 : sleep;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}

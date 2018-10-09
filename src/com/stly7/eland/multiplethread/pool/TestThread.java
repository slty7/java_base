package com.stly7.eland.multiplethread.pool;
/**
 * 这是一个自定义的线程池，虽然不够完善和健壮，但是已经足以说明线程池的工作原理
 * 缓慢的给这个线程池添加任务，会看到有多条线程来执行这些任务。 
 * 线程7执行完毕任务后，又回到池子里，下一次任务来的时候，线程7又来执行新的任务。
 * @author Administrator
 *
 */
public class TestThread {
	public static void main(String[] args) {
		// 开启一个线程池 10条线程
		ThreadPool pool = new ThreadPool();
		
		// 创建5个任务,然后添加到线程池中.每个任务的间隔时间是1秒
		for (int i = 0; i < 5; i++) {
			Runnable task = new Runnable() {
				
				@Override
				public void run() {
					 //System.out.println("执行任务");
                    //任务可能是打印一句话
                    //可能是访问文件
                    //可能是做排序
				}
			};
			pool.add(task);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}

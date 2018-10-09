package com.stly7.eland.multiplethread.pool;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestThread3 {
	public static void main(String[] args) {
		ThreadPoolExecutor pool = new ThreadPoolExecutor(10, 15, 60, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
		pool.execute(new Runnable() {
			public void run() {
				System.out.println("хннЯ1");
			}
		});
	}
}

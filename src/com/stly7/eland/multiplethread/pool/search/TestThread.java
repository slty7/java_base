package com.stly7.eland.multiplethread.pool.search;

import java.io.File;

import com.stly7.eland.multiplethread.pool.ThreadPool;

public class TestThread {
	static ThreadPool pool = new ThreadPool();
	
	// 创建一个递归的查询, 判断.java文件
	public static void search(File file, String search) {
		if (file.isFile()) {
			if (file.getName().endsWith(".txt")) {
				// 发现java文件立即创建任务
				SearchFileTask task = new SearchFileTask(file, search);
				// 添加到线程池
				pool.add(task);
			}
		}
//		递归专门用来判断文件还是文件夹
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (File f : files) {
				search(f, search);
			}
		}
	}
	
	public static void main(String[] args) {
		File folder =new File("d:\\testThread");
        search(folder, "中国");
	}
}

package com.stly7.eland.multiplethread.pool.search;

import java.io.File;

import com.stly7.eland.multiplethread.pool.ThreadPool;

public class TestThread {
	static ThreadPool pool = new ThreadPool();
	
	// ����һ���ݹ�Ĳ�ѯ, �ж�.java�ļ�
	public static void search(File file, String search) {
		if (file.isFile()) {
			if (file.getName().endsWith(".txt")) {
				// ����java�ļ�������������
				SearchFileTask task = new SearchFileTask(file, search);
				// ��ӵ��̳߳�
				pool.add(task);
			}
		}
//		�ݹ�ר�������ж��ļ������ļ���
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (File f : files) {
				search(f, search);
			}
		}
	}
	
	public static void main(String[] args) {
		File folder =new File("d:\\testThread");
        search(folder, "�й�");
	}
}

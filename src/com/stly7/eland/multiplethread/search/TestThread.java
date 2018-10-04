package com.stly7.eland.multiplethread.search;

import java.io.File;
/**
 * ������ʹ�õݹ�����ų��ļ���
 * ����Ҫ�ж�ifFile ���� isDirectory�Ϳ�����
 * @author Administrator
 *
 */
public class TestThread {
	
	public static void search(File file, String key) {
		if(file.isFile()){
			if(file.getName().toLowerCase().endsWith(".txt")){
	            //���ҵ�.java�ļ���ʱ�򣬾�����һ���̣߳�����ר�ŵĲ���
	            new SearchFileThread(key,file).start();
	        }
		}
		if (file.isDirectory()) {
            File[] fs = file.listFiles();
            for (File f : fs) {
                search(f, key);
            }
        }
	}
	
	public static void main(String[] args) {
		File folder =new File("d:\\testThread");
        search(folder, "�й�");
	}
}

package com.stly7.eland.multiplethread.search;

import java.io.File;
/**
 * 这里是使用递归进行排除文件夹
 * 字需要判断ifFile 或者 isDirectory就可以了
 * @author Administrator
 *
 */
public class TestThread {
	
	public static void search(File file, String key) {
		if(file.isFile()){
			if(file.getName().toLowerCase().endsWith(".txt")){
	            //当找到.java文件的时候，就启动一个线程，进行专门的查找
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
        search(folder, "中国");
	}
}

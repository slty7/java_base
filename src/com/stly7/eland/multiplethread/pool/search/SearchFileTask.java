package com.stly7.eland.multiplethread.pool.search;

import java.io.File;
import java.io.FileReader;

public class SearchFileTask implements Runnable{

	// 搜索目录
	private File file;
	// 搜索的关键字
	private String search;
	
	public SearchFileTask(File file, String search) {
		super();
		this.file = file;
		this.search = search;
	}


	@Override
	public void run() {
		String fileConent = readFileConent(file);
		if (fileConent.contains(search)) {
			 System.out.printf( "线程: %s 找到子目标字符串%s,在文件:%s%n",
					 Thread.currentThread().getName(), search,file);
		}
	}
	
	// 读取文件
	public String readFileConent(File file) {
		try (FileReader fr = new FileReader(file)){
			char[] all = new char[(int)file.length()];
			fr.read(all);
			return new String(all);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}

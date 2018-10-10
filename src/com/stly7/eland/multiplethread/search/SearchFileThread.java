package com.stly7.eland.multiplethread.search;

import java.io.File;
import java.io.FileReader;

/**
 * 把 练习-查找文件内容 改为多线程查找文件内容
 * 原练习的思路是遍历所有文件，当遍历到文件是 .java的时候，查找这个文件的内容，查找完毕之后，再遍历下一个文件
 * 现在通过多线程调整这个思路：
 * 遍历所有文件，当遍历到文件是.java的时候，创建一个线程去查找这个文件的内容，不必等待这个线程结束，继续遍历下一个文件
 * @author Administrator
 *
 */
public class SearchFileThread extends Thread {

	private String key;
	private File file;
	public SearchFileThread(String key, File file) {
		super();
		this.key = key;
		this.file = file;
	}
	
	@Override
	public void run() {
		 String fileContent = readFileConent(file);
        if(fileContent.contains(key)){
            System.out.printf("找到子目标字符串%s,在文件:%s%n", key, file);
        }
	}
	
	// 先用字节流进行读取到缓冲数组中，然后包装字节数组进行包装返回字符串
	// 或者用缓冲流进行每行的读再判断(有缺陷)
	public String readFileConent(File file) {
		try (
			FileReader fr = new FileReader(file);
		){
			char[] all = new char[(int) file.length()];
			fr.read(all);
			return new String(all);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
}









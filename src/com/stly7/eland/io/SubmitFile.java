package com.stly7.eland.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class SubmitFile {
	
	public static void main(String[] args) throws Exception {
		
		//此时,路径就开始不同了,需要遍历这个文件夹下的所有file
		String path = "C:/Users/Administrator/Desktop/1";
		File file = new File(path);
		File[] listFiles = file.listFiles();
		
		try {
			//此时需要遍历file[]  输出到 --> 一个 outputStream
			FileOutputStream fos = new FileOutputStream(new File(path + "/TeamViewer.exe"));
			//注意这里只是一个中间缓存的交换的区间而已
			byte[] b = new byte[100 * 1024];
			//用于计数
			for (int i = 0; i < listFiles.length; i++) {
				FileInputStream fis = new FileInputStream(new File(path + "/TeamViewer.exe-" + i));
				int read = 0;
				
				//其实这样理解是最清楚的,如果吧 fis.read(b)就是每次规定的长度读取
				//如果没有后面参数合并的时候是可以的但是,拆分的时候就不行
				while ((read = fis.read(b, 0, b.length)) != -1) {
					System.out.println(read);
					//每次写的长度
					fos.write(b, 0, read);
					fos.flush();
				}
				fis.close();
			}
		} catch (Exception e) {
			System.out.println("合并异常");
		}
	}
}

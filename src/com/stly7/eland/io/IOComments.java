package com.stly7.eland.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.net.URL;

/**
 * 设计一个方法，用于移除Java文件中的注释
 * @author Administrator
 *
 */
public class IOComments {
	
	
	public static void main(String[] args) throws Exception {
		
		File file = new File("test.txt");
		System.out.println(file.getAbsolutePath());
		removeComments(file);
	}
	
	/**
	 * 设计一个方法，用于移除Java文件中的注释,移除单行的注释,保留多行注释
	 * @author Administrator
	 * @throws Exception 
	 *
	 */
	public static void removeComments(File javaFile) throws Exception {
		//使用缓冲流
		FileReader fr = new FileReader(javaFile);
		//包装一下
		BufferedReader br = new BufferedReader(fr);
		
		//创建一个写入缓存流
		PrintWriter pw = new PrintWriter(new File("d:/test.java"));
		 while (true) {
             // 一次读一行
             String line = br.readLine();
             if (null == line){
                 break;
             }
             //这个笔记荞巧妙之处
             if (line.trim().startsWith("//")) {
				continue;
			}else {
				pw.println(line);
				pw.flush();
			}
             
         }
		
	}
}

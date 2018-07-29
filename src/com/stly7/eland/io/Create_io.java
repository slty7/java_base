package com.stly7.eland.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Create_io {
	
	public static void main(String[] args) throws Exception {
		String in_path = "F:/编程常用软件/SQLyog6Ent.rar";
		String out_path = "F:/编程常用软件";
		//创建一个文件对象
		File in_file = new File(in_path);
		File out_file = new File(out_path);
		
		//创建一个输入留
		FileInputStream fis= new FileInputStream(in_file);
		
		//创建一个输出流
		FileOutputStream fos= new FileOutputStream(out_file);
		
	}
}

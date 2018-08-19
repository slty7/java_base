package com.stly7.eland.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * 复制文件夹,实现如下方法，把源文件夹下所有的文件 复制到目标文件夹下(包括子文件夹)
 * @author Administrator
 *
 */
public class SearchContent {
	
	public static void main(String[] args) {
		search(new File("D:\\1"), "中国");
	}
	
	//搜索内容
	public static void search(File folder, String search) {
		foreFolder(folder, search);
	}
	
	//遍历文件夹所有所有的可读的文件
	public static void foreFolder(File folder, String search) {
		File[] listFiles = folder.listFiles();
		
		for (File file : listFiles) {
			if (file.isDirectory()) {
				foreFolder(file, search);
			}else {
				readAndCompare(file, search);
			}
		}
	}
	
	//读取并且比较
	public static void readAndCompare(File file, String search) {
		try(
				//用字节流中间多一个人char[] 转String而已,就不会出现重复或相同的地方了
			BufferedReader br = 
				new BufferedReader(new FileReader(file));
		) {
			while(true) {
				String buf = "";
				buf = br.readLine();
				//如果读取完再进行到  buf.contains ,再配合continue性能可能会提高
				if (file == null) {
					break;
				}
				//包含中国则打印出来
				if(buf.contains(search)) {
					System.out.println("在文件" + file + "找到了<中国>两个字");
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

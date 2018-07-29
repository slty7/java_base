package com.stly7.eland.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;

/**
 * 以字节流的形式向文件写入数据 中的例子，当lol2.txt不存在的时候，是会自动创建lol2.txt文件的。
	但是，如果是写入数据到d:/xyz/lol2.txt，而目录xyz又不存在的话，就会抛出异常。
	那么怎么自动创建xyz目录？
	如果是多层目录 d:/xyz/abc/def/lol2.txt 呢？
 * @author Administrator
 *
 */
public class Write_mutillateSonDir {
	private static final String[][] String = null;
	static String out_path = "d:/xyz/abc/def/lol2.txt";
	static String mkdir_path = "";
	
	public static void main(String[] args) throws IOException {
		Write_mutillateSonDir mutillateSonDir = new Write_mutillateSonDir();
		File fo = new File(out_path);
		//首先创建文件夹
		mutillateSonDir.createFile();
		
		//数据缓存
		byte[] cache = {88, 89};
		
		FileOutputStream fos = new FileOutputStream(fo);
		fos.write(cache);
		fos.close();
	}
	
	//创建文件夹
	public void createFile() {
		File mkDirFile = getMkDirFile();
		// 这里一定要创建mkdirs才是多层创建文件夹
		mkDirFile.mkdirs();
	}
	
	//获得创建文件夹路径
	public File getMkDirFile() {
		
		String[] split = out_path.split("/");
		for (int i = 0; i < split.length - 1; i++) {
			if (i == split.length - 2) {
				mkdir_path += split[i];
			}else {
				mkdir_path += split[i] + "/";
			}
		}
		System.out.println(mkdir_path);
		return new File(mkdir_path);
	}
}

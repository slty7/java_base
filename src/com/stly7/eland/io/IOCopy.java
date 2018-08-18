package com.stly7.eland.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOCopy {
	
	
	public static void main(String[] args) {
		//copyFile("D:/xfmovie/IPZ429.rmvb", "d:");
		long begin = System.currentTimeMillis();
		copyFolder("E:\\QQMusicCache", "E:\\test");
		System.out.println("结束操作....");
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
		
	}

	/**
	 * 复制文件是常见的IO操作，设计如下方法，实现复制源文件srcFile到目标文件destFile
	 */
	public static void copyFile(String srcFile, String destFile){
		//注意正则表达式 的用法
		String[] split = srcFile.split("\\\\");
		destFile = destFile + "\\" + split[split.length -1];
		try (
				BufferedInputStream bis = new 
					BufferedInputStream(new FileInputStream(srcFile));
				BufferedOutputStream bos = new 
					BufferedOutputStream(new FileOutputStream(destFile))
			){
				//根据个人需求和机器的性能来更改数组的长度,长度不能低于10M
				byte[] buf = new byte[10485760];
				int val = 0;
				while(true) {
					val = bis.read(buf);
					if (val == -1) {
						break;
					}
					bos.write(buf, 0, (int)new File(srcFile).length());
				}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	/**
	 * 复制文件夹,实现如下方法，把源文件夹下所有的文件 复制到目标文件夹下(包括子文件夹)
	 */
	public static void copyFolder(String srcFolder, String destFolder){
		// 1.首先需要遍历源文件夹.这里一定是全路径
		File srcFile = new File(srcFolder);
		//当前文件夹下面的非文件夹目录,这里不用file对象,用字符串反而方便
		String[] filelist = srcFile.list();
		for (String string : filelist) {
			//因为在copyFile里面添加了后缀,所以只需要指定目录即可
			copyFile(srcFolder + "\\" + string, destFolder);
			System.out.println("源路径: -->" + srcFolder + "\\" + string + ", 目标路径: -->" + destFolder);
		}
		
		//当前文件夹的目录
		File[] listFiles = srcFile.listFiles();
		for (File file : listFiles) {
			if (file.isDirectory()) {
				System.out.println(file + "," + destFolder + "\\" + file.toString().split("\\\\")[file.toString().split("\\\\").length - 1]);
				//先创建文件夹,不然不能赋值
				File sonFile = new File(destFolder + "\\" + file.toString().split("\\\\")[file.toString().split("\\\\").length - 1]);
				sonFile.mkdirs();
				//复制文件
				copyFolder(file.toString(), destFolder + "\\" + file.toString().split("\\\\")[file.toString().split("\\\\").length - 1]);
			}
		}
	}
}

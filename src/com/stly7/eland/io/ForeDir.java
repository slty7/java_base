package com.stly7.eland.io;

import java.io.File;
import java.util.Arrays;

/**
 * 一般说来操作系统都会安装在C盘，所以会有一个 C:\WINDOWS目录。
	遍历这个目录下所有的文件(不用遍历子目录)
	找出这些文件里，最大的和最小(非0)的那个文件，打印出他们的文件名
 * @author Administrator
 *
 */
public class ForeDir {
	public static void main(String[] args) {
	
		//创建一个路径
		File file = new File("F:/编程常用软件");
		File[] fs = new File[file.list().length];
		
		//参考别人的算法
		 long max = 0;
		 //这里不能让最小值等于0，如果等于0，
		 //则最小文件会取不到，因为获取文件的时候排除了大小为0的文件
		 long min = Integer.MAX_VALUE;
		 
		 File max_file = null;
		 File min_file = null;
		 //用于统计层数
		
		for (int i = 0; i < file.list().length; i++) {
			fs = file.listFiles();
		}
		
		ForeDir foreDir = new ForeDir();
		foreDir.fore_dir(fs, max, min, max_file, min_file);
	}

	//求出最大最小值
	public void fore_dir(File[] fs, long max, long min, File max_file, File min_file) {
		for (int i = 0; i < fs.length; i++) {
			//注意这里的条件一定不能错,若果错误的话就出现空指针异常
			if (!fs[i].isDirectory()) {
				if (fs[i].exists() && !fs[i].isDirectory()) {
					if (fs[i].length() > max) {
						max = fs[i].length();
						max_file = fs[i];
					}
				}
				if (fs[i].exists() && !fs[i].isDirectory() && 0 != fs[i].length()) {
					if (fs[i].length() < min) {
						min = fs[i].length();
						min_file = fs[i];
					}
				}
			}else {
				fore_dir(fs[i].listFiles(), max, min, max_file, min_file);
			}
		}
		System.out.println("这个最大值" + max_file + " size:" + max);
		System.out.println("这个最小值" + min_file + " size:" + min);
		System.out.println("");
	}
}

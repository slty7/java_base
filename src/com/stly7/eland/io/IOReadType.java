package com.stly7.eland.io;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 要求
 * 第一种方式： 使用缓存流把两个数字以字符串的形式写到文件里，
 * 再用缓存流以字符串的形式读取出来，然后转换为两个数字。 
 * 		注： 两个数字之间要有分隔符用于区分这两个数字。 比如数字是31和15，如果不使用分隔符，那么就是3115，
 * 			读取出来就无法识别到底是哪两个数字。 使用分隔符31@15能解决这个问题。
 * 
 * 第二种方式： 使用数据流DataOutputStream向文件连续写入两个数字，
 * 然后用DataInpuStream连续读取两个数字
 * @author Administrator
 *
 */
public class IOReadType {
	
	public static void main(String[] args) throws Exception {
		//one_write();
		//one_read();
		two_write();
		//one_read();
		
		
	}
	
	public static void one_write() throws Exception {
		/* 第一种方式： 使用缓存流把两个数字以字符串的形式写到文件里，
		 * 再用缓存流以字符串的形式读取出来，然后转换为两个数字。 
		 * 		注： 两个数字之间要有分隔符用于区分这两个数字。 比如数字是31和15，如果不使用分隔符，那么就是3115，
		 * 			读取出来就无法识别到底是哪两个数字。 使用分隔符31@15能解决这个问题。
		 * */
		File file = new File("d:/data_io.txt");
		int[] arr = {31, 15};
		//true是启开最后追加模式
		//PrintWriter pw = new PrintWriter(new FileWriter(file,true));
		PrintWriter pw = new PrintWriter(new FileWriter(file));
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length -1) {
				pw.print(arr[i]);
				pw.flush();
			}else {
				pw.print(arr[i] + "&");
				pw.flush();
			}
		}
	}
	
	public static void one_read() throws Exception {
		File file = new File("d:/data_io.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String str = br.readLine();
		String[] split = str.split("&");
		int[] arr = new int[split.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(split[i]);
		}
		
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	
	/**
	 * 第二种解法,直复制过来
	 * @throws Exception 
	 * 
	 */
	public static void two_write() throws Exception {
		File file = new File("d:/data_io.txt");
		int[] arr = {31, 15};
		DataOutputStream dos = 
				new DataOutputStream(new FileOutputStream(file));
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length -1) {
				dos.writeInt(arr[i]);
				dos.flush();
			}else{
				dos.writeInt(arr[i]);
				dos.writeChars("&");
				dos.flush();
			}
		}
		
		
	}
	
}

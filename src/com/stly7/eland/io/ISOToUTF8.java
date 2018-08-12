package com.stly7.eland.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
/**
 * 找出 E5 B1 8C 这3个十六进制对应UTF-8编码的汉字
 * @author Administrator
 *
 */

public class ISOToUTF8 {
	
	static String path = "D:/in_out.txt";
	
	public static void main(String[] args) {
		inOut();
	}
	
	
	//因为FileRead不能设置编码所以智能用字节流进行转换
	@SuppressWarnings("resource")
	public static void inOut() {
		File file = new File(path);
		
		try {
			FileReader fr = new FileReader(file);
			char[] cs = new char[(int) file.length()];
			fr.read(cs);
			String str = new String(cs);
			//通过剪切数组得到两个一组的字符串
			//通过字符串转成16位的数字,并且强转成为byte类型的数据
			//最后通过byte类型数据读出用utf-8显示出来
			String[] split = str.split(" ");
			byte[] buffer = new byte[split.length];
			for (int i = 0; i < buffer.length; i++) {
				buffer[i] = (byte) Integer.parseInt(split[i], 16);
			}
			
			System.out.println(new String(buffer, "utf-8"));;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

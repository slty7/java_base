package com.stly7.eland.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class ISOToGBK {
	
	static String path = "D:/in_out.txt";
	
	public static void main(String[] args) {
		inOut();
	}
	
	
	//��ΪFileRead�������ñ��������������ֽ�������ת��
	@SuppressWarnings("resource")
	public static void inOut() {
		File file = new File(path);
		
		try {
			FileReader fr = new FileReader(file);
			char[] cs = new char[(int) file.length()];
			fr.read(cs);
			String str = new String(cs);
			String str1 =  new String(str.getBytes(), "utf-8");
			System.out.println(str1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

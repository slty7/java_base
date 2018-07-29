package com.stly7.eland.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

/**
 * 准备一个文本文件(非二进制)，其中包含ASCII码的字符和中文字符。
	设计一个方法
	public static void encodeFile(File encodingFile, File encodedFile);
	在这个方法中把encodingFile的内容进行加密，然后保存到encodedFile文件中。
	加密算法： 
	数字：
	如果不是9的数字，在原来的基础上加1，比如5变成6, 3变成4
	如果是9的数字，变成0
	字母字符：
	如果是非z字符，向右移动一个，比如d变成e, G变成H
	如果是z，z->a, Z-A。
	字符需要保留大小写
	非字母字符
	比如',&^ 保留不变，中文也保留不变
	建议： 使用以前学习的练习题中的某个Java文件，比如循环练习，就有很多的字符和数字
 * @author Administrator
 *
 */
public class Lock_UnlockFileReader {
	
	public static void main(String[] args) {
		
		 File encodingFile = new File("d:/lol1.txt");
		 File encodedFile = new File("d:/lol2.txt");
		encodeFile(encodingFile, encodedFile);
		
		File decodingFile = new File("d:/lol3.txt");
		File decodedFile = new File("d:/lol4.txt");
		decodeFile(decodingFile, decodedFile);
		
	}
	
	//传入加密的文件,
	public static void encodeFile(File encodingFile, File encodedFile) {
		try {
			FileReader fr = new FileReader(encodingFile);
			FileWriter fw = new FileWriter(encodedFile);
			char[] cs = new char[1024];
			int len = 0;
			while((len = fr.read(cs) )!= -1) {
				//加密
				char[] new_cs = lock(cs);
				fw.write(new_cs, 0, (int)encodingFile.length());
				fw.close();
			}
			fr.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//加密
	public static char[] lock(char[] cs) {
		/**
		 * 加密算法： 
		数字：
		如果不是9的数字，在原来的基础上加1，比如5变成6, 3变成4
		如果是9的数字，变成0
		字母字符：
		如果是非z字符，向右移动一个，比如d变成e, G变成H
		如果是z，z->a, Z-A。
		字符需要保留大小写
		非字母字符
		比如',&^ 保留不变，中文也保留不变
		 */
		char[] new_cs = new char[cs.length];
		System.out.println("加密前---->"+ Arrays.toString(cs));
		
		for (int i = 0; i < cs.length; i++) {
			if ('9'> cs[i] && cs[i]>= '0') {
				new_cs[i] = (char) ((int)cs[i] + 1);
			}else if('9' == cs[i]) {
				new_cs[i] = '0';
			}else if('z'> cs[i] && cs[i]>= 'a' || 'Z'> cs[i] && cs[i]>= 'A') {
				new_cs[i] = (char) ((int)cs[i] + 1);
			}else if ('z' == cs[i] || 'Z' == cs[i]){
				  if (cs[i] == 'z') {
					new_cs[i] = 'a';
				}else {
					new_cs[i] = 'A';
				}
			}else {
				new_cs[i] = cs[i];
			}
		}
		
		System.out.println("加密后---->"+ Arrays.toString(new_cs));
		return new_cs;
	}
	
	//解密
	public static void decodeFile(File decodingFile, File decodedFile){
		try {
			FileReader fr = new FileReader(decodingFile);
			FileWriter fw = new FileWriter(decodedFile);
			char[] cs = new char[1024];
			int len = 0;
			while((len = fr.read(cs) )!= -1) {
				//加密
				char[] new_cs = unlock(cs);
				fw.write(new_cs, 0, (int)decodingFile.length());
				fw.close();
			}
			fr.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//解密
	public static char[] unlock(char[] cs) {
		/**
		 * 加密算法： 
		数字：
		如果不是9的数字，在原来的基础上加1，比如5变成6, 3变成4
		如果是9的数字，变成0
		字母字符：
		如果是非z字符，向右移动一个，比如d变成e, G变成H
		如果是z，z->a, Z-A。
		字符需要保留大小写
		非字母字符
		比如',&^ 保留不变，中文也保留不变
		 */
		char[] new_cs = new char[cs.length];
		System.out.println("解密前---->"+ Arrays.toString(cs));
		
		for (int i = 0; i < cs.length; i++) {
			if ('9'>= cs[i] && cs[i]> '0') {
				new_cs[i] = (char) ((int)cs[i] - 1);
			}else if('0' == cs[i]) {
				new_cs[i] = '9';
			}else if('a' < cs[i] && cs[i] <= 'z' || 'A' < cs[i] && cs[i] <= 'z') {
				new_cs[i] = (char) ((int)cs[i] - 1);
			}else if ('a' == cs[i] || 'A' == cs[i]){
				  if (cs[i] == 'a') {
					new_cs[i] = 'z';
				}else {
					new_cs[i] = 'Z';
				}
			}else {
				new_cs[i] = cs[i];
			}
		}
		
		System.out.println("解密后---->"+ Arrays.toString(new_cs));
		return new_cs;
	}

}

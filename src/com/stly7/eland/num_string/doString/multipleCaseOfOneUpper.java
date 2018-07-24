package com.stly7.eland.num_string.doString;
/**
 * Nature has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak
	把最后一个two单词首字母大写
 * @author Administrator
 *
 */
public class multipleCaseOfOneUpper {
	
	public static void main(String[] args) {
		//给出一段话
		String str = "Nature has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak";
		//给出一个单词
		String value = "two";
		int lastIndexOf = str.lastIndexOf(value);
		String ago_str = str.substring(0 ,lastIndexOf);
		String before_str = str.substring(lastIndexOf, str.length());
		
		//用于替换的字符
		char upperCase = Character.toUpperCase(before_str.charAt(0));
		before_str =upperCase + before_str.substring(1, before_str.length());
		
		str = ago_str + before_str;
		System.out.println(str);
	}
}

package com.stly7.eland.num_string.doString;
/**
 * Nature has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak
	�����һ��two��������ĸ��д
 * @author Administrator
 *
 */
public class multipleCaseOfOneUpper {
	
	public static void main(String[] args) {
		//����һ�λ�
		String str = "Nature has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak";
		//����һ������
		String value = "two";
		int lastIndexOf = str.lastIndexOf(value);
		String ago_str = str.substring(0 ,lastIndexOf);
		String before_str = str.substring(lastIndexOf, str.length());
		
		//�����滻���ַ�
		char upperCase = Character.toUpperCase(before_str.charAt(0));
		before_str =upperCase + before_str.substring(1, before_str.length());
		
		str = ago_str + before_str;
		System.out.println(str);
	}
}

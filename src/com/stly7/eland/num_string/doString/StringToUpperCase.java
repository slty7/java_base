package com.stly7.eland.num_string.doString;
/**
 * ����һ��Ӣ�ľ��ӣ� "let there be light"
	�õ�һ���µ��ַ�����ÿ�����ʵ�����ĸ��ת��Ϊ��д
 * @author Administrator
 *
 */

public class StringToUpperCase {
	public static void main(String[] args) {
		//����1
		String s =  "let there be light";
		String[] strs = s.split(" ");
		
		String strNew = "";
		for (int i = 0; i < strs.length; i++) {
			char charAt = strs[i].charAt(0);
			
			String temp = strs[i].replace(charAt, Character.toUpperCase(charAt));
			if (i == strs.length - 1) {
				strNew += temp;
			}else{
				strNew += temp + " ";
			}
		}
		
		System.out.println(strNew);
		
		System.out.println("===============");
		
		//����2
		String sentence1="garen kill teemo";
		String[]a=sentence1.split(" ");
		for (String string : a) {
			String c= string.toUpperCase();
			char d=c.charAt(0);
			System.out.print(d+ string.substring(1,string.length())+" ");
		}
	}
}

package com.stly7.eland.num_string.doString;
/**
 * 给出一句英文句子： "let there be light"
	得到一个新的字符串，每个单词的首字母都转换为大写
 * @author Administrator
 *
 */

public class StringToUpperCase {
	public static void main(String[] args) {
		//方法1
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
		
		//方法2
		String sentence1="garen kill teemo";
		String[]a=sentence1.split(" ");
		for (String string : a) {
			String c= string.toUpperCase();
			char d=c.charAt(0);
			System.out.print(d+ string.substring(1,string.length())+" ");
		}
	}
}

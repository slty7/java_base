package com.stly7.eland.num_string.doString;
/**
 * 给出一句英文句子： "let there be light"
	得到一个新的字符串，每个单词的首字母都转换为大写
 * @author Administrator
 *
 */

public class StringToUpperCase {
	static String[] strs;
	
	//切割
	public String[] split(String str, String regex) {
		return str.split(regex);
	}
	
	//转换字符数组中的第一个,并且替换
	public void toUpperCase(String[] strs) {
		for (int i = 0; i < strs.length; i++) {
			char temp = strs[i].charAt(0);
			temp = Character.toUpperCase(temp);
			//需要转换的字符串
			String upperCase = temp + "";
			//首字母替换
			strs[i] =upperCase + strs[i].substring(1, strs[i].length());
			
		}
	}
	
	//显示
	public void show() {
		for (int i = 0; i < strs.length; i++) {
			if (i == strs.length - 1) {
				System.out.print(strs[i]);
			}else {
				System.out.print(strs[i] + " ");
			}
		}
	}
	
	
	public static void main(String[] args) {
		//首先转换成为字符数组
		String str =  "let there be light";
		//切割方式
		String regex = " ";
		
		//拆分后的分成若干个数组
		StringToUpperCase upperCase = new StringToUpperCase();
		strs = upperCase.split(str,regex);
		
		//转换并且替换
		upperCase.toUpperCase(strs);
		
		//显示
		upperCase.show();
		
	}
}

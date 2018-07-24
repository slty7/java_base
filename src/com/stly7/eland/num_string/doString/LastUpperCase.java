package com.stly7.eland.num_string.doString;
/**
 * 把 lengendary 最后一个字母变大写
 * @author Administrator
 *
 */
public class LastUpperCase {
	
	public static void main(String[] args) {
		String str = "lengendary";
		//1.先剪辑除去最后一个字母的字符串,然后再拼接单独最后一个的(转换大写的)字符串
		str = str.substring(0, str.length() - 1) + str.substring(str.length() - 1).toUpperCase();
		System.out.println(str);
	}
}

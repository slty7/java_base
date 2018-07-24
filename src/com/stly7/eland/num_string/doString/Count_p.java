package com.stly7.eland.num_string.doString;

import java.lang.reflect.Array;

/**
 * 英文绕口令
	peter piper picked a peck of pickled peppers
	统计这段绕口令有多少个以p开头的单词
 * @author Administrator
 *
 */
public class Count_p {
	static String str = "peter piper picked a peck of pickled peppers";
	static String regex = " ";
	
	//切割 + 拼接首字母
	public String[] split(String str, String regex) {
		return str.split(regex);
	}
	
	public static void main(String[] args) {
		Count_p count_p = new Count_p();
		String[] split = count_p.split(str, regex);
		
		//统计
		int count = 0;
		for (int i = 0; i < split.length; i++) {
			if (split[i].charAt(0) == 'p') {
				System.out.println("--->" + split[i]);
				count ++;
			}
		}
		
		System.out.println("出现p有" + count + "次");
	}
}

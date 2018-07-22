package com.stly7.eland.num_string.character;

import java.util.Scanner;

/**
 * 通过Scanner从控制台读取字符串，然后把字符串转换为字符数组
	参考的转换方式:
	String str = "abc123";
	char[] cs = str.toCharArray(); 
	转换为字符数组后，筛选出控制台读取到的字符串中的大写字母和数字，并打印出来
 * @author Administrator
 *
 */
public class character {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入一串字符串:");
		String str = scanner.nextLine();
		
		//方法1
		char[] cs = str.toCharArray();
		
		//方法2
		char[] cs1 = new char[str.length()];
		for (int i = 0; i < cs1.length; i++) {
			cs[i] = str.charAt(i);
		}
		
		
		//方法1
		for (int i = 0; i < cs.length; i++) {
			if (cs [i] >= '0' && cs [i] <= '9' ||  cs [i] >= 'A' && cs [i] <= 'Z') {
				System.out.print(cs[i]);
			}
		}
		
		//方法2
		for (int i = 0; i < cs.length; i++) {
			if (Character.isDigit(cs[i]) || Character.isUpperCase(cs[i])) {
				System.out.println(cs[i]);
			}
		}
	}
}

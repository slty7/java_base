package com.stly7.eland.num_string.character;

import java.util.Scanner;

/**
 * ͨ��Scanner�ӿ���̨��ȡ�ַ�����Ȼ����ַ���ת��Ϊ�ַ�����
	�ο���ת����ʽ:
	String str = "abc123";
	char[] cs = str.toCharArray(); 
	ת��Ϊ�ַ������ɸѡ������̨��ȡ�����ַ����еĴ�д��ĸ�����֣�����ӡ����
 * @author Administrator
 *
 */
public class character {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������һ���ַ���:");
		String str = scanner.nextLine();
		
		//����1
		char[] cs = str.toCharArray();
		
		//����2
		char[] cs1 = new char[str.length()];
		for (int i = 0; i < cs1.length; i++) {
			cs[i] = str.charAt(i);
		}
		
		
		//����1
		for (int i = 0; i < cs.length; i++) {
			if (cs [i] >= '0' && cs [i] <= '9' ||  cs [i] >= 'A' && cs [i] <= 'Z') {
				System.out.print(cs[i]);
			}
		}
		
		//����2
		for (int i = 0; i < cs.length; i++) {
			if (Character.isDigit(cs[i]) || Character.isUpperCase(cs[i])) {
				System.out.println(cs[i]);
			}
		}
	}
}

package com.stly7.eland.num_string.doString;
/**
 * ����һ��Ӣ�ľ��ӣ� "let there be light"
	�õ�һ���µ��ַ�����ÿ�����ʵ�����ĸ��ת��Ϊ��д
 * @author Administrator
 *
 */

public class StringToUpperCase {
	static String[] strs;
	
	//�и�
	public String[] split(String str, String regex) {
		return str.split(regex);
	}
	
	//ת���ַ������еĵ�һ��,�����滻
	public void toUpperCase(String[] strs) {
		for (int i = 0; i < strs.length; i++) {
			char temp = strs[i].charAt(0);
			temp = Character.toUpperCase(temp);
			//��Ҫת�����ַ���
			String upperCase = temp + "";
			//����ĸ�滻
			strs[i] =upperCase + strs[i].substring(1, strs[i].length());
			
		}
	}
	
	//��ʾ
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
		//����ת����Ϊ�ַ�����
		String str =  "let there be light";
		//�иʽ
		String regex = " ";
		
		//��ֺ�ķֳ����ɸ�����
		StringToUpperCase upperCase = new StringToUpperCase();
		strs = upperCase.split(str,regex);
		
		//ת�������滻
		upperCase.toUpperCase(strs);
		
		//��ʾ
		upperCase.show();
		
	}
}

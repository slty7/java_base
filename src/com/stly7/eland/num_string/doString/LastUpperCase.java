package com.stly7.eland.num_string.doString;
/**
 * �� lengendary ���һ����ĸ���д
 * @author Administrator
 *
 */
public class LastUpperCase {
	
	public static void main(String[] args) {
		String str = "lengendary";
		//1.�ȼ�����ȥ���һ����ĸ���ַ���,Ȼ����ƴ�ӵ������һ����(ת����д��)�ַ���
		str = str.substring(0, str.length() - 1) + str.substring(str.length() - 1).toUpperCase();
		System.out.println(str);
	}
}

package com.stly7.eland.num_string.doString;

import java.lang.reflect.Array;

/**
 * Ӣ���ƿ���
	peter piper picked a peck of pickled peppers
	ͳ������ƿ����ж��ٸ���p��ͷ�ĵ���
 * @author Administrator
 *
 */
public class Count_p {
	static String str = "peter piper picked a peck of pickled peppers";
	static String regex = " ";
	
	//�и� + ƴ������ĸ
	public String[] split(String str, String regex) {
		return str.split(regex);
	}
	
	public static void main(String[] args) {
		Count_p count_p = new Count_p();
		String[] split = count_p.split(str, regex);
		
		//ͳ��
		int count = 0;
		for (int i = 0; i < split.length; i++) {
			if (split[i].charAt(0) == 'p') {
				System.out.println("--->" + split[i]);
				count ++;
			}
		}
		
		System.out.println("����p��" + count + "��");
	}
}

package com.stly7.eland.num_string.doString;

import java.util.Random;

public class CompareString {
	Random random = new Random();
	char[] cs = new char[2];
	
	public static void main(String[] args) {
		CompareString compare = new CompareString();
		
		String[] strs = new String[100];
		//���
		for (int i = 0; i < strs.length; i++) {
			strs[i] = compare.getChar();
		}
		
	}
	
	//���һ���ַ���
	public String getChar() {
		for (int i = 0; i < cs.length; i++) {
			//�����������һ����0��ʼ��������(2),��������3��������Χ�ڵ�����л�
			int y = random.nextInt(3) + 0;
            if (y == 0) {
                cs[i] = (char)(random.nextInt(9)+49);
            }else if (y==1) {
                cs[i] = (char)(random.nextInt(25)+66);
            }else {
                cs[i] = (char)(random.nextInt(25)+98);
            }
		}
		return new String(cs);
	}
	
	
}

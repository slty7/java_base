package com.stly7.eland.num_string.doString;

import java.util.Random;

public class CompareString {
	Random random = new Random();
	char[] cs = new char[2];
	
	public static void main(String[] args) {
		CompareString compare = new CompareString();
		
		String[] strs = new String[100];
		//填充
		for (int i = 0; i < strs.length; i++) {
			strs[i] = compare.getChar();
		}
		
	}
	
	//获得一个字符串
	public String getChar() {
		for (int i = 0; i < cs.length; i++) {
			//这里随机是哪一个从0开始到第三个(2),都是在这3个条件范围内的随机切换
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

package com.stly7.eland.num_string.random_string;

import java.util.Random;

/**
 * 创建一个长度是5的随机字符串，随机字符有可能是数字，大写字母或者小写字母
	给点提示: 数字和字符之间可以通过互相转换
 	
	char c = 'A';
	short s = (short) c;
	通过这个手段就能够知道字符 a-z A-Z 0-9 所对应的数字的区间了
 * @author Administrator
 *
 */
public class RamString {
	Random random = new Random();
	char[] cs = new char[5];
	
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
	
	public static void main(String[] args) {
		RamString ramString = new RamString();
		//这样的随机数更加容易
		String string = ramString.getChar();
		System.out.println(string);
	}
	
}

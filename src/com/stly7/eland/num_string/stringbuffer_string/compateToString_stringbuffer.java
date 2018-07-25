package com.stly7.eland.num_string.stringbuffer_string;

import java.util.Random;
/**
 * String与StringBuffer的性能区别?

	生成10位长度的随机字符串
	然后,先使用String的+,连接10000个随机字符串,计算消耗的时间
	然后,再使用StringBuffer连接10000个随机字符串,计算消耗的时间

	提示: 使用System.currentTimeMillis() 获取当前时间(毫秒)
 * @author Administrator
 *
 */
public class compateToString_stringbuffer {
	Random random = new Random();
	char[] cs = new char[10];
	
	public static void main(String[] args) {
		compateToString_stringbuffer string_stringbuffer = new compateToString_stringbuffer();
		//使用string的拼接
		String str1 = "";
		long start1 = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			str1 += string_stringbuffer.getChar() + "";
		}
		long end1 = System.currentTimeMillis();
		System.out.println(str1.length());
		string_stringbuffer.show(str1, start1, end1);
		
		System.out.println("============================");
		
		//使用StringBuffer进行拼接
		StringBuffer sb = new StringBuffer();
		long start2 = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			sb = sb.append(string_stringbuffer.getChar());
		}
		long end2 = System.currentTimeMillis();
		System.out.println(sb.toString().length());
		string_stringbuffer.show(sb.toString(), start2, end2);
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
	
	public void show(String str, long start, long end) {
		System.out.println(str);
		System.out.println(start);
		System.out.println(end);
		System.out.println(end - start);
	}
	
}

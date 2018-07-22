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
	
	public static void main(String[] args) {
		Random random = new Random();
		char[] cs = new char[5];
		//用于记住下标
		int index = 0;
		//设定一个死循环的出口条件
		boolean flag = true;
		
		//死循环
		while(flag) {
			//首先循环第一个找到了就跳出循环,并且记住下标
			for (int i = index; i < cs.length; i++) {
				char num = (char) (random.nextInt(73) + 48);
				
				//判断通过这个手段就能够知道字符 a-z A-Z 0-9 所对应的数字的区间了
				if (num >= '0' && num <= '9' ||  num >= 'A' && num <= 'Z' || num >= 'a' && num <= 'z') {
					cs[i] = num;
					
					//查看存进去的数据
					System.out.println("---->" + cs[i] + "  " + i);
					//这里一定是++,下一次开始的下标一定是本次结束后的下一个下标
					index = i ++;
					break;
				}
			}
			
			//出口
			if (index == 4) {
				flag = false;
			}
		}
		
		//打印
		for (int i = 0; i < cs.length; i++) {
			System.out.print(cs[i]);
		}
	}
}

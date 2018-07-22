package com.stly7.eland.num_string.sort;

import java.util.Random;

/**
 * 
 * 创建一个长度是8的字符串数组
	使用8个长度是5的随机字符串初始化这个数组
	对这个数组进行排序，按照每个字符串的首字母排序(无视大小写)

	注1： 不能使用Arrays.sort() 要自己写
	注2： 无视大小写，即 Axxxx 和 axxxxx 没有先后顺序
 * @author Administrator
 *
 */
public class StringSort {
	
	public static void main(String[] args) {
		//1.一个长度是8的字符串数组
		String [] str_arr = new String [8];
		
		//随机填充5个字符的方法
		char [] cs= new char[5];
		StringSort stringSort = new StringSort();
		stringSort.random_padd(cs);
		
		//2.每个字符串都是5个字符组成
		for (int i = 0; i < str_arr.length; i++) {
			str_arr [i] = new String(cs);
		}
		
		//再创建一个数组用于装排序后的
		String [] str_sort = new String [str_arr.length];
		
	}
	
	//5位数随机填充数字字母字符
	public void random_padd(char [] cs) {
		Random random = new Random();
		cs = new char[5];
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
	}
	
	//排序按照首字母进行排序
	public void sort(String [] str_arr, String [] str_sort) {
		//用于存储首字母的char[]数组
		char[] c = new char[str_arr.length];
		//定义一个下标
		int index = 0;
		
		for (int i = 0; i < str_arr.length; i++) {
			//赋值
			c [i] = str_arr [i].charAt(0);
		}
		
		
	}
	
}

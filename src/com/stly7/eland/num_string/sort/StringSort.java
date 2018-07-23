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
	
	//随机数对象方便调用
	Random random = new Random();
	//用于存字符数组,字符穿,字符串数组的
	String[] strs = new String[8];
	//8个长度是5的随机字符串
	char[] cs = new char[5];
	
	
	
	//获得一个字符串随机的
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
	
	//获得一个数组
	public void getStrArray() {
		for (int i = 0; i < strs.length; i++) {
			strs[i] = getChar();
		}
	}
	
	//排序
	public void sort() {
		//1.首先要有下标
		int[] index = new int[strs.length];
		
		//2.要有排序前的char[]
		char[] a_cs = new char[strs.length];
		//2.要有排序后的char[]
		char[] b_cs = new char[strs.length];
		
		//3.还要有排序后的string []
		String[] b_strs = new String[strs.length];
		
		//4.准备一个char 变量交换的阀值
		char min = (char)49;
		
		//填充首字母的char数组
		for (int i = 0; i < a_cs.length; i++) {
			//
			a_cs[i] = strs[i].charAt(0);
		}
		
		//选择排序
		
	}
	
	public static void main(String[] args) {
		StringSort strSort = new StringSort();
		strSort.getStrArray();
		strSort.sort();
	}
	
}

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
		
		//2.每个字符串都是5个字符组成
		for (int i = 0; i < str_arr.length; i++) {
			str_arr [i] = stringSort.random_padd(cs);
		}
		
		for (String str : str_arr) {
			System.out.println("cs ----->" + str);
		}
		
		System.out.println("============================");
		//手动排序
		//1.两个字符串数组 和 两个字符数组
		//2.还要一个下标数组
		//3.通过字符数组选择排序,从大到小进行排序
		//4.遍历第一个字母 的字符串数组进行与 str_arr[i].charAt(0),用char[](排序后的)外循环 嵌套 str_arr[i].charAt(0)的内循环 
		//5.最后通过相等的数相等的下标进行赋值 index [] = i;数组中
		//最后遍历数index数组,然后吧str_arr选择上套上
		stringSort.sort(str_arr);
		
	}
	
	
	
	//5位数随机填充数字字母字符
	public String random_padd(char [] cs) {
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
		
		String padd_str = new String(cs);
		return padd_str;
	}
	
	
	
	//排序按照首字母进行排序
	public void sort(String [] str_arr) {
		//用于存储首字母的char[]数组
		char[] c = new char[str_arr.length];
		//定义一个下标
		int [] index = new int [str_arr.length];
		
		
		//首字母转换
		for (int i = 0; i < str_arr.length; i++) {
			//赋值
			c [i] = str_arr [i].charAt(0);
		}
		
		//用于求最大值,起点是最小的开始
		char temp = 43;
		char [] c_temp = new char [c.length];
		for (int i = 0; i < c.length; i++) {
			//内循环
			for (int j = 0; j < c.length; j++) {
				if (c [j] > temp) {
					temp = c [j];
				}
			}
			//用一个新的数组装排序好的
			c_temp [i] = temp;
		}
		
		//在经营性遍历排序的后的比较返回arr的下标
		for (int i = 0; i < c_temp.length; i++) {
			for (int j = 0; j < i; j++) {
				if (c_temp[i] == str_arr[j].charAt(0)) {
					index [i] = j;
					i ++ ;
					break;
				}
			}
		}
		
		//此时下表是从到小进行排序,这里暂且忽略大小写的转换
		for (int i = 0; i < index.length; i++) {
			System.out.println(str_arr[index [i]] + "--------------->" + i);
		}
		
	}
	
	
}

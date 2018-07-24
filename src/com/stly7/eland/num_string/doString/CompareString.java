package com.stly7.eland.num_string.doString;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/*
 * 
 */
public class CompareString {
	Random random = new Random();
	char[] cs = new char[2];
	static String[] strs = new String[100];
	//用于去重
	List<String> list =  new ArrayList<>();
	
	public static void main(String[] args) {
		CompareString compare = new CompareString();
		
		//填充
		for (int i = 0; i < strs.length; i++) {
			strs[i] = compare.getChar();
			System.out.println("index" + i + " --> " + strs[i]);
		}
		//统计
		compare.count();
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
	
	//遍历统计
	public void count() {
		
		for (int i = 0; i < strs.length - 1; i++) {
			//遍历完100个数count就清零
			int count = 1;
			for (int j = i + 1; j < strs.length; j++) {
				if (strs[i].contains(strs[j])) {
					//调用
					getString(strs[j]);
					count ++;
					System.out.println(strs[i] + "出现" + count + "下标分别为" + i + " "+ j );
				}
			}
		}
		
		System.out.println("======================");
		System.out.println("重复有" + list.size() + "种");
		System.out.println("分别为:");
		System.out.println(list);
		
	}
	
	//String[] 无法直接赋值,通过stringbuffer方式进行获得一个数组
	//然后使用list去重去重
	public void getString(String s) {
		//用字符buffer进行凭借
		StringBuffer sb = new StringBuffer(s + " ");
		String[] split = sb.toString().split(" ");
		
		for (int i = 0; i < split.length; i++) {
			if (!list.contains(split[i])) {
				list.add(split[i]);
			}
		}
		
	}
}

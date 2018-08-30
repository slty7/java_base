package com.stly7.eland.collection.hashSet;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
/**
 * 用来做容器装遍历出来的相同的字符串
 * @author Administrator
 *
 */
public class MyHashSet {
	Random random = new Random();
	char[] cs = new char[2];
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		MyHashSet myHashSet = new MyHashSet();
		//String random = myHashSet.getChar();
		String[] strs = new String[100];
		for (int i = 0; i < strs.length; i++) {
			strs[i] = myHashSet.getChar();
		}
		for (String s1 : strs) {
            int repeat = 0;
            for (String s2 : strs) {
                if (s1.equalsIgnoreCase(s2)) {
                    repeat++;
                    if (2 == repeat) {
                        // 当repeat==2的时候，就找到了一个非己的重复字符串
                    	set.add(s2);
                        break;
                    }
                }
            }
        }
 
        System.out.printf("总共有 %d种重复的字符串%n", set.size());
        if (set.size() != 0) {
            System.out.println("分别是：");
            for (String s : set) {
                System.out.print(s + " ");
            }
        }
		
	}
	
	
	/**
	 * 或者给出一串字符串,在这个范围内随机返回一个字符然后 str += String.toArrayAt();
	 * @return
	 */
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

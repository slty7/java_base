package com.stly7.eland.num_string.math;
/**
 * 统计找出一千万以内，一共有多少质数
	质数概念: 只能被1和自己整除的数
 * @author Administrator
 *
 */
public class JudgeNum {
	public static void main(String[] args) {
		int count = 0;
		
		for (int num = 2; num < 101; num++) {
			if (num < 2) {
				break;
			}
			
			for (int i = 2; i <= num / 2; i++) {
				if ( num % i == 0) {
					count ++;
					break;
				}
				
			}
		}
		
		System.out.println(100 - count + 1);
		
	}
}

package com.stly7.eland.num_string.math;
/**
 * ͳ���ҳ�һǧ�����ڣ�һ���ж�������
	��������: ֻ�ܱ�1���Լ���������
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

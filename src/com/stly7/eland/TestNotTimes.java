package com.stly7.eland;

import java.util.Scanner;
/**
 * 3����5�ı�������
 * @author Administrator
 *
 */
public class TestNotTimes {
	public static void main(String[] args) {
		
		TestNotTimes testNotTimes = new TestNotTimes();
		//��ʾ����
		testNotTimes.show(100);
	}
	
	//��ʾ����
	private void show(int in) {
		//3����5�ı������Ե�
		for (int i = 0; i < in; i++) {
			if (i % 3 == 0 || i % 5 == 0 ) {
				continue;
			}
			System.out.println("����:" + i);
		}
	}
}

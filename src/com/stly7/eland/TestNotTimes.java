package com.stly7.eland;

import java.util.Scanner;
/**
 * 3或者5的倍数忽略
 * @author Administrator
 *
 */
public class TestNotTimes {
	public static void main(String[] args) {
		
		TestNotTimes testNotTimes = new TestNotTimes();
		//显示数据
		testNotTimes.show(100);
	}
	
	//显示数据
	private void show(int in) {
		//3或者5的倍数忽略掉
		for (int i = 0; i < in; i++) {
			if (i % 3 == 0 || i % 5 == 0 ) {
				continue;
			}
			System.out.println("数字:" + i);
		}
	}
}

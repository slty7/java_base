package com.stly7.eland;

import java.util.Random;

/**首先创建一个长度是5的数组
	然后给数组的每一位赋予随机整数
	通过for循环，遍历数组，找出最小的一个值出来
	
	0-100的 随机整数的获取办法有多种，下面是参考办法之一:
	 
	(int) (Math.random() * 100)
 * @author Administrator
 *
 */

public class TestCreateArray {
	int min = 100;
	public static void main(String[] args) {
		TestCreateArray testCreateArray = new TestCreateArray();
		testCreateArray.show();
	}
	
	private void show() {
		
		int [] arr = new int [5];
		
		for (int i = 0; i < arr.length; i++) {
			//arr [i] = (int) (Math.random() * 100);
			arr [i] = new Random().nextInt(100);
			System.out.println("=======" + arr [i]);
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr [i] < min) {
				min = arr [i];
			}
		}
		
		System.out.println("最小值是:" + min);
		
	}
	
}

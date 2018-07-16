package com.stly7.eland;

import java.util.Random;

/**
 * 用增强型for循环找出最大的那个数
 * @author Administrator
 *
 */
public class TestForeMaxValue {
	int[] arr = new int[5];
	int max = 0;
	
	public static void main(String[] args) {
		TestForeMaxValue testForeMaxValue = new TestForeMaxValue();
		testForeMaxValue.padd();
		testForeMaxValue.run();
	}
	
	
	//填充
	private void padd() {
		
		//随机填充0-100范围内
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(100);
		}
		
		for (int i : arr) {
			System.out.println("填充:" + " == " + i);
		}
	}
	
	//fore取最大值
	private void run() {
		for (int i : arr) {
			max = i > max ? i : max;
		}
		
		System.out.println(max);
	}
}

package com.stly7.eland;

import java.util.Random;

/**
 * ����ǿ��forѭ���ҳ������Ǹ���
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
	
	
	//���
	private void padd() {
		
		//������0-100��Χ��
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(100);
		}
		
		for (int i : arr) {
			System.out.println("���:" + " == " + i);
		}
	}
	
	//foreȡ���ֵ
	private void run() {
		for (int i : arr) {
			max = i > max ? i : max;
		}
		
		System.out.println(max);
	}
}

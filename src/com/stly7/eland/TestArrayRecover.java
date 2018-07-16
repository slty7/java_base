package com.stly7.eland;

import java.util.Random;

/**
 * 首先创建一个长度是5的数组,并填充随机数。 (向数组填充随机数的办法，参考这里)
 * 使用for循环或者while循环，对这个数组实现反转效果
 * @author Administrator
 *
 */
public class TestArrayRecover {
	int[] arr = new int[5];
	//创建一个中间变量
	int sawp;
	
	public static void main(String[] args) {
		
		//方法1
		TestArrayRecover testArrayRecover = new TestArrayRecover();
		testArrayRecover.padd();
		System.out.println("=======================");
		testArrayRecover.recover();
		
		
		//方法二
		System.out.println("");
		System.out.println("");
		System.out.println("第二种解法:==========================");
		testArrayRecover.run();
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
	
	//反转
	private void recover() {
		//中间的那个数
		int mind;
		for (int i = 0; i < arr.length; i++) {
			mind = i / 2;
			if ( i == mind) {
				//此处不能用break,
				//用break结束循环数组里面的值是不会变化 的
				continue;
			}else {
				sawp = arr[i];
				arr[i] = arr[arr.length - 1 - i];
				arr[arr.length - 1 - i] = sawp;
			}
		}
		
		for (int i : arr) {
			System.out.println("反转:" + " == " + i);
		}
	}
	
	
	//第二种解法是顺序遍历,逆序遍历直接赋值
	private void run() {
		int[] arr = new int[5];
		int[] temp = new int[5];
		//随机填充0-100范围内
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(100);
		}
		
		for (int i : arr) {
			System.out.println("填充:" + i);
		}
		
		System.out.println("===========================");
		for (int i = 0; i < arr.length; i++) {
			temp[temp.length - 1 -i] = arr[i];
		}
		
		arr = temp;
		for (int i : temp) {
			System.out.println("反转:" + i);
		}
	}
}

package com.stly7.eland;

import java.util.Random;

/**
 * 
 * @author Administrator
 *	首先创建一个长度是5的数组,并填充随机数。 (向数组填充随机数的办法，参考这里)
 *	首先用选择法正排序，然后再对其使用冒泡法倒排序
 *	 所谓的正排序就是从小到大排序，倒排序就是从大到小排序
 */
public class TestBubbleSort {
	int[] arr = new int[5];
	//创建一个中间变量
	int sawp;
	
	public static void main(String[] args) {
		TestBubbleSort testBubbleSort = new TestBubbleSort();
		testBubbleSort.padd();
		System.out.println("");
		System.out.println("====================");
		testBubbleSort.changeSort();
		System.out.println("");
		System.out.println("====================");
		testBubbleSort.bubbleSort();
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
	
	//选择排序
	private void changeSort() {
		
		//选择排序的是第一位跟所有比较,第二位跟所有比较
		for (int i = 0; i < arr.length - 1; i++) {
			
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					sawp = arr[i];
					arr[i] = arr[j];
					arr[j] = sawp;
				}
			}
		}
		
		for (int i : arr) {
			System.out.println("选择排序(最大在前面):" + i);
		}
	}
	
	//冒泡排序
	private void bubbleSort() {
		int temp;
		//冒泡排序是相邻两个比较
		for (int i = 0; i < arr.length; i++) {
			//这样就是两个相邻的数进行 这里的arr.length - i - 1是提升效率的作用
			for (int j = 0; j < arr.length - i -1; j++) {
				if(arr[i]>arr[i+1]){  
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
			}
		}
		
		for (int i : arr) {
			System.out.println("冒泡排序(最大在前面):" + i);
		}
	}
	
}

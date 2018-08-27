package com.stly7.eland.collection.tree_node;

import java.util.List;
import java.util.Random;

public class Sort {
	
	public static void main(String[] args) {
		
		int[] arr = new int[40000];
		Node tree = new Node();
		Select_BubbleSort select_sort = new Select_BubbleSort();
		Select_BubbleSort bubble_sort = new Select_BubbleSort();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(40000);
		}
		
		int[] arr1 = arr.clone();
		int[] arr2 = arr.clone();
		int[] arr3 = arr.clone();
		
		//使用2叉树
		long start1 = System.currentTimeMillis();
		for (int i = 0; i < arr1.length; i++) {
			tree.add(arr1[i]);
		}
		tree.values();
		long end1 = System.currentTimeMillis();
		int value1 = (int) (end1 - start1);
		//System.out.println(value1);
		
		//使用选择
		long start2 = System.currentTimeMillis();
		select_sort.selectSort(arr2);
		long end2 = System.currentTimeMillis();
		int value2 = (int) (end2 - start2);
		
		//使用冒泡
		long start3 = System.currentTimeMillis();
		bubble_sort.bubbleSort(arr3);
		long end3 = System.currentTimeMillis();
		int value3 = (int) (end3 - start3);
		
		
		System.out.println("2叉树" + value1 + "--选择" + value2 + "--冒泡" + value3 );
	}
	
}

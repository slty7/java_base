package com.stly7.eland.collection.tree_node;
/**
 * 选择排序:选择排序使用用外循环的每每一个数去跟自己这个包含比
 * 选择排序主要是用下标交换的形式进行的
 * @author Administrator
 *
 */
public class Select_BubbleSort {
	
	//选择排序,用前一个跟下一个的剩下所有比较
	public void selectSort(int[] arr) {
		// TODO Auto-generated method stub
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			//第一步： 把第一位和其他所有位进行比较
	        //如果发现其他位置的数据比第一位小，就进行交换
			//把内容打印出来
	        //可以发现，最小的一个数，到了最前面
			//第二步： 把第二位的和剩下的所有位进行比较
			//可以发现，倒数第二小的数，到了第二个位置
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	//两个相怜的数做比较
	public void bubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			//把内容打印出来
	        //可以发现，最大的到了最后面
			//第二步： 再来一次，只不过不用比较最后一位
			//把内容打印出来
	        //可以发现，倒数第二大的到了倒数第二个位置
			for (int j = i; j < arr.length - 1; j++) {
				if(arr[j]>arr[j+1]){  
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
			}
		}
	}
	
}

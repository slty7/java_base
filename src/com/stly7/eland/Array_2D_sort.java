package com.stly7.eland;

import java.util.Arrays;
import java.util.Random;
/**
 * 首先定义一个5X8的二维数组，然后使用随机数填充满。
 * 借助Arrays的方法对二维数组进行排序。
 * 参考思路：
 * 先把二维数组使用System.arraycopy进行数组复制到一个一维数组
 * 然后使用sort进行排序
 * 最后再复制回到二维数组。
 * @author Administrator
 *
 */
public class Array_2D_sort {
	static int[] [] arr = new int[5] [8];
	static int[] arr1 = new int[5*8];
	
	public static void main(String[] args) {
		Array_2D_sort array_2d_sort = new Array_2D_sort();
		array_2d_sort.padd(arr);
		array_2d_sort.twoD_Arr2_oneD_Arr();
		System.out.println("");
		array_2d_sort.oneD_Arr2_twoD_Arr();
	}
	
	//填充
	private void padd(int[] [] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i] [j] = new Random().nextInt(100);
				System.out.println("转换前" + i + "--" + j + "=>"+ arr[i][j]);
				
				
			}
		}
	}
	
	private void twoD_Arr2_oneD_Arr() {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr1[count] = arr[i] [j];
				count ++;
			}
		}
	}
	
	private void oneD_Arr2_twoD_Arr() {
		int count = 0;
		Arrays.sort(arr1);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i] [j] = arr1[count];
				count ++;
				System.out.println("转换后" + i + "--" + j + "=>"+ arr[i][j]);
			}
		}
	}
	
}

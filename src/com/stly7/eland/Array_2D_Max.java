package com.stly7.eland;

import java.util.Random;

/**
 * 定义一个5X5的二维数组。 然后使用随机数填充该二维数组。
 * 找出这个二维数组里，最大的那个值，并打印出其二维坐标
 * 0-100的 随机整数的获取办法有多种，下面是参考办法之一:
 * (int) (Math.random() * 100)
 * Math.random() 会得到一个0-1之间的随机浮点数，然后乘以100，并强转为整型即可。
 * @author Administrator
 *
 */
public class Array_2D_Max {
	
	static int[] [] arr = new int[5] [5];
	static int max = 0;
	
	public static void main(String[] args) {
		Array_2D_Max array_2d_Max = new Array_2D_Max();
		array_2d_Max.padd(arr);
		array_2d_Max.arr_max(max);
	}
	
	//填充
	private void padd(int[] [] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i] [j] = new Random().nextInt(100);
				System.out.println(i + "--" + j + "=>"+ arr[i][j]);
			}
		}
	}
	
	//取最大值
	private void arr_max(int max) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}else {
					continue;
				}
			}
		}
		System.out.println("======================");
		System.out.println("最大值:" + max);
	}
	
}

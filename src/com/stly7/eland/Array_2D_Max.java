package com.stly7.eland;

import java.util.Random;

/**
 * ����һ��5X5�Ķ�ά���顣 Ȼ��ʹ����������ö�ά���顣
 * �ҳ������ά����������Ǹ�ֵ������ӡ�����ά����
 * 0-100�� ��������Ļ�ȡ�취�ж��֣������ǲο��취֮һ:
 * (int) (Math.random() * 100)
 * Math.random() ��õ�һ��0-1֮��������������Ȼ�����100����ǿתΪ���ͼ��ɡ�
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
	
	//���
	private void padd(int[] [] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i] [j] = new Random().nextInt(100);
				System.out.println(i + "--" + j + "=>"+ arr[i][j]);
			}
		}
	}
	
	//ȡ���ֵ
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
		System.out.println("���ֵ:" + max);
	}
	
}

package com.stly7.eland;

import java.util.Arrays;
import java.util.Random;
/**
 * ���ȶ���һ��5X8�Ķ�ά���飬Ȼ��ʹ��������������
 * ����Arrays�ķ����Զ�ά�����������
 * �ο�˼·��
 * �ȰѶ�ά����ʹ��System.arraycopy�������鸴�Ƶ�һ��һά����
 * Ȼ��ʹ��sort��������
 * ����ٸ��ƻص���ά���顣
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
	
	//���
	private void padd(int[] [] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i] [j] = new Random().nextInt(100);
				System.out.println("ת��ǰ" + i + "--" + j + "=>"+ arr[i][j]);
				
				
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
				System.out.println("ת����" + i + "--" + j + "=>"+ arr[i][j]);
			}
		}
	}
	
}

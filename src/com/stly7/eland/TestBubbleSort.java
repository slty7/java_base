package com.stly7.eland;

import java.util.Random;

/**
 * 
 * @author Administrator
 *	���ȴ���һ��������5������,������������ (���������������İ취���ο�����)
 *	������ѡ��������Ȼ���ٶ���ʹ��ð�ݷ�������
 *	 ��ν����������Ǵ�С�������򣬵�������ǴӴ�С����
 */
public class TestBubbleSort {
	int[] arr = new int[5];
	//����һ���м����
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
	
	//ѡ������
	private void changeSort() {
		
		//ѡ��������ǵ�һλ�����бȽ�,�ڶ�λ�����бȽ�
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
			System.out.println("ѡ������(�����ǰ��):" + i);
		}
	}
	
	//ð������
	private void bubbleSort() {
		int temp;
		//ð�����������������Ƚ�
		for (int i = 0; i < arr.length; i++) {
			//���������������ڵ������� �����arr.length - i - 1������Ч�ʵ�����
			for (int j = 0; j < arr.length - i -1; j++) {
				if(arr[i]>arr[i+1]){  
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
			}
		}
		
		for (int i : arr) {
			System.out.println("ð������(�����ǰ��):" + i);
		}
	}
	
}

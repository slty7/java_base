package com.stly7.eland;

import java.util.Random;

/**
 * ���ȴ���һ��������5������,������������ (���������������İ취���ο�����)
 * ʹ��forѭ������whileѭ�������������ʵ�ַ�תЧ��
 * @author Administrator
 *
 */
public class TestArrayRecover {
	int[] arr = new int[5];
	//����һ���м����
	int sawp;
	
	public static void main(String[] args) {
		
		//����1
		TestArrayRecover testArrayRecover = new TestArrayRecover();
		testArrayRecover.padd();
		System.out.println("=======================");
		testArrayRecover.recover();
		
		
		//������
		System.out.println("");
		System.out.println("");
		System.out.println("�ڶ��ֽⷨ:==========================");
		testArrayRecover.run();
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
	
	//��ת
	private void recover() {
		//�м���Ǹ���
		int mind;
		for (int i = 0; i < arr.length; i++) {
			mind = i / 2;
			if ( i == mind) {
				//�˴�������break,
				//��break����ѭ�����������ֵ�ǲ���仯 ��
				continue;
			}else {
				sawp = arr[i];
				arr[i] = arr[arr.length - 1 - i];
				arr[arr.length - 1 - i] = sawp;
			}
		}
		
		for (int i : arr) {
			System.out.println("��ת:" + " == " + i);
		}
	}
	
	
	//�ڶ��ֽⷨ��˳�����,�������ֱ�Ӹ�ֵ
	private void run() {
		int[] arr = new int[5];
		int[] temp = new int[5];
		//������0-100��Χ��
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(100);
		}
		
		for (int i : arr) {
			System.out.println("���:" + i);
		}
		
		System.out.println("===========================");
		for (int i = 0; i < arr.length; i++) {
			temp[temp.length - 1 -i] = arr[i];
		}
		
		arr = temp;
		for (int i : temp) {
			System.out.println("��ת:" + i);
		}
	}
}

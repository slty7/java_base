package com.stly7.eland;

import java.util.Scanner;

public class TestFor {
	/*
	 * forѭ������
	 */
	public static void main(String[] args) {
		int in = 0;
		TestFor test = new TestFor();
		System.out.println("������һ������:");
		//�������
		try {
			in = test.getScanner();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("���ݲ��ڷ�Χ��...");
		}
		//У������
		boolean b = test.checkData(in);
		//��ʾ����
		test.show(b, in);
	}
	
	//����
	public int getScanner() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
	
	//У������
	public boolean checkData(int in) {
		if(in == Math.floor(in) && in >= 0) {
			return true;
		}else{
			System.out.println("���ݲ��ڷ�Χ��...");
			return false;
		}
	}
	
	//��ʾ����
	public void show(boolean b, int in){
		if(b) {
			for (int i = 0; i < in; i++) {
				//����Ҫʹ��ƽ����ʽ
				int pow = (int)Math.pow(2, i);
				System.out.println("��"+ (i+1) + "��Ҫ��" + pow + "ԪǮ");
			}
		}else{
			System.out.println("���ݲ��ڷ�Χ��...");
		}
	}
}

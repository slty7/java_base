package com.stly7.eland;

import java.util.Scanner;

public class TestWhile {
	/**
	 * n �Ľ׳�
	 * @param args
	 */
	public static void main(String[] args) {
		int i;
		TestWhile test = new TestWhile();
		//��ȡ����
		System.out.println("��������:");
		try {
			//û�������쳣
			i = test.getScanner();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�����쳣...");
			return;
		}
		
		//У������
		if (test.checkData(i)) {
			//��ȷ��ִ��
			test.show(i);
		}else{
			//����ȷ�ͷ����˳�
			return;
		}
	}

	//�������
	public int getScanner() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
	
	// У�������Ƿ�Ƿ�
	public boolean checkData(int i) {
		if (i == Math.floor(i) &&  i >= 0) {
			return true;
		}else {
			System.out.println("�����쳣...");
			return false;
		}
	}
	
	// ��ʾ����
	public void show(int i){
		//һ��Ҫn��1
		int n = 1;
		while(i != 1) {
			n *= i;
			i--;
		}
		System.out.println("����Ϊ:" + n);
	}
}

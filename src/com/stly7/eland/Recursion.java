package com.stly7.eland;

import java.util.Scanner;

public class Recursion {
	/*
	 * n �Ľ׳�
	 */
	public static void main(String[] args) {
		int i;
		Recursion rec = new Recursion();
		//��ȡ����
		System.out.println("��������:");
		try {
			//û�������쳣
			i = rec.getScanner();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�����쳣...");
			return;
		}
		
		//У������
		if (rec.checkData(i)) {
			//��ȷ��ִ��
			System.out.println(rec.recrusion(i));
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
		
		//�ݹ�
		public int recrusion(int i) {
			int result = 1;
			if(i == 1) {
				return 1;
			}else{
				result *= i;
			}
			return i * recrusion(i - 1);
		}
}

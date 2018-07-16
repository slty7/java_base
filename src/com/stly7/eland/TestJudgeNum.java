package com.stly7.eland;

import java.util.Scanner;

/**
 * ����һ�����Ƿ�������
 * @author Administrator
 *
 */
public class TestJudgeNum {
	
	public static void main(String[] args) {
		TestJudgeNum test = new TestJudgeNum();
		int in = 0;
		//�Ƿ�������
		boolean isJudeNum = false;
		System.out.println("������һ����ȷ������:");
		
		//�����������
		try {
			in = test.getScanner();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�����쳣...");
		}
		
		//У������
		boolean b = test.checkData(in);
		
		//�ж���������Ƿ�����ȷ�Ĳ�������ִ���ж��Ƿ�������
		if (b) {
			//�Ƿ�������
			isJudeNum = test.isJudegeNum(in);
		}else{
			System.out.println("�����쳣...");
		}
		
		//��ʾ
		test.show(isJudeNum, in);
		
	}
	
	//����
	private int getScanner() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
	
	//У������
	private boolean checkData(int in) {
		if(in == Math.floor(in) && in >= 0) {
			return true;
		}else{
			System.out.println("�����쳣...");
			return false;
		}
	}
	
	//�ж��Ƿ�������
	private boolean isJudegeNum(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if ( num % i == 0) {
				return true;
			}
		}
		return false;
	}
	
	//��ʾ
	private void show(boolean b, int num) {
		if (b) {
			System.out.println(num + "������������...");
		}else{
			System.out.println(num + "����������...");
		}
	}
}

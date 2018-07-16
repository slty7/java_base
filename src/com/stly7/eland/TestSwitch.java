package com.stly7.eland;

import java.util.Scanner;

public class TestSwitch {
	
	public static void main(String[] args) {
		int month;
		TestSwitch test = new TestSwitch();
		
		//��ȡ����
		System.out.println("����һ���·�:");
		month = test.getScanner();
		
		//У��������Ч��
		if (test.checkData(month)) {
			//��ʾ����
			test.show(month);
		}else{
			System.out.println("��������˰�....");
			return;
		}
	}
	
	
	/*
	 * �������
	 */
	public int getScanner() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
	
	/*
	 * У�������Ƿ�Ƿ�
	 */
	public boolean checkData(int month){
		if(month <= 12 && month >= 1) {
			//�������Χ�ھ�ʹ��true
			return true;
		}else{
			return false;
		}
	}
	
	/*
	 * ��ʾ����
	 */
	public void show(int month) {
		switch (month) {
		case 3:
		case 4:
		case 5:
		System.out.println(month + "��Ϊ����");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(month + "��Ϊ����");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(month + "��Ϊ����");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println(month + "��Ϊ����");
			break;

		default:
			System.out.println("��������...");
			break;
		}
	}
}

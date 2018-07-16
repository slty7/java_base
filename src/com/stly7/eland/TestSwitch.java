package com.stly7.eland;

import java.util.Scanner;

public class TestSwitch {
	
	public static void main(String[] args) {
		int month;
		TestSwitch test = new TestSwitch();
		
		//获取输入
		System.out.println("输入一个月份:");
		month = test.getScanner();
		
		//校验数据有效性
		if (test.checkData(month)) {
			//显示数据
			test.show(month);
		}else{
			System.out.println("你输入错了吧....");
			return;
		}
	}
	
	
	/*
	 * 获得输入
	 */
	public int getScanner() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
	
	/*
	 * 校验数据是否非法
	 */
	public boolean checkData(int month){
		if(month <= 12 && month >= 1) {
			//在这个范围内就使用true
			return true;
		}else{
			return false;
		}
	}
	
	/*
	 * 显示数据
	 */
	public void show(int month) {
		switch (month) {
		case 3:
		case 4:
		case 5:
		System.out.println(month + "月为春天");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(month + "月为夏天");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(month + "月为秋天");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println(month + "月为冬天");
			break;

		default:
			System.out.println("输入有误...");
			break;
		}
	}
}

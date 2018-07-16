package com.stly7.eland;

import java.util.Scanner;

public class TestFor {
	/*
	 * for循环测试
	 */
	public static void main(String[] args) {
		int in = 0;
		TestFor test = new TestFor();
		System.out.println("请输入一个整数:");
		//获得数据
		try {
			in = test.getScanner();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("数据不在范围内...");
		}
		//校验数据
		boolean b = test.checkData(in);
		//显示数据
		test.show(b, in);
	}
	
	//输入
	public int getScanner() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
	
	//校验数据
	public boolean checkData(int in) {
		if(in == Math.floor(in) && in >= 0) {
			return true;
		}else{
			System.out.println("数据不在范围内...");
			return false;
		}
	}
	
	//显示数据
	public void show(boolean b, int in){
		if(b) {
			for (int i = 0; i < in; i++) {
				//这里要使用平方公式
				int pow = (int)Math.pow(2, i);
				System.out.println("第"+ (i+1) + "天要了" + pow + "元钱");
			}
		}else{
			System.out.println("数据不在范围内...");
		}
	}
}

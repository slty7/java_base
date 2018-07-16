package com.stly7.eland;

import java.util.Scanner;

public class TestWhile {
	/**
	 * n 的阶乘
	 * @param args
	 */
	public static void main(String[] args) {
		int i;
		TestWhile test = new TestWhile();
		//获取输入
		System.out.println("输入整数:");
		try {
			//没有数据异常
			i = test.getScanner();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("数据异常...");
			return;
		}
		
		//校验数据
		if (test.checkData(i)) {
			//正确就执行
			test.show(i);
		}else{
			//不正确就返回退出
			return;
		}
	}

	//获得输入
	public int getScanner() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
	
	// 校验数据是否非法
	public boolean checkData(int i) {
		if (i == Math.floor(i) &&  i >= 0) {
			return true;
		}else {
			System.out.println("数据异常...");
			return false;
		}
	}
	
	// 显示数据
	public void show(int i){
		//一定要n是1
		int n = 1;
		while(i != 1) {
			n *= i;
			i--;
		}
		System.out.println("此数为:" + n);
	}
}

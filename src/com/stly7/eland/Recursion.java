package com.stly7.eland;

import java.util.Scanner;

public class Recursion {
	/*
	 * n 的阶乘
	 */
	public static void main(String[] args) {
		int i;
		Recursion rec = new Recursion();
		//获取输入
		System.out.println("输入整数:");
		try {
			//没有数据异常
			i = rec.getScanner();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("数据异常...");
			return;
		}
		
		//校验数据
		if (rec.checkData(i)) {
			//正确就执行
			System.out.println(rec.recrusion(i));
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
		
		//递归
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

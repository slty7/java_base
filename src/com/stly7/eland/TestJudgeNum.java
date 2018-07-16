package com.stly7.eland;

import java.util.Scanner;

/**
 * 测试一个数是否是质数
 * @author Administrator
 *
 */
public class TestJudgeNum {
	
	public static void main(String[] args) {
		TestJudgeNum test = new TestJudgeNum();
		int in = 0;
		//是否是质数
		boolean isJudeNum = false;
		System.out.println("请输入一个正确的数据:");
		
		//获得输入数据
		try {
			in = test.getScanner();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("数据异常...");
		}
		
		//校验数据
		boolean b = test.checkData(in);
		
		//判断这个数据是否是正确的才能往下执行判断是否是质数
		if (b) {
			//是否是质数
			isJudeNum = test.isJudegeNum(in);
		}else{
			System.out.println("数据异常...");
		}
		
		//显示
		test.show(isJudeNum, in);
		
	}
	
	//输入
	private int getScanner() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
	
	//校验数据
	private boolean checkData(int in) {
		if(in == Math.floor(in) && in >= 0) {
			return true;
		}else{
			System.out.println("数据异常...");
			return false;
		}
	}
	
	//判断是否是质数
	private boolean isJudegeNum(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if ( num % i == 0) {
				return true;
			}
		}
		return false;
	}
	
	//显示
	private void show(boolean b, int num) {
		if (b) {
			System.out.println(num + "此数不是质数...");
		}else{
			System.out.println(num + "此数是质数...");
		}
	}
}

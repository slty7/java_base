package com.stly7.eland;

/**
 * 	复利公式：
	F = p* ( (1+r)^n );
	F 最终收入
	p 本金
	r 年利率
	n 存了多少年
	 解读：
	本金是10000
	年利率是5%
	存了两年
	复利收入 10000*( (1+0.05)^2 ) = 11025
 *
 */
public class TestBreak {
	
	public static void main(String[] args) {
		
		float F = 1000000;
		float p = 12000;
		float r = 0.2F;
		int n = 1;
		TestBreak testBreak = new TestBreak();
		testBreak.show(F, p, r, n);
		
		//递归
		System.out.println(testBreak.recursion(F, p, r, n));
		
	}
	//显示
	private void show(float F, float p, float r, int n) {
		float temp = 0;
		while(true) {
			temp = (float) (p * Math.pow(1 + r, n));
			if (temp >= F) {
				System.out.println("一共需要" + n + "年");
				break;
			}
			n ++;
		}
	}
	
	//递归方法
	private int recursion(float F, float p, float r, int n) {
		
		if (F <= p * Math.pow(1 + r, n)) {
			return n;
		}else {
			n ++;
			return recursion(F, p, r, n);
		}
		
	}
}

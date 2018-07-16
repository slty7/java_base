package com.stly7.eland;

public class TestGolden_section {
	float i;
	float j;
	
	int m;
	int n;
	
	//两个数相减的绝对值
	float val;
	
	//两个数相减绝初始
	float min = 1;
	
	//黄金分割点
	float num;
	
	public static void main(String[] args) {
		TestGolden_section testGolden_section = new TestGolden_section();
		testGolden_section.show();
	}
	
	private void show() {
		
		for (i = 1; i <= 20; i++) {
			for (j = 1; j <= 20;  j++) {
				if (i % 2 == 0 && j % 2 == 0) {
					continue;
				}else {
					val = 0.618 - i / j > 0 ? 0.618f - i / j : i / j - 0.618f;
					
					if (val < min) {
						min = val;
						num = i / j;
						m = (int) i;
						n = (int) j;
					}else {
						continue;
					}
					
				}
			}
		}
		
		System.out.println("最接近黄金分割点的值为:" + num  + "======"+ m + " / " + n);
	}
}

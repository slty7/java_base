package com.stly7.eland;

public class TestGolden_section {
	float i;
	float j;
	
	int m;
	int n;
	
	//����������ľ���ֵ
	float val;
	
	//�������������ʼ
	float min = 1;
	
	//�ƽ�ָ��
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
		
		System.out.println("��ӽ��ƽ�ָ���ֵΪ:" + num  + "======"+ m + " / " + n);
	}
}

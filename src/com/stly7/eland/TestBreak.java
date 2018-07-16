package com.stly7.eland;

/**
 * 	������ʽ��
	F = p* ( (1+r)^n );
	F ��������
	p ����
	r ������
	n ���˶�����
	 �����
	������10000
	��������5%
	��������
	�������� 10000*( (1+0.05)^2 ) = 11025
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
		
		//�ݹ�
		System.out.println(testBreak.recursion(F, p, r, n));
		
	}
	//��ʾ
	private void show(float F, float p, float r, int n) {
		float temp = 0;
		while(true) {
			temp = (float) (p * Math.pow(1 + r, n));
			if (temp >= F) {
				System.out.println("һ����Ҫ" + n + "��");
				break;
			}
			n ++;
		}
	}
	
	//�ݹ鷽��
	private int recursion(float F, float p, float r, int n) {
		
		if (F <= p * Math.pow(1 + r, n)) {
			return n;
		}else {
			n ++;
			return recursion(F, p, r, n);
		}
		
	}
}

package com.stly7.eland;

import java.util.Random;

/**���ȴ���һ��������5������
	Ȼ��������ÿһλ�����������
	ͨ��forѭ�����������飬�ҳ���С��һ��ֵ����
	
	0-100�� ��������Ļ�ȡ�취�ж��֣������ǲο��취֮һ:
	 
	(int) (Math.random() * 100)
 * @author Administrator
 *
 */

public class TestCreateArray {
	int min = 100;
	public static void main(String[] args) {
		TestCreateArray testCreateArray = new TestCreateArray();
		testCreateArray.show();
	}
	
	private void show() {
		
		int [] arr = new int [5];
		
		for (int i = 0; i < arr.length; i++) {
			//arr [i] = (int) (Math.random() * 100);
			arr [i] = new Random().nextInt(100);
			System.out.println("=======" + arr [i]);
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr [i] < min) {
				min = arr [i];
			}
		}
		
		System.out.println("��Сֵ��:" + min);
		
	}
	
}

package com.stly7.eland.num_string.sort;

import java.util.Random;

/**
 * 
 * ����һ��������8���ַ�������
	ʹ��8��������5������ַ�����ʼ���������
	���������������򣬰���ÿ���ַ���������ĸ����(���Ӵ�Сд)

	ע1�� ����ʹ��Arrays.sort() Ҫ�Լ�д
	ע2�� ���Ӵ�Сд���� Axxxx �� axxxxx û���Ⱥ�˳��
 * @author Administrator
 *
 */
public class StringSort {
	
	//��������󷽱����
	Random random = new Random();
	//���ڴ��ַ�����,�ַ���,�ַ��������
	String[] strs = new String[8];
	//8��������5������ַ���
	char[] cs = new char[5];
	
	
	
	//���һ���ַ��������
	public String getChar() {
		for (int i = 0; i < cs.length; i++) {
			//�����������һ����0��ʼ��������(2),��������3��������Χ�ڵ�����л�
			int y = random.nextInt(3) + 0;
            if (y == 0) {
                cs[i] = (char)(random.nextInt(9)+49);
            }else if (y==1) {
                cs[i] = (char)(random.nextInt(25)+66);
            }else {
                cs[i] = (char)(random.nextInt(25)+98);
            }
		}
		
		return new String(cs);
	}
	
	//���һ������
	public void getStrArray() {
		for (int i = 0; i < strs.length; i++) {
			strs[i] = getChar();
		}
	}
	
	//����
	public void sort() {
		//1.����Ҫ���±�
		int[] index = new int[strs.length];
		
		//2.Ҫ������ǰ��char[]
		char[] a_cs = new char[strs.length];
		//2.Ҫ��������char[]
		char[] b_cs = new char[strs.length];
		
		//3.��Ҫ��������string []
		String[] b_strs = new String[strs.length];
		
		//4.׼��һ��char ���������ķ�ֵ
		char min = (char)49;
		
		//�������ĸ��char����
		for (int i = 0; i < a_cs.length; i++) {
			//
			a_cs[i] = strs[i].charAt(0);
		}
		
		//ѡ������
		
	}
	
	public static void main(String[] args) {
		StringSort strSort = new StringSort();
		strSort.getStrArray();
		strSort.sort();
	}
	
}

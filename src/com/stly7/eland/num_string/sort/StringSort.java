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
	
	public static void main(String[] args) {
		//1.һ��������8���ַ�������
		String [] str_arr = new String [8];
		
		//������5���ַ��ķ���
		char [] cs= new char[5];
		StringSort stringSort = new StringSort();
		stringSort.random_padd(cs);
		
		//2.ÿ���ַ�������5���ַ����
		for (int i = 0; i < str_arr.length; i++) {
			str_arr [i] = new String(cs);
		}
		
		//�ٴ���һ����������װ������
		String [] str_sort = new String [str_arr.length];
		
	}
	
	//5λ��������������ĸ�ַ�
	public void random_padd(char [] cs) {
		Random random = new Random();
		cs = new char[5];
		//���ڼ�ס�±�
		int index = 0;
		//�趨һ����ѭ���ĳ�������
		boolean flag = true;
		
		//��ѭ��
		while(flag) {
			//����ѭ����һ���ҵ��˾�����ѭ��,���Ҽ�ס�±�
			for (int i = index; i < cs.length; i++) {
				char num = (char) (random.nextInt(73) + 48);
				
				//�ж�ͨ������ֶξ��ܹ�֪���ַ� a-z A-Z 0-9 ����Ӧ�����ֵ�������
				if (num >= '0' && num <= '9' ||  num >= 'A' && num <= 'Z' || num >= 'a' && num <= 'z') {
					cs[i] = num;
					
					//�鿴���ȥ������
					System.out.println("---->" + cs[i] + "  " + i);
					//����һ����++,��һ�ο�ʼ���±�һ���Ǳ��ν��������һ���±�
					index = i ++;
					break;
				}
			}
			
			//����
			if (index == 4) {
				flag = false;
			}
		}
	}
	
	//����������ĸ��������
	public void sort(String [] str_arr, String [] str_sort) {
		//���ڴ洢����ĸ��char[]����
		char[] c = new char[str_arr.length];
		//����һ���±�
		int index = 0;
		
		for (int i = 0; i < str_arr.length; i++) {
			//��ֵ
			c [i] = str_arr [i].charAt(0);
		}
		
		
	}
	
}

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
		
		//2.ÿ���ַ�������5���ַ����
		for (int i = 0; i < str_arr.length; i++) {
			str_arr [i] = stringSort.random_padd(cs);
		}
		
		for (String str : str_arr) {
			System.out.println("cs ----->" + str);
		}
		
		System.out.println("============================");
		//�ֶ�����
		//1.�����ַ������� �� �����ַ�����
		//2.��Ҫһ���±�����
		//3.ͨ���ַ�����ѡ������,�Ӵ�С��������
		//4.������һ����ĸ ���ַ������������ str_arr[i].charAt(0),��char[](������)��ѭ�� Ƕ�� str_arr[i].charAt(0)����ѭ�� 
		//5.���ͨ����ȵ�����ȵ��±���и�ֵ index [] = i;������
		//��������index����,Ȼ���str_arrѡ��������
		stringSort.sort(str_arr);
		
	}
	
	
	
	//5λ��������������ĸ�ַ�
	public String random_padd(char [] cs) {
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
		
		String padd_str = new String(cs);
		return padd_str;
	}
	
	
	
	//����������ĸ��������
	public void sort(String [] str_arr) {
		//���ڴ洢����ĸ��char[]����
		char[] c = new char[str_arr.length];
		//����һ���±�
		int [] index = new int [str_arr.length];
		
		
		//����ĸת��
		for (int i = 0; i < str_arr.length; i++) {
			//��ֵ
			c [i] = str_arr [i].charAt(0);
		}
		
		//���������ֵ,�������С�Ŀ�ʼ
		char temp = 43;
		char [] c_temp = new char [c.length];
		for (int i = 0; i < c.length; i++) {
			//��ѭ��
			for (int j = 0; j < c.length; j++) {
				if (c [j] > temp) {
					temp = c [j];
				}
			}
			//��һ���µ�����װ����õ�
			c_temp [i] = temp;
		}
		
		//�ھ�Ӫ�Ա�������ĺ�ıȽϷ���arr���±�
		for (int i = 0; i < c_temp.length; i++) {
			for (int j = 0; j < i; j++) {
				if (c_temp[i] == str_arr[j].charAt(0)) {
					index [i] = j;
					i ++ ;
					break;
				}
			}
		}
		
		//��ʱ�±��Ǵӵ�С��������,�������Һ��Դ�Сд��ת��
		for (int i = 0; i < index.length; i++) {
			System.out.println(str_arr[index [i]] + "--------------->" + i);
		}
		
	}
	
	
}

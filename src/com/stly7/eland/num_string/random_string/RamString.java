package com.stly7.eland.num_string.random_string;

import java.util.Random;

/**
 * ����һ��������5������ַ���������ַ��п��������֣���д��ĸ����Сд��ĸ
	������ʾ: ���ֺ��ַ�֮�����ͨ������ת��
 	
	char c = 'A';
	short s = (short) c;
	ͨ������ֶξ��ܹ�֪���ַ� a-z A-Z 0-9 ����Ӧ�����ֵ�������
 * @author Administrator
 *
 */
public class RamString {
	
	public static void main(String[] args) {
		Random random = new Random();
		char[] cs = new char[5];
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
		
		//��ӡ
		for (int i = 0; i < cs.length; i++) {
			System.out.print(cs[i]);
		}
	}
}

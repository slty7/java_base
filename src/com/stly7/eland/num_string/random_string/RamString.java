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
	Random random = new Random();
	char[] cs = new char[5];
	
	//���һ���ַ���
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
	
	public static void main(String[] args) {
		RamString ramString = new RamString();
		//�������������������
		String string = ramString.getChar();
		System.out.println(string);
	}
	
}

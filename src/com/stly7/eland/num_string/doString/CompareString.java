package com.stly7.eland.num_string.doString;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/*
 * 
 */
public class CompareString {
	Random random = new Random();
	char[] cs = new char[2];
	static String[] strs = new String[100];
	//����ȥ��
	List<String> list =  new ArrayList<>();
	
	public static void main(String[] args) {
		CompareString compare = new CompareString();
		
		//���
		for (int i = 0; i < strs.length; i++) {
			strs[i] = compare.getChar();
			System.out.println("index" + i + " --> " + strs[i]);
		}
		//ͳ��
		compare.count();
	}
	
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
	
	//����ͳ��
	public void count() {
		
		for (int i = 0; i < strs.length - 1; i++) {
			//������100����count������
			int count = 1;
			for (int j = i + 1; j < strs.length; j++) {
				if (strs[i].contains(strs[j])) {
					//����
					getString(strs[j]);
					count ++;
					System.out.println(strs[i] + "����" + count + "�±�ֱ�Ϊ" + i + " "+ j );
				}
			}
		}
		
		System.out.println("======================");
		System.out.println("�ظ���" + list.size() + "��");
		System.out.println("�ֱ�Ϊ:");
		System.out.println(list);
		
	}
	
	//String[] �޷�ֱ�Ӹ�ֵ,ͨ��stringbuffer��ʽ���л��һ������
	//Ȼ��ʹ��listȥ��ȥ��
	public void getString(String s) {
		//���ַ�buffer����ƾ��
		StringBuffer sb = new StringBuffer(s + " ");
		String[] split = sb.toString().split(" ");
		
		for (int i = 0; i < split.length; i++) {
			if (!list.contains(split[i])) {
				list.add(split[i]);
			}
		}
		
	}
}

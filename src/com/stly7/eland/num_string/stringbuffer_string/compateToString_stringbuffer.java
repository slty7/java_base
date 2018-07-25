package com.stly7.eland.num_string.stringbuffer_string;

import java.util.Random;
/**
 * String��StringBuffer����������?

	����10λ���ȵ�����ַ���
	Ȼ��,��ʹ��String��+,����10000������ַ���,�������ĵ�ʱ��
	Ȼ��,��ʹ��StringBuffer����10000������ַ���,�������ĵ�ʱ��

	��ʾ: ʹ��System.currentTimeMillis() ��ȡ��ǰʱ��(����)
 * @author Administrator
 *
 */
public class compateToString_stringbuffer {
	Random random = new Random();
	char[] cs = new char[10];
	
	public static void main(String[] args) {
		compateToString_stringbuffer string_stringbuffer = new compateToString_stringbuffer();
		//ʹ��string��ƴ��
		String str1 = "";
		long start1 = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			str1 += string_stringbuffer.getChar() + "";
		}
		long end1 = System.currentTimeMillis();
		System.out.println(str1.length());
		string_stringbuffer.show(str1, start1, end1);
		
		System.out.println("============================");
		
		//ʹ��StringBuffer����ƴ��
		StringBuffer sb = new StringBuffer();
		long start2 = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			sb = sb.append(string_stringbuffer.getChar());
		}
		long end2 = System.currentTimeMillis();
		System.out.println(sb.toString().length());
		string_stringbuffer.show(sb.toString(), start2, end2);
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
	
	public void show(String str, long start, long end) {
		System.out.println(str);
		System.out.println(start);
		System.out.println(end);
		System.out.println(end - start);
	}
	
}

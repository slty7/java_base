package com.stly7.eland.collection.hashCode_hashMap;

import java.util.Random;

/**
 * ����ϰ������Ҫ��ȥ�������㷨�������Զ���һ���򵥵�hashcode�㷨�����������ַ�����hashcode
 * ��ΪString�಻�ܱ���д����������ͨ��һ����̬����������һ��String��hashcode
 * 
 * public static int hashcode(String)
 * ����ַ���������0���򷵻�0��
 * ���� ��ȡÿһλ�ַ���ת�������ֺ���ӣ�������23
 * (s[0]+ s[1] + s[2] + s[3]+ s[n-1])*23.
 * 
 * ���ֵ������1999����ȡ2000����������֤����0-1999֮�䡣
 * ����Ǹ�������ȡ����ֵ��
 * ������ɳ�����2-10�Ĳ��ȵ�100���ַ�������ӡ�ñ�hashcode��ȡ��ֵ�ֱ��Ƕ���
 * @author Administrator
 *
 */
public class myHashcode {
	
	public static void main(String[] args) {
		//�������
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			int length = (int)(random.nextInt(8) + 2);
			int hashcode = hashcode(random(length));
			System.out.println(hashcode);
		}
	}
	
	
	private static int hashcode(String str) {
		if(0==str.length())
            return 0;
         
        int hashcode = 0;
        char[]cs= str.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            hashcode +=cs[i];
        }
        hashcode*=23;
        //ȡ����ֵ
        hashcode = hashcode<0?0-hashcode:hashcode;
        //����0-1999֮��
        hashcode %=2000;
         
        return hashcode;
	}
	
	//���һ���ַ���
	private static String random(int length) {
		char[] cs = new char[length];
		
		Random r = new Random();
		for (int i = 0; i < cs.length; i++) {
			//�����������һ����0��ʼ��������(2),��������3��������Χ�ڵ�����л�
			int y = r.nextInt(3) + 0;
            if (y == 0) {
                cs[i] = (char)(r.nextInt(9)+49);
            }else if (y==1) {
                cs[i] = (char)(r.nextInt(25)+66);
            }else {
                cs[i] = (char)(r.nextInt(25)+98);
            }
		}
		return new String(cs);
	}
	
}

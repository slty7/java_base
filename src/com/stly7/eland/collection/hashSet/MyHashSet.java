package com.stly7.eland.collection.hashSet;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
/**
 * ����������װ������������ͬ���ַ���
 * @author Administrator
 *
 */
public class MyHashSet {
	Random random = new Random();
	char[] cs = new char[2];
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		MyHashSet myHashSet = new MyHashSet();
		//String random = myHashSet.getChar();
		String[] strs = new String[100];
		for (int i = 0; i < strs.length; i++) {
			strs[i] = myHashSet.getChar();
		}
		for (String s1 : strs) {
            int repeat = 0;
            for (String s2 : strs) {
                if (s1.equalsIgnoreCase(s2)) {
                    repeat++;
                    if (2 == repeat) {
                        // ��repeat==2��ʱ�򣬾��ҵ���һ���Ǽ����ظ��ַ���
                    	set.add(s2);
                        break;
                    }
                }
            }
        }
 
        System.out.printf("�ܹ��� %d���ظ����ַ���%n", set.size());
        if (set.size() != 0) {
            System.out.println("�ֱ��ǣ�");
            for (String s : set) {
                System.out.print(s + " ");
            }
        }
		
	}
	
	
	/**
	 * ���߸���һ���ַ���,�������Χ���������һ���ַ�Ȼ�� str += String.toArrayAt();
	 * @return
	 */
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
}

package com.stly7.eland.collection.hashSet_linkedSet_treeSet;

import java.nio.charset.Charset;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * ����LinkedHashSet�ļȲ��ظ�������˳������ԣ���Math.PI�е����֣�
 * ���ճ���˳���ӡ��������ͬ���֣�ֻ����һ��
 * @author Administrator
 *
 */
public class OrderBySort {
	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		double pi = Math.PI;
		String str = String.valueOf(pi);
		
		str = str.replace(".", "");
		System.out.println(str);
		char[] cs = str.toCharArray();
		
		for (char c : cs) {
			set.add(Integer.parseInt(String.valueOf(c)));
		}
		System.out.println(set);
	}
}

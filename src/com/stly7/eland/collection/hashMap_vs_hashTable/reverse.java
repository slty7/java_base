package com.stly7.eland.collection.hashMap_vs_hashTable;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * HashMap��Hashtable��ʵ����Map�ӿڣ����Ǽ�ֵ�Ա������ݵķ�ʽ
 * ����1�� 
 * HashMap���Դ�� null
 * Hashtable���ܴ��null
 * ����2��
 * HashMap�����̰߳�ȫ����
 * Hashtable���̰߳�ȫ����
 * 
 * ����Ŀǰѧϰ�Ľ��ȣ������̰߳�ȫ��չ�������߳��½ڻ���ϸ����
 * @author Administrator
 *
 */
public class reverse {
	/**
	 * ʹ�����¼�ֵ�ԣ���ʼ��һ��HashMap��
	 * adc - ����Ӣ��
	 * apc - ħ��Ӣ��
	 * t - ̹��
	 * �����HashMap���з�ת��key���value,value���key
	 * ��ʾ�� keySet()���Ի�ȡ���е�key, values()���Ի�ȡ���е�value
	 */
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		Map<String, String> newMap = new HashMap<>();
		map.put("adc", "����Ӣ��");
		map.put("apc", "ħ��Ӣ��");
		map.put("t", "̹��");
		
		System.out.println("��תǰ"+ map);
		
		Set<String> keySet = map.keySet();
		System.out.println("---" + keySet);
		// ��������������
		// map.clear();
		for (String key : keySet) {
			String value = map.get(key);
			newMap.put(value, key);
		}
		map.clear();
		System.out.println("��ת��"+ newMap);
	}
	
}

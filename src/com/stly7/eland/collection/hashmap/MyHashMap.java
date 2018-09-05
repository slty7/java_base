package com.stly7.eland.collection.hashmap;

import java.util.LinkedList;

/**
 * ����ǰ��ѧϰ��hashcode��ԭ����Զ���hashcode, ���һ��MyHashMap��ʵ�ֽӿ�IHashMap
 * MyHashMap�ڲ���һ��������2000�Ķ�������ʵ�֡�
 * ���put(String key,Object value)����
 * ����ͨ����һ���Զ����ַ�����hashcode��ϰ��ȡ�����ַ�����hashcode,Ȼ������hashcode��Ϊ�±꣬��λ�������ָ��λ�á� 
 * �����λ��û�����ݣ�����ַ����Ͷ�����ϳɼ�ֵ��Entry���ٴ���һ��LinkedList���Ѽ�ֵ�ԣ��Ž�LinkedList�У�����LinkedList ���������λ�á�
 * �����λ�������ݣ�һ����һ��LinkedList,����ַ����Ͷ�����ϳɼ�ֵ��Entry�����뵽LinkedList���档
 * 
 * ��� Object get(String key) ����
 * ����ͨ����һ���Զ����ַ�����hashcode��ϰ��ȡ�����ַ�����hashcode,Ȼ������hashcode��Ϊ�±꣬��λ�������ָ��λ�á� 
 * ������λ��û�����ݣ��򷵻ؿ�
 * ������λ�������ݣ��򰤸��Ƚ����м�ֵ�Եļ�-�ַ������Ƿ�equals���ҵ�ƥ��ģ��Ѽ�ֵ�Ե�ֵ�����س�ȥ���Ҳ���ƥ��ģ��ͷ��ؿ�
 * @author Administrator
 *
 */
public class MyHashMap implements IHashMap {
	//2000��hash���㷨ֵ
	LinkedList<Entry>[] values = new LinkedList[2000];
	
	@Override
	public void put(String key, Object object) {		// TODO Auto-generated method stub
		int hashcode = hashcode(key);
		
		//�е���Ӧ��LinkedList
		LinkedList<Entry> list = values[hashcode];
		// ���LinkedList��null���򴴽�һ��LinkedList
        if (null == list) {
            list = new LinkedList<>();
            values[hashcode] = list;
        }
        
        // �жϸ�key�Ƿ��Ѿ��ж�Ӧ�ļ�ֵ��
        boolean found = false;
        for (Entry entry : list) {
            // ����Ѿ����ˣ����滻��
            if (key.equals(entry.key)) {
                entry.value = object;
                found = true;
                break;
            }
        }
 
        // ���û���Ѿ����ڵļ�ֵ�ԣ��򴴽��µļ�ֵ��
        if (!found) {
            Entry entry = new Entry(key, object);
            list.add(entry);
        }
        
        // ���û���Ѿ����ڵļ�ֵ�ԣ��򴴽��µļ�ֵ��
        if (!found) {
            Entry entry = new Entry(key, object);
            list.add(entry);
        }
        
	}

	@Override
	public Object get(String key) {
		 int hashcode = hashcode(key);
	        // �ҵ�hashcode��Ӧ��LinkedList
	        LinkedList<Entry> list = values[hashcode];
	        if (null == list)
	            return null;
	 
	        Object result = null;
	 
	        // �����Ƚ�ÿ����ֵ�Ե�key���ҵ�ƥ��ģ�������value
	        for (Entry entry : list) {
	            if (entry.key.equals(key)) {
	                result = entry.value;
	                break;
	            }
	        }
	 
	        return result;
	}
	
	
	// ���ɱ��ص�hashcode
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
	
}

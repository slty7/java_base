package com.stly7.eland.num_string.stringbuffer_string;
/**
 * ģ��StringBuffer���в���
 * @author Administrator
 *
 */
public class MyStringBuffer implements IStringBuffer {
	
	// value�����ڴ���ַ�����
	// capacity�� ����
	// �޲ι��췽����	����������ʼ��value
	char[] value;
	int capacity = 16;
	int length = 0;
	
	//Ȼ���췸����
	public MyStringBuffer(){
		//�ղι���Ҫ�г�ʼ����
		value = new char[capacity];
	}
	
	//�вι���,���������������
	public MyStringBuffer(String str) {
		//�жϲ������ǿ�,��ض��ǲ����Ĳض�
//		if (null != str) {
//			//ֵ���Ƿ��ص�����
//			value = str.toCharArray();
//		}
//		length = value.length;
		
		this();//���������һ����һ����ʼ��ֵvalueֵ�Ĳ���
		//����ǿ�ֱ�ӷ���
		if (null == str) {
			return;
		}
		//������ǿ�,���ǳ��ȳ���16��,Ҫ���´����ռ�͸����ַ����ĳ���,(�׳�����)
		if(capacity < str.length()) {
			int i = str.length() / capacity;
			if (str.length() % capacity != 0) {
				capacity *= i + 1;
				value = new char[capacity];
			}else {
				capacity *= i;
				value = new char[capacity];
			}
		}
		
		//������˻������������System.arraycopy(str.toCharArray(), 0, value, 0, str.length())
		if (capacity >= str.length()) {
			//�����ֿ��԰�value����
			System.arraycopy(str.toCharArray(), 0, value, 0, str.length());
		}
		length = str.length();
		
	}
	
	@Override
	public void append(String str) {
		// TODO Auto-generated method stub
	}

	@Override
	public void append(char c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert(int pos, char b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert(int pos, String b) {
		// TODO Auto-generated method stub
		//�����жϱ߽�
		if (pos >  length) {
			return;
		}
		if (pos < 0) {
			return;
		}
		if (null == b) {
			return;
		}
		//����
		
		
	}

	@Override
	public void delete(int start) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int start, int end) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reverse() {
		// TODO Auto-generated method stub
		for (int i = 0; i < length / 2; i++) {
			char temp = value[i];
			value[i] = value[length - 1 - i];
			value[length - 1 - i] = temp;
		}
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		
		return length;
	}

	//toString�ĳ�����str�ĳ��ȵ�,Ȼ��ͨ��������еײ����copy�ٶȿ�
	public String toString() {
		char[] realValue = new char[length];
		System.arraycopy(value, 0, realValue, 0, length);
		
		return new String(realValue);
	}
	
}

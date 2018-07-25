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
		
		this();
		//����ǿ�ֱ�ӷ���
		if (null == str) {
			return;
		}
		//������ǿ�,���ǳ��ȳ���16��,Ҫ���´����ռ�
		if(capacity < str.length()) {
			capacity += value.length;
			value = new char[capacity];
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

}

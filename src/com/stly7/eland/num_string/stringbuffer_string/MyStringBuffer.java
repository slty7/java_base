package com.stly7.eland.num_string.stringbuffer_string;

public class MyStringBuffer implements IStringBuffer {
	
	//���ڵײ����������ӿ��
	char[] charAt;
	//���ڷ���һ��ֵ
	String string = null;
	
	public String toString() {
		
		return new String (charAt);
	}
	
	@Override
	public void append(String str) {
		// TODO Auto-generated method stub
		//ʹ���ַ�������������ٶȱȽϿ�
		for (int i = 0; i < str.length(); i++) {
			charAt[i] = str.charAt(i);
		}
		toString();
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
		
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		
		return 0;
	}

}

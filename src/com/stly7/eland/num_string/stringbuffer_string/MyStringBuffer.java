package com.stly7.eland.num_string.stringbuffer_string;

public class MyStringBuffer implements IStringBuffer {
	
	//用于底层操作数组更加快捷
	char[] charAt;
	//用于返回一个值
	String string = null;
	
	public String toString() {
		
		return new String (charAt);
	}
	
	@Override
	public void append(String str) {
		// TODO Auto-generated method stub
		//使用字符串来进行添加速度比较快
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

package com.stly7.eland.collection;

import java.util.ArrayList;
import java.util.List;

import com.stly7.eland.collection.intface.IStringBuffer;

public class MyStringBuffer implements IStringBuffer {
	
	List value;
	
	//�ղι���,��ʼ������16���ֽڵĿ��ַ���
	public MyStringBuffer() {
		value = new ArrayList<>();
	}
	
	//�вι���
	public MyStringBuffer(String str) {
		this();
		value.add(str);
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
		
	}

	@Override
	public int length() {
		
		return value.size();
	}

}

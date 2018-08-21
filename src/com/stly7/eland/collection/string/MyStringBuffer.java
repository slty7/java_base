package com.stly7.eland.collection.string;

import java.util.ArrayList;
import java.util.List;

import com.stly7.eland.collection.intface.IStringBuffer;
/**
 * ��һ��һ����MyStringBuffer��ϰ�����ǲ�ʹ���ַ����飬����ʹ��ArrayList��ʵ��
 * 
 * �Զ���bufferStringҪ����Ҫ��ʵ����ӵĲ����ɾ��
 * ����Ǳ���Ĳ���,
 * @author Administrator
 *
 */
public class MyStringBuffer implements IStringBuffer {
	
	List value;
	
	//�ղι���,��ʼ������16���ֽڵĿ��ַ���
	public MyStringBuffer() {
		value = new ArrayList<>();
	}
	
	//�вι���
	public MyStringBuffer(String str) {
		this();
		//value.add(str);
		//�˴����ܼ򵥵���str������������,��Ϊֱ��ʹ�ü��ϵĻ��Ͳ�����char������
		//��ʱ���ǽ�ʹ��
		append(str);
	}
	
	@Override
	public void append(String str) {
		// TODO Auto-generated method stub
		insert(value.size(), str);
	}

	@Override
	public void append(char c) {
		// TODO Auto-generated method stub
		insert(value.size(), c);
	}

	@Override
	public void insert(int pos, char b) {
		// TODO Auto-generated method stub
		//��������Ķ����ַ���
		value.add(pos, b);
	}

	@Override
	public void insert(int pos, String b) {
		// TODO Auto-generated method stub
		//��������Խ��
		if (pos < 0 || pos > value.size()) {
			throw new RuntimeException("�Ǳ�Խ��");
		}
		//����ֵ����
		if (b.equals("")) {
			throw new IllegalArgumentException("����������ַ���");
		}
		//ͨ���������洢����ַ�
		for (int i = pos; i < b.length(); i++) {
			//���ǲ����ַ���
			value.add(i, b.charAt(i));
		}
		
	}

	@Override
	public void delete(int start) {
		// TODO Auto-generated method stub
		delete(start, value.size() - 1);
	}

	@Override
	public void delete(int start, int end) {
		// TODO Auto-generated method stub
		if (start < end && start > 0 || end > 0) {
			for (int i = start; i < end; i++) {
				value.remove(i);
			}
		}
	}

	@Override
	public void reverse() {
		// TODO Auto-generated method stub
		for (int i = 0; i < value.size() / 2; i++) {
			char temp = (char) value.get(i);
			value.set(i, value.get(value.size() - 1 - i));
			value.set(value.size() - 1 - i, temp);
		}
	}

	@Override
	public int length() {
		
		return value.size() == 0 ? 16 : value.size();
	}

	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i < value.size(); i++) {
			str += value.get(i);
		}
		return str;
	}

}

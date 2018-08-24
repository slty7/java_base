package com.stly7.eland.collection.string;

import java.util.ArrayList;
import java.util.List;

import com.stly7.eland.collection.intface.IStringBuffer;
/**
 * ��һ��һ����MyStringBuffer��ϰ�����ǲ�ʹ���ַ����飬����ʹ��ArrayList��ʵ��
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
		//ֱ�ӵ���list������
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
		insert(pos, String.valueOf(b));
	}

	@Override
	public void insert(int pos, String b) {
		// TODO Auto-generated method stub
		 if (pos < 0 || pos > value.size()) {
			 throw new RuntimeException("�Ǳ�Խ��");
		 }
        if (b.equals("")) {
        	throw new IllegalArgumentException("����������ַ���");
        }
        
        /*//����pos�����
        //�����(insertǰ)���γ��� = (insertǰ)�ܳ���-(pos - 1)
        for (int i = pos + b.length(); i < value.size() + b.length(); i++) {
			//��ӵ�ǰ��λ��
        	char begin = (char) value.get(pos ++);
        	value.add(i, begin);
		}
        
        //auto����ȥb�����charֵ
        int auto = 0;
        for (int i = pos; i < pos + b.length(); i++) {
            value.add(i, b.charAt(auto ++));
        }*/
        
        //����ķ���̫�鷳��
        //����list������,��posλ�÷�����ԭ�������
        for (int i = b.length() - 1; i >= 0 ; i--) {
        	value.add(pos, b.charAt(i));
		}
	}

	@Override
	public void delete(int start) {
		// TODO Auto-generated method stub
		delete(start, value.size());
	}

	@Override
	public void delete(int start, int end) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		if (start < 0 || start > value.size()) {
			 throw new RuntimeException("�Ǳ�Խ��");
		}
		//ͬ������list������
		for (int i = start; i < end; i++) {
			//һֱɾ����ʼ�ĵ�λ�ô������˾�ɾ����
			value.remove(start);
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

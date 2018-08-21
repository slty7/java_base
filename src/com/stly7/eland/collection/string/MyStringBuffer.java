package com.stly7.eland.collection.string;

import java.util.ArrayList;
import java.util.List;

import com.stly7.eland.collection.intface.IStringBuffer;
/**
 * 做一个一样的MyStringBuffer练习，但是不使用字符数组，而是使用ArrayList来实现
 * 
 * 自定义bufferString要素主要是实现最复杂的插入和删除
 * 添加是变相的插入,
 * @author Administrator
 *
 */
public class MyStringBuffer implements IStringBuffer {
	
	List value;
	
	//空参构造,初始化就有16个字节的空字符串
	public MyStringBuffer() {
		value = new ArrayList<>();
	}
	
	//有参构造
	public MyStringBuffer(String str) {
		this();
		//value.add(str);
		//此处不能简单的用str来返回数组了,因为直接使用集合的话就不适用char数组了
		//此时我们将使用
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
		//反正插入的都是字符串
		value.add(pos, b);
	}

	@Override
	public void insert(int pos, String b) {
		// TODO Auto-generated method stub
		//索引不能越界
		if (pos < 0 || pos > value.size()) {
			throw new RuntimeException("角标越界");
		}
		//传入值不能
		if (b.equals("")) {
			throw new IllegalArgumentException("请勿输入空字符串");
		}
		//通过索引来存储这个字符
		for (int i = pos; i < b.length(); i++) {
			//都是操作字符串
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

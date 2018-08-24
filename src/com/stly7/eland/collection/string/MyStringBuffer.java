package com.stly7.eland.collection.string;

import java.util.ArrayList;
import java.util.List;

import com.stly7.eland.collection.intface.IStringBuffer;
/**
 * 做一个一样的MyStringBuffer练习，但是不使用字符数组，而是使用ArrayList来实现
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
		//直接调用list的特性
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
			 throw new RuntimeException("角标越界");
		 }
        if (b.equals("")) {
        	throw new IllegalArgumentException("请勿输入空字符串");
        }
        
        /*//先重pos起点移
        //插入的(insert前)后半段长度 = (insert前)总长度-(pos - 1)
        for (int i = pos + b.length(); i < value.size() + b.length(); i++) {
			//添加的前的位置
        	char begin = (char) value.get(pos ++);
        	value.add(i, begin);
		}
        
        //auto用于去b里面的char值
        int auto = 0;
        for (int i = pos; i < pos + b.length(); i++) {
            value.add(i, b.charAt(auto ++));
        }*/
        
        //上面的方法太麻烦了
        //根据list的特性,在pos位置反过来原索引添加
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
			 throw new RuntimeException("角标越界");
		}
		//同样根据list的特性
		for (int i = start; i < end; i++) {
			//一直删掉开始的的位置次数够了就删够了
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

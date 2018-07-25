package com.stly7.eland.num_string.stringbuffer_string;
/**
 * 模仿StringBuffer进行操作
 * @author Administrator
 *
 */
public class MyStringBuffer implements IStringBuffer {
	
	// value：用于存放字符数组
	// capacity： 容量
	// 无参构造方法：	根据容量初始化value
	char[] value;
	int capacity = 16;
	int length = 0;
	
	//然后构造犯方法
	public MyStringBuffer(){
		//空参构造要有初始化的
		value = new char[capacity];
	}
	
	//有参构造,看看这里设计巧妙
	public MyStringBuffer(String str) {
		//判断参数不是空,则藏毒是参数的藏毒
//		if (null != str) {
//			//值则是返回的数组
//			value = str.toCharArray();
//		}
//		length = value.length;
		
		this();
		//如果是空直接返回
		if (null == str) {
			return;
		}
		//如果不是空,但是长度超出16了,要重新创建空间
		if(capacity < str.length()) {
			capacity += value.length;
			value = new char[capacity];
		}
		//如果够了或者相等了则用System.arraycopy(str.toCharArray(), 0, value, 0, str.length())
		if (capacity >= str.length()) {
			//这样又可以吧value覆盖
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

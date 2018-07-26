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
		
		this();//这里的作用一定有一个初始化值value值的产生
		//如果是空直接返回
		if (null == str) {
			return;
		}
		//如果不是空,但是长度超出16了,要重新创建空间就根据字符串的长度,(俗称扩容)
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
		insert(length, str);
	}

	@Override
	public void append(char c) {
		// TODO Auto-generated method stub
		insert(length, String.valueOf(c));
	}

	//无需重新开发,只要调用即可
	@Override
	public void insert(int pos, char b) {
		// TODO Auto-generated method stub
		insert(pos, String.valueOf(b));
	}

	@Override
	public void insert(int pos, String b) {
		// TODO Auto-generated method stub
		//首先判断边界
		if (pos > length) {
			return;
		}
		if (pos < 0) {
			return;
		}
		if (null == b) {
			return;
		}
		//扩容
		if(length + b.length() > capacity) {
			int i = length + b.length() / capacity;
			
			//快速获取一个估算值
			if (length + b.length() % capacity != 0) {
				capacity *= i + 1;
				value = new char[capacity];
			}else {
				capacity *= i;
				value = new char[capacity];
			}
			//通过拷贝方式进行获得精确值
			System.arraycopy(value, 0, value, 0, length + b.length());
			
			char[] cs = b.toCharArray();
			
			//先吧已经存在的数据往后移,这里的pos是指 pos - end这一段数组,
			//然后放到 在pos增加cs.length这里开始到最后长度是value的长度 减起点的长度
			//这样的value是会自增的,无需管理长度
			System.arraycopy(value, pos, value, pos + cs.length, length - pos);
			
			//在把要拷贝的数据放到重甲空出来的那段
			System.arraycopy(cs, 0, value, pos, cs.length);;
			
			length += cs.length;
		}
		
		
		
	}

	@Override
	public void delete(int start) {
		// TODO Auto-generated method stub
		delete(start, length);
	}

	@Override
	public void delete(int start, int end) {
		// TODO Auto-generated method stub
		//边界条件判断
        if(start<0)
            return;
         
        if(start>length)
            return;
         
        if(end<0)
            return;
         
        if(end>length)
            return;
         
        if(start>=end)
            return;
        
        //最后一段(end --> length) 添加到 从(start开始删掉的这里),最后一个参数其实就是第一个end -->length的长度 
        System.arraycopy(value, end, value, start, length - end);;
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

	//toString的长度是str的长度的,然后通过数组进行底层进行copy速度快
	public String toString() {
		char[] realValue = new char[length];
		System.arraycopy(value, 0, realValue, 0, length);
		
		return new String(realValue);
	}
	
}

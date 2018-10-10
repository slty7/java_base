package com.stly7.eland.multiplethread.touch.stack;

import java.util.LinkedList;

import com.stly7.eland.multiplethread.sync._interface.Stack;
import com.stly7.eland.multiplethread.sync.bean.Hero;
/**
 * ������������������һ���ǳ������Ե��߳̽��������⡣

1. ʹ��ջ���������
1.1 ��ջ����Ϊ֧���̰߳�ȫ
1.2 ��ջ�ı߽�������д�����ջ���������0��ʱ�򣬷���pull���߳̾ͻ�ȴ��� ��ջ�������ʱ200��ʱ�򣬷���push���߳̾ͻ�ȴ�
2. �ṩһ�������ߣ�Producer���߳��࣬���������д�ַ�ѹ�뵽��ջ
3. �ṩһ�������ߣ�Consumer���߳��࣬�Ӷ�ջ�е����ַ�����ӡ������̨
4. �ṩһ�������࣬ʹ���������ߺ������������߳�ͬʱ���У������������ ��
 * @author Administrator
 *
 * @param <T>
 */
public class MyStack<T>{
	
	public LinkedList<T> value = new LinkedList<>();
	
	// ����ѹջ
	public synchronized void push(T t) {
		while (value.size() >= 200) {
			try {
				this.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		this.notifyAll();
		value.addLast(t);
	}

	// ��ջ
	public synchronized T pull() {
		while (value.isEmpty()) {
			try {
				this.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		this.notifyAll();
		return value.removeLast();
	}

	// �鿴
	public synchronized T peek() {
		
		return value.getLast();
	}

}

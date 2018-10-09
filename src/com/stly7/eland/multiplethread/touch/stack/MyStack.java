package com.stly7.eland.multiplethread.touch.stack;

import java.util.LinkedList;

import com.stly7.eland.multiplethread.sync._interface.Stack;
import com.stly7.eland.multiplethread.sync.bean.Hero;
/**
 * 生产者消费者问题是一个非常典型性的线程交互的问题。

1. 使用栈来存放数据
1.1 把栈改造为支持线程安全
1.2 把栈的边界操作进行处理，当栈里的数据是0的时候，访问pull的线程就会等待。 当栈里的数据时200的时候，访问push的线程就会等待
2. 提供一个生产者（Producer）线程类，生产随机大写字符压入到堆栈
3. 提供一个消费者（Consumer）线程类，从堆栈中弹出字符并打印到控制台
4. 提供一个测试类，使两个生产者和三个消费者线程同时运行，结果类似如下 ：
 * @author Administrator
 *
 * @param <T>
 */
public class MyStack<T>{
	
	public LinkedList<T> value = new LinkedList<>();
	
	// 用于压栈
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

	// 弹栈
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

	// 查看
	public synchronized T peek() {
		
		return value.getLast();
	}

}

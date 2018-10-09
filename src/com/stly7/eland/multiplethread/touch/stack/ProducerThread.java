package com.stly7.eland.multiplethread.touch.stack;

import java.util.Random;

public class ProducerThread extends Thread {
	
	private MyStack<Character> stack;
	public ProducerThread(MyStack<Character> stack, String name) {
		super(name);
		this.stack = stack;
	}

	// 这个线程是用于压栈的
	public void run() {
		while (true) {
			char r = getRandom();
			stack.push(r);
			System.out.println(this.getName()+" 压入: <-- " + r);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public Character getRandom() {
		return (char)(new Random().nextInt(26) + (int)'A');
	}
}

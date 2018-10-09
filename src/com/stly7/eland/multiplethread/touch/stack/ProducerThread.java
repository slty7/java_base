package com.stly7.eland.multiplethread.touch.stack;

import java.util.Random;

public class ProducerThread extends Thread {
	
	private MyStack<Character> stack;
	public ProducerThread(MyStack<Character> stack, String name) {
		super(name);
		this.stack = stack;
	}

	// ����߳�������ѹջ��
	public void run() {
		while (true) {
			char r = getRandom();
			stack.push(r);
			System.out.println(this.getName()+" ѹ��: <-- " + r);
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

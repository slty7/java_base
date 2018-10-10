package com.stly7.eland.multiplethread.touch.stack;

public class TestStack {
	public static void main(String[] args) {
		MyStack<Character> stack = new MyStack<>();
		new ProducerThread(stack, "Producer1").start();
		new ProducerThread(stack, "Producer2").start();
		
		new CunsumerThread(stack, "Cunsumer1").start();
		new CunsumerThread(stack, "Cunsumer2").start();
		new CunsumerThread(stack, "Cunsumer3").start();
	}
}

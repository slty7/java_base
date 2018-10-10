package com.stly7.eland.multiplethread.touch.stack;

public class CunsumerThread extends Thread {
	
	private MyStack<Character> stack;

	public CunsumerThread(MyStack<Character> stack, String name) {
		super(name);
		this.stack = stack;
	}
	
	public void run(){
        
        while(true){
            char c = stack.pull();
            System.out.println(this.getName()+" µ¯³ö: --> " + c);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
         
    }
}

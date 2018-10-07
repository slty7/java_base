package com.stly7.eland.multiplethread.sync;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.stly7.eland.multiplethread.sync._interface.Stack;
import com.stly7.eland.multiplethread.sync.bean.Hero;
public class MyStack implements Stack {
	
	LinkedList<Hero> heros = new LinkedList<Hero>();
    // 线程安全的的操作
	List<Hero> heroes = Collections.synchronizedList(new LinkedList<Hero>()); 
	
	 //插入的时候，加上synchronized，同步对象是当前实例
    public synchronized void push(Hero h) {
    	heros.addLast(h);
    	
    	// 线程安全的操作
    	//heroes.add(h);//默认是再最后面添加一个对象,从0开始
    	//heroes.add(heroes.size(), h);
    }
    
    //取出的时候，加上synchronized，同步对象是当前实例
    public synchronized Hero pull() {
        return heros.removeLast();
        
        // 线程安全的操作
        //return heroes.remove(heroes.size() - 1);
    }
    
    //查看没必要加上synchronized，因为不修改数据
    public Hero peek() {
        return heros.getLast();
        
        // 线程安全的操作
        //return heroes.get(heroes.size() -1);
    }
    
 public static void main(String[] args) {
        
        MyStack heroStack = new MyStack();
        for (int i = 0; i < 5; i++) {
            Hero h = new Hero("hero name " + i);
            System.out.println("压入 hero:" + h);
            heroStack.push(h);
        }
        for (int i = 0; i < 5; i++) {
            Hero h =heroStack.pull();
            System.out.println("弹出 hero" + h);
        }
    }
    
}
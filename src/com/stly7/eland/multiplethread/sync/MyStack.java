package com.stly7.eland.multiplethread.sync;

import java.util.LinkedList;


import com.stly7.eland.multiplethread.sync._interface.Stack;
import com.stly7.eland.multiplethread.sync.bean.Hero;
public class MyStack implements Stack {
	
	LinkedList<Hero> heros = new LinkedList<Hero>();
        
	 //插入的时候，加上synchronized，同步对象是当前实例
    public synchronized void push(Hero h) {
        heros.addLast(h);
    }
    
    //取出的时候，加上synchronized，同步对象是当前实例
    public synchronized Hero pull() {
        return heros.removeLast();
    }
    
    //查看没必要加上synchronized，因为不修改数据
    public Hero peek() {
        return heros.getLast();
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
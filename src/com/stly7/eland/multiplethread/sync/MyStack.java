package com.stly7.eland.multiplethread.sync;

import java.util.LinkedList;


import com.stly7.eland.multiplethread.sync._interface.Stack;
import com.stly7.eland.multiplethread.sync.bean.Hero;
public class MyStack implements Stack {
	
	LinkedList<Hero> heros = new LinkedList<Hero>();
        
	 //�����ʱ�򣬼���synchronized��ͬ�������ǵ�ǰʵ��
    public synchronized void push(Hero h) {
        heros.addLast(h);
    }
    
    //ȡ����ʱ�򣬼���synchronized��ͬ�������ǵ�ǰʵ��
    public synchronized Hero pull() {
        return heros.removeLast();
    }
    
    //�鿴û��Ҫ����synchronized����Ϊ���޸�����
    public Hero peek() {
        return heros.getLast();
    }
    
 public static void main(String[] args) {
        
        MyStack heroStack = new MyStack();
        for (int i = 0; i < 5; i++) {
            Hero h = new Hero("hero name " + i);
            System.out.println("ѹ�� hero:" + h);
            heroStack.push(h);
        }
        for (int i = 0; i < 5; i++) {
            Hero h =heroStack.pull();
            System.out.println("���� hero" + h);
        }
    }
    
}
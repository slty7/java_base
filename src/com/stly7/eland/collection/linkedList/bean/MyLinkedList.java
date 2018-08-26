package com.stly7.eland.collection.linkedList.bean;

import java.util.LinkedList;
import java.util.List;

import com.stly7.eland.collection.linkedList.interface_.Stack;

public class MyLinkedList implements Stack {
	
	LinkedList<Hero> ll;
	
	public MyLinkedList() {
		ll = new LinkedList<>();
	}

	/*public <T> TestlinkList(T t) throws Exception {
		this();
		Class<? extends Object> clazz = t.getClass();
		Object obj = clazz.newInstance();
		
	}*/
	
	//-----------------------这里就用类似于queue的接口方法    stack接口方法--------------------------------
	//把英雄推入到最后位置
	@Override
	public void push(Hero h) {
		// TODO Auto-generated method stub
		ll.addLast(h);
	}

	//把最后一个英雄取出来
	@Override
	public Hero pull() {
		// TODO Auto-generated method stub
		return ll.removeLast();
	}

	//查看最后一个英雄
	@Override
	public Hero peek() {
		// TODO Auto-generated method stub
		return ll.getLast();
	}

}

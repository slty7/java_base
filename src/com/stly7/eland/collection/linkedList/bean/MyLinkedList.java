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
	
	//-----------------------�������������queue�Ľӿڷ���    stack�ӿڷ���--------------------------------
	//��Ӣ�����뵽���λ��
	@Override
	public void push(Hero h) {
		// TODO Auto-generated method stub
		ll.addLast(h);
	}

	//�����һ��Ӣ��ȡ����
	@Override
	public Hero pull() {
		// TODO Auto-generated method stub
		return ll.removeLast();
	}

	//�鿴���һ��Ӣ��
	@Override
	public Hero peek() {
		// TODO Auto-generated method stub
		return ll.getLast();
	}

}

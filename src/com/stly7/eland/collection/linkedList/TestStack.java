package com.stly7.eland.collection.linkedList;

import org.junit.Test;

import com.stly7.eland.collection.linkedList.bean.Hero;
import com.stly7.eland.collection.linkedList.bean.MyLinkedList;

public class TestStack {
	
	@Test
	public static void main(String[] args) {
		MyLinkedList myll = new MyLinkedList();
		
		for (int i = 0; i < 10; i++) {
			myll.push(new Hero("hero " + i));
		}
		
		System.out.println(myll.peek());
		myll.pull();
		System.out.println(myll.peek());
	}
	
}

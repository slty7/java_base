package com.stly7.eland.multiplethread.sync.bean;

public class Hero {

	String name;
	
	public Hero(){};
	
	public Hero(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}

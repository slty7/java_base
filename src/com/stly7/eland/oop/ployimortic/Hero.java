package com.stly7.eland.oop.ployimortic;

public class Hero {
	private String name;
	
	public Hero() {
		super();
	}
	public Hero(String name) {
		super();
		this.name = name;
	}
	
	public void kill(Mortal m) {
		m.die();
	}
	
}

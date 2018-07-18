package com.stly7.eland.oop;

public class Fish extends Animal implements Pet {

	private String name;
	
	public Fish() {
		super();
	}

	@Override
	public void eat() {
		
		System.out.println("鱼吃虾米");
	}

	@Override
	public void walk() {
		System.out.println("鱼是没有腿的...");
	}

	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void play() {
		System.out.println("鱼在水里游...");
	}
	
	
}

package com.stly7.eland.oop;

public class Fish extends Animal implements Pet {

	private String name;
	
	public Fish() {
		super();
	}

	@Override
	public void eat() {
		
		System.out.println("���Ϻ��");
	}

	@Override
	public void walk() {
		System.out.println("����û���ȵ�...");
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
		System.out.println("����ˮ����...");
	}
	
	
}

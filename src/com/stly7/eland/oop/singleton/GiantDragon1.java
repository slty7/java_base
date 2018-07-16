package com.stly7.eland.oop.singleton;

public class GiantDragon1 {
	
	//私有构造
	private GiantDragon1() {
		
	}
	
	//准备一个类属性，用于指向一个实例化对象，但是暂时指向null
	private static GiantDragon1 instance;
	
	//通过方法返回一个实例对象
	public static GiantDragon1 getInstance() {
		//第一次访问的时候，发现instance没有指向任何对象，这时实例化一个对象
		if (instance == null) {
			instance =  new GiantDragon1();
		}
		//返回实例对象
		return instance;
	}
}

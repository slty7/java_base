package com.stly7.eland.oop;
/**
 * 1. Spider继承Animal类。
	2. 定义默认构造器，它调用父类构造器来指明所有蜘蛛都是8条腿。
	3. 实现eat方法
 * @author Administrator
 *
 */
public class Spider extends Animal {
	
	
	
	public Spider() {
		super();
	}
	public Spider(int legs) {
		super(legs);
	}

	@Override
	public void eat() {
		System.out.println("蜘蛛吃饭了...");
	}
	
	public static void main(String[] args) {
		Animal spider = new Spider(8);
		spider.eat();
		spider.walk();
	}
}

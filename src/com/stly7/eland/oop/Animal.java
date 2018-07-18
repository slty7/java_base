package com.stly7.eland.oop;
/**
 * 1. 创建Animal类，它是所有动物的抽象父类。
	2. 声明一个受保护的整数类型属性legs，它记录动物的腿的数目。
	3. 定义一个受保护的构造器，用来初始化legs属性。
	4. 声明抽象方法eat。
	5. 声明具体方法walk来打印动物是如何行走的（包括腿的数目）。
 * @author Administrator
 *
 */
public abstract class Animal {
	int legs;
	
	//construct
	public Animal() {
		super();
	}

	public Animal(int legs) {
		super();
		this.legs = legs;
	}

	//toString
	@Override
	public String toString() {
		return "Animal [legs=" + legs + "]";
	}
	
	//抽象方法eat
	public abstract void eat();
	
	//走路
	public void walk(){
		System.out.println("蜘蛛" + "是用" + this.legs + "腿走路的");
	}
	
}

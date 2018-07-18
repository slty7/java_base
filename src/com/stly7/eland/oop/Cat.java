package com.stly7.eland.oop;
/**
 * 1. 该类必须包含String属性来存宠物的名字。
	2. 定义一个构造器，它使用String参数指定猫的名字；该构造器必须调用超类构造器来指明所有的猫都是四条腿。
	3. 另定义一个无参的构造器。该构造器调用前一个构造器（用this关键字）并传递一个空字符串作为参数
	4. 实现Pet接口方法。
	5. 实现eat方法。
 * @author Administrator
 *
 */
public class Cat extends Animal implements Pet {
	
	String name = "tom";
	
	public Cat() {
		this.name = "";
	}
	
	public Cat(int legs){
		super(legs);
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
		System.out.println(this.name + "在玩皮球");
	}

	@Override
	public void eat() {
		System.out.println("猫吃老鼠");
	}

}

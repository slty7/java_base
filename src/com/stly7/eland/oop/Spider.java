package com.stly7.eland.oop;
/**
 * 1. Spider�̳�Animal�ࡣ
	2. ����Ĭ�Ϲ������������ø��๹������ָ������֩�붼��8���ȡ�
	3. ʵ��eat����
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
		System.out.println("֩��Է���...");
	}
	
	public static void main(String[] args) {
		Animal spider = new Spider(8);
		spider.eat();
		spider.walk();
	}
}

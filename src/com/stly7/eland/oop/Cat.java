package com.stly7.eland.oop;
/**
 * 1. ����������String���������������֡�
	2. ����һ������������ʹ��String����ָ��è�����֣��ù�����������ó��๹������ָ�����е�è���������ȡ�
	3. ����һ���޲εĹ��������ù���������ǰһ������������this�ؼ��֣�������һ�����ַ�����Ϊ����
	4. ʵ��Pet�ӿڷ�����
	5. ʵ��eat������
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
		System.out.println(this.name + "����Ƥ��");
	}

	@Override
	public void eat() {
		System.out.println("è������");
	}

}

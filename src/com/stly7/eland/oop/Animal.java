package com.stly7.eland.oop;
/**
 * 1. ����Animal�࣬�������ж���ĳ����ࡣ
	2. ����һ���ܱ�����������������legs������¼������ȵ���Ŀ��
	3. ����һ���ܱ����Ĺ�������������ʼ��legs���ԡ�
	4. �������󷽷�eat��
	5. �������巽��walk����ӡ������������ߵģ������ȵ���Ŀ����
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
	
	//���󷽷�eat
	public abstract void eat();
	
	//��·
	public void walk(){
		System.out.println("֩��" + "����" + this.legs + "����·��");
	}
	
}

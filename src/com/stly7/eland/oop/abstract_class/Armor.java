package com.stly7.eland.oop.abstract_class;

public class Armor extends Item {

	@Override
	public boolean disposable() {
		System.out.println(this.name + "���ڹ�������------>����ʹ�ú���һֱ����...");
		return false;
	}

}

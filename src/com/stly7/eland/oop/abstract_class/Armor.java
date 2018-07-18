package com.stly7.eland.oop.abstract_class;

public class Armor extends Item {

	@Override
	public boolean disposable() {
		System.out.println(this.name + "用于攻击敌人------>武器使用后还是一直存在...");
		return false;
	}

}

package com.stly7.eland.oop.armor;

/**
 * 设计一个类Armor护甲
继承Item类，并且额外提供一个属性ac: 护甲等级 int类型

实例化出两件护甲
名称 价格 护甲等级
布甲 300 15
锁子甲 500 40
 * @author Administrator
 *
 */
public class TestArmor {
	
	public static void main(String[] args) {
		Armor armor1 = new Armor();
		Armor armor2 = new Armor();
		
		armor1.catgraoy = "ac";
		armor1.name = "布甲";
		armor1.price = 300f;
		armor1.level = 15;
		
		armor2.catgraoy = "ac";
		armor2.name = "锁子甲";
		armor2.price = 500f;
		armor2.level = 40;
		
		System.out.println(armor1);
		System.out.println(armor2);
	}
	
	
}

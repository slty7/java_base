package com.stly7.eland.oop.singleton;
/**
 * 懒汉式
 * @author Administrator
 *
 */
public class Item {
	
	//私有构造
	private Item(){}
	
	//私有唯一属性引用
	private static Item instance;
	
	//提供共有方法访问这个实例,并且赋值到唯一引用中
	public static Item getInstance() {
		
		if (instance == null) {
			instance = new Item();
		}
		
		return instance;
	}
}

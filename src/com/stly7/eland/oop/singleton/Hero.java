package com.stly7.eland.oop.singleton;
/**
 * 饿汉式
 * @author Administrator
 *
 */
public class Hero {
	
	//私有化构造
	private Hero(){}
	
	//私有化唯一属性实例
	private static Hero instance = new Hero();
	
	//提供一个访问方法,并且返回一个唯一实例
	public static Hero getInstance() {
		return instance;
	}
}

package com.stly7.eland.oop.singleton;
/**
 * 饿汉式单例
 * @author Administrator
 *
 */
public class GiantDragon {
	
	//私有化构造方法使得该类无法在外部通过new 进行实例化
	private GiantDragon(){
	}
	//准备一个类属性，指向一个实例化对象。 因为是类属性，所以只有一个所以共享一个的话只用static修饰
	private static GiantDragon instance = new GiantDragon();
		
	//提供调用方法,返回一个实例对象
	public static GiantDragon getInstance() {
		
		return instance;
	}
}

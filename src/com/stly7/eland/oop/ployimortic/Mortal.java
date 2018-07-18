package com.stly7.eland.oop.ployimortic;

public interface Mortal {
	
	public void die();
	
	//添加这个不需要进行修改后面的实现,不用重写.
	default public void revive() {
		System.out.println("英雄复活了....");
	}
}

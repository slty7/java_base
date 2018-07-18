package com.stly7.eland.oop.abstract_class;

public class MagicPotion extends Item {

	@Override
	public boolean disposable() {
		System.out.println(this.name + "用于恢复魔法值------->蓝屏的使用后就会消失");
		return true;
	}

}

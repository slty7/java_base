package com.stly7.eland.oop.abstract_class;

public class MagicPotion extends Item {

	@Override
	public boolean disposable() {
		System.out.println(this.name + "���ڻָ�ħ��ֵ------->������ʹ�ú�ͻ���ʧ");
		return true;
	}

}

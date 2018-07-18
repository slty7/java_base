package com.stly7.eland.oop.abstract_class;

public class TestItem {
	//≤‚ ‘ π”√¿∂∆ø∫ÕŒ‰∆˜
	public static void main(String[] args) {
		Item armor = new Armor();
		armor.setName("…–∑Ω±¶Ω£");
		armor.setPrice(10000);
		
		Item magicPotion = new MagicPotion();
		magicPotion.setName("∏«÷–∏«");
		magicPotion.setPrice(100);
		
		System.out.println(armor.disposable());
		System.out.println(magicPotion.disposable());
	}
}

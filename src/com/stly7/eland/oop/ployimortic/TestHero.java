package com.stly7.eland.oop.ployimortic;

public class TestHero {
	public static void main(String[] args) {
		
		Hero g = new Hero("盖伦");
		/*
		 * Hero ad = new ADHero();
		   Hero ap = new APHero();
		   Hero adap = new ADAPHero();
		 */
		//意思就是接口多态了
		//上面内容是对的,下面内容也是对的
		Mortal ad = new ADHero();
		Mortal ap = new APHero();
		Mortal adap = new ADAPHero();
		
		g.kill(ad);
		g.kill(ap);
		g.kill(adap);
	}
}

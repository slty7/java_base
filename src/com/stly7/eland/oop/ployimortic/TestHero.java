package com.stly7.eland.oop.ployimortic;

public class TestHero {
	public static void main(String[] args) {
		
		Hero g = new Hero("����");
		/*
		 * Hero ad = new ADHero();
		   Hero ap = new APHero();
		   Hero adap = new ADAPHero();
		 */
		//��˼���ǽӿڶ�̬��
		//���������ǶԵ�,��������Ҳ�ǶԵ�
		Mortal ad = new ADHero();
		Mortal ap = new APHero();
		Mortal adap = new ADAPHero();
		
		g.kill(ad);
		g.kill(ap);
		g.kill(adap);
	}
}

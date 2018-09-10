package com.stly7.eland.lambda.comparator_container;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Comparator_Container {
	
	public static void main(String[] args) {
		List<Hero> heroes = new ArrayList<>();
		Random random = new Random();
		
		for (int i = 0; i < 5; i++) {
			Hero hero = new Hero("hero " + i, random.nextInt(1000), random.nextInt(100));
			heroes.add(hero);
		}
		
		// comparator不变,看返回值是否是boolean
		Comparator<Hero> c = (h1, h2) -> h1.comparatorHero(h2);
		Collections.sort(heroes, c);
		Collections.sort(heroes, Hero :: comparatorHero);
	}
}

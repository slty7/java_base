package com.stly7.eland.lambda.comparator_static;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Lambda_Comparator {
	
	public static void main(String[] args) {
		List<Hero> heroes = new ArrayList<>();
		Random r = new Random();
		
		for (int i = 0; i < 1000; i++) {
			heroes.add(new Hero("hero " + i, r.nextInt(1000), r.nextInt(100)));
		}
		
		System.out.println("初始化后的集合：");
	    System.out.println(heroes);
	    Collections.sort(heroes, (h1, h2) -> Lambda_Comparator.compare(h1, h2));
	    
	    Collections.sort(heroes, Lambda_Comparator :: compare);
	}
	
	 public static int compare(Hero h1, Hero h2){
	        return h1.hp >= h2.hp ? 1 : -1;
	  }
}

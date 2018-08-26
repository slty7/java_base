package com.stly7.eland.collection.arrayList.genericheros;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
	
	public static void main(String[] args) {
		List<Parent> list = new ArrayList<>();
		list.add(new Hero("hero"));
		list.add(new Item("item"));
	}
	
}

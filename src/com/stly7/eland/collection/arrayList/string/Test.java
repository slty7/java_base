package com.stly7.eland.collection.arrayList.string;

public class Test {
	public static void main(String[] args) {
		MyStringBuffer sb = new MyStringBuffer("123");
		sb.append("123");
		System.out.println(sb);
		System.out.println(sb.length());
	}
}

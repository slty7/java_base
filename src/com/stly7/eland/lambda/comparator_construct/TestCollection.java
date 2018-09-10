package com.stly7.eland.lambda.comparator_construct;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestCollection {
	public static void main(String[] args) {
		insertFirst(ArrayList :: new, "ArrayList");
        insertFirst(LinkedList :: new, "LinkedList");
        //List<Integer> l;
        //l = new ArrayList<>();
        //insertFirst(l, "ArrayList");
  
        //l = new LinkedList<>();
        //insertFirst(l, "LinkedList");
  
    }
  
    private static void insertFirst(Supplier<List> s, String type) {
        int total = 1000 * 100;
        final int number = 5;
        long start = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            s.get().add(0, number);
        }
        long end = System.currentTimeMillis();
        System.out.printf("��%s ��ǰ�����%d�����ݣ��ܹ���ʱ %d ���� %n", type, total, end - start);
    }
}

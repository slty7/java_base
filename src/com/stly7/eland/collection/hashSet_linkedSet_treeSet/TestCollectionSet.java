package com.stly7.eland.collection.hashSet_linkedSet_treeSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
/**
 * HashSet�� ����
 * LinkedHashSet�� ���ղ���˳��
 * TreeSet�� ��С��������
 * @author Administrator
 *
 */
public class TestCollectionSet {
    public static void main(String[] args) {
        HashSet<Integer> numberSet1 =new HashSet<Integer>();
        //HashSet�е����ݲ��ǰ��ղ���˳����
        numberSet1.add(88);
        numberSet1.add(8);
        numberSet1.add(888);
          
        System.out.println(numberSet1);
          
        LinkedHashSet<Integer> numberSet2 =new LinkedHashSet<Integer>();
        //LinkedHashSet�е������ǰ��ղ���˳����
        numberSet2.add(88);
        numberSet2.add(8);
        numberSet2.add(888);
          
        System.out.println(numberSet2);
        TreeSet<Integer> numberSet3 =new TreeSet<Integer>();
        //TreeSet �е������ǽ����������
        numberSet3.add(88);
        numberSet3.add(8);
        numberSet3.add(888);
          
        System.out.println(numberSet3);
          
    }
}

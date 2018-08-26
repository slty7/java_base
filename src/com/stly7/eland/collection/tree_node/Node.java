package com.stly7.eland.collection.tree_node;

import java.util.ArrayList;
import java.util.List;

/**
 * ͨ���ڲ���ķ�ʽ
 * @author Administrator
 * ����ͨ��������������10���������������
 * 67,7,30,73,10,0,78,81,10,74
 * ����ĵ�һ�������ǰ����ݲ��뵽�ö�������
 * ��������߼��ǣ�С����ͬ�ķ���ߣ���ķ��ұ�
 * 1. 67 ���ڸ��ڵ�
 * 2. 7 �� 67С������67����ڵ�
 * 3. 30 ��67 С���ҵ�67����ڵ�7��30��7�󣬾ͷ���7���ҽڵ�
 * 4. 73 ��67�� ����67���ҽڵ�
 * 5. 10 �� 67С���ҵ�67����ڵ�7��10��7���ҵ�7���ҽڵ�30��10��30С������30����ڵ㡣......
 * 9. 10��67С���ҵ�67����ڵ�7��10��7���ҵ�7���ҽڵ�30��10��30С���ҵ�30����ڵ�10��10��10һ���󣬷������
 *
 */
public class Node {
    // ���ӽڵ�
    public Node leftNode;
    // ���ӽڵ�
    public Node rightNode;
    // ֵ
    public Object value;
    
 // ���� ����
    public void add(Object v) {
        // �����ǰ�ڵ�û��ֵ���Ͱ����ݷ��ڵ�ǰ�ڵ���
        if (null == value){
        	value = v;
        }
  
        // �����ǰ�ڵ���ֵ���ͽ����жϣ�������ֵ�뵱ǰֵ�Ĵ�С��ϵ
        else {
            // ������ֵ���ȵ�ǰֵС������ͬ
             
            if ((Integer) v -((Integer)value) <= 0) {
                if (null == leftNode) {
                	leftNode = new Node();
                }
                //�ݹ�
                leftNode.add(v);
            }
            // ������ֵ���ȵ�ǰֵ��
            else {
                if (null == rightNode) {
                	rightNode = new Node();
                }
                //�ݹ�
                rightNode.add(v);
            }
        }
  
    }
  
    // ����������еĽڵ�
    public List<Object> values() {
        List<Object> list = new ArrayList<>();
  
        // ��ڵ�ı������
        if (null != leftNode) {
        	list.addAll(leftNode.values());
        }
        // ��ǰ�ڵ�,����ǿվ���һ����ʼ�ڵ�
        list.add(value);
  
        // �ҽڵ�ı������
        if (null != rightNode){
        	list.addAll(rightNode.values());
        }
  
        return list;
    }
  
    public static void main(String[] args) {
  
        int randoms[] = new int[] { 67, 7, 30, 73, 10, 0, 78, 81, 10, 74 };
  
        Node roots = new Node();
        for (int number : randoms) {
            roots.add(number);
        }
  
        System.out.println(roots.values());
  
    }
} 

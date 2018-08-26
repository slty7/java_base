package com.stly7.eland.collection.tree_node;

import java.util.ArrayList;
import java.util.List;

/**
 * 通过内部类的方式
 * @author Administrator
 * 假设通过二叉树对如下10个随机数进行排序
 * 67,7,30,73,10,0,78,81,10,74
 * 排序的第一个步骤是把数据插入到该二叉树中
 * 插入基本逻辑是，小、相同的放左边，大的放右边
 * 1. 67 放在根节点
 * 2. 7 比 67小，放在67的左节点
 * 3. 30 比67 小，找到67的左节点7，30比7大，就放在7的右节点
 * 4. 73 比67大， 放在67得右节点
 * 5. 10 比 67小，找到67的左节点7，10比7大，找到7的右节点30，10比30小，放在30的左节点。......
 * 9. 10比67小，找到67的左节点7，10比7大，找到7的右节点30，10比30小，找到30的左节点10，10和10一样大，放在左边
 *
 */
public class Node {
    // 左子节点
    public Node leftNode;
    // 右子节点
    public Node rightNode;
    // 值
    public Object value;
    
 // 插入 数据
    public void add(Object v) {
        // 如果当前节点没有值，就把数据放在当前节点上
        if (null == value){
        	value = v;
        }
  
        // 如果当前节点有值，就进行判断，新增的值与当前值的大小关系
        else {
            // 新增的值，比当前值小或者相同
             
            if ((Integer) v -((Integer)value) <= 0) {
                if (null == leftNode) {
                	leftNode = new Node();
                }
                //递归
                leftNode.add(v);
            }
            // 新增的值，比当前值大
            else {
                if (null == rightNode) {
                	rightNode = new Node();
                }
                //递归
                rightNode.add(v);
            }
        }
  
    }
  
    // 中序遍历所有的节点
    public List<Object> values() {
        List<Object> list = new ArrayList<>();
  
        // 左节点的遍历结果
        if (null != leftNode) {
        	list.addAll(leftNode.values());
        }
        // 当前节点,如果是空就是一个开始节点
        list.add(value);
  
        // 右节点的遍历结果
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

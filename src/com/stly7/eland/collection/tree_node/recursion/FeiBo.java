package com.stly7.eland.collection.tree_node.recursion;
/**
 * ��ʵ˵���ˣ����ǵݹ鷽����������Լ������е����㣬����ٸ�����˵��һ��������Ӿ��Ǻ������ġ���쳲��������С� 
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233��377��610��987��1597��2584��
 * 4181��6765��10946��17711��28657��46368���� 
 * @author Administrator
 *
 */
public class FeiBo {
	//�Ʊ�����
	 public static int Recursion(int n){
	
	    if(n==1){
	        return 0;
	    }
	
	    if(n==2){
	        return 1;
	    }
	    return Recursion(n-1)+Recursion(n-2);
	  }
}

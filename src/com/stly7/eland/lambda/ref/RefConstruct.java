package com.stly7.eland.lambda.ref;
/**
 * �еĽӿ��еķ����᷵��һ�����󣬱���java.util.function.Supplier�ṩ
��һ��get����������һ������
 
public interface Supplier<T> {
    T get();
}
 

���һ������������������ӿ�
 
public static List getList(Supplier<List> s){
  return s.get();
}
 

Ϊ�˵��������������3�ַ�ʽ
��һ�������ࣺ
 
Supplier<List> s = new Supplier<List>() {
	public List get() {
		return new ArrayList();
	}
};
List list1 = getList(s);
 


�ڶ��֣�Lambda���ʽ
 
List list2 = getList(()->new ArrayList());
 


�����֣����ù�����
 
List list3 = getList(ArrayList::new);
 */
import java.util.ArrayList;
import java.util.List;

public class RefConstruct {
	public static void main(String[] args) {
		// Ϊ�˵��������������3�ַ�ʽ
		// ��һ�������ࣺ
		Supplier<List> supplier = new Supplier<List>() {
			
			@Override
			public List get() {
				// TODO Auto-generated method stub
				return new ArrayList<>();
			}
		};
		List list1 = getList(supplier);
		
		// lambda ���ʽ
		List list2 = getList(() -> new ArrayList<>());
		
		// ����������,��˼��ֱ�ӵ��ýӿ�����Ĺ���������,����һ������,Ȼ������new
		// ��ʱ������һ��������,����������ʽ ��ʽ
		// public interface Supplier<T> {
			 //T get();
		// }
		List list3 = getList(ArrayList :: new);
		
	}
	
	// ���һ������������������ӿ� ����һ��
	public static List getList(Supplier<List> s){
		return s.get();
	} 
}

package com.stly7.eland.lambda.ref;
/**
 * 有的接口中的方法会返回一个对象，比如java.util.function.Supplier提供
了一个get方法，返回一个对象。
 
public interface Supplier<T> {
    T get();
}
 

设计一个方法，参数是这个接口
 
public static List getList(Supplier<List> s){
  return s.get();
}
 

为了调用这个方法，有3种方式
第一种匿名类：
 
Supplier<List> s = new Supplier<List>() {
	public List get() {
		return new ArrayList();
	}
};
List list1 = getList(s);
 


第二种：Lambda表达式
 
List list2 = getList(()->new ArrayList());
 


第三种：引用构造器
 
List list3 = getList(ArrayList::new);
 */
import java.util.ArrayList;
import java.util.List;

public class RefConstruct {
	public static void main(String[] args) {
		// 为了调用这个方法，有3种方式
		// 第一种匿名类：
		Supplier<List> supplier = new Supplier<List>() {
			
			@Override
			public List get() {
				// TODO Auto-generated method stub
				return new ArrayList<>();
			}
		};
		List list1 = getList(supplier);
		
		// lambda 表达式
		List list2 = getList(() -> new ArrayList<>());
		
		// 构造器引用,意思是直接调用接口哪里的构造引用了,传递一个类型,然后动作是new
		// 此时这里是一个构造器,类似于懒汉式 恶汉式
		// public interface Supplier<T> {
			 //T get();
		// }
		List list3 = getList(ArrayList :: new);
		
	}
	
	// 设计一个方法，参数是这个接口 传递一个
	public static List getList(Supplier<List> s){
		return s.get();
	} 
}

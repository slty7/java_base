package com.stly7.eland.num_string.unpacking_box_packing;
/**
 * 1. 对byte,short,float,double进行自动拆箱和自动装箱

	2. byte和Integer之间能否进行自动拆箱和自动装箱

	3. 通过Byte获取byte的最大值
 * @author Administrator
 *
 */
public class TestUnpacking_box_packing {
	
	 //1. 对byte,short,float,double进行自动拆箱和自动装箱
	byte b1 = 1;
	//装
	Byte b2 = 1;
	//原理
	Byte b_2 = new Byte(b1);
	
	//拆
	Double d1 = 1000d;
	double d2 = d1;
	//原理
	double d_2 = Double.valueOf(d1);
	
	/*
	 * 不能自动拆装箱,包装类不一样
	 * byte i = 2;
	Integer i1 = i;*/
	
	//获取byte的最大值
	public static void main(String[] args) {
		System.out.println(Byte.MAX_VALUE);
	}
	
}

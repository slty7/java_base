package com.stly7.eland.num_string.unpacking_box_packing;
/**
 * 1. ��byte,short,float,double�����Զ�������Զ�װ��

	2. byte��Integer֮���ܷ�����Զ�������Զ�װ��

	3. ͨ��Byte��ȡbyte�����ֵ
 * @author Administrator
 *
 */
public class TestUnpacking_box_packing {
	
	 //1. ��byte,short,float,double�����Զ�������Զ�װ��
	byte b1 = 1;
	//װ
	Byte b2 = 1;
	//ԭ��
	Byte b_2 = new Byte(b1);
	
	//��
	Double d1 = 1000d;
	double d2 = d1;
	//ԭ��
	double d_2 = Double.valueOf(d1);
	
	/*
	 * �����Զ���װ��,��װ�಻һ��
	 * byte i = 2;
	Integer i1 = i;*/
	
	//��ȡbyte�����ֵ
	public static void main(String[] args) {
		System.out.println(Byte.MAX_VALUE);
	}
	
}

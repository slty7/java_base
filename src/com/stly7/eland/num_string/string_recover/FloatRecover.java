package com.stly7.eland.num_string.string_recover;
/**
 * �ο���������
	�Ѹ����� 3.14 ת��Ϊ �ַ��� "3.14"
	�ٰ��ַ��� ��3.14�� ת��Ϊ ������ 3.14

	����ַ����� 3.1a4��ת��Ϊ��������õ�ʲô��
 * @author Administrator
 *
 */
public class FloatRecover {
	
	public static void main(String[] args) {
		float f1 = 3.14f;
		//����1
		String strf = Float.toString(f1);
		//����2
		String strf2 = String.valueOf(f1);
		
		float f2 = Float.parseFloat(strf);
		
		//����ַ����� 3.1a4��ת��Ϊ��������õ�ʲô��
		String strf3 = "3.1a4";
		
		//����ʱ���쳣
		float f3 = Float.parseFloat(strf3);
		System.out.println(f3);
		
	}
}

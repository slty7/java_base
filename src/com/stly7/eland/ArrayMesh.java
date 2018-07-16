package com.stly7.eland;

import java.util.Random;

/**
 * ����׼���������飬�����ĳ�����5-10֮������������ʹ���������ʼ������������
 * (���������������İ취���ο�����)
 * Ȼ��׼�����������飬����������ĳ�����ǰ�����ĺ�
 * ͨ��System.arraycopy ��ǰ��������ϲ���������������
 * @author Administrator
 *
 */
public class ArrayMesh {
	//������������
	static int[] src1 = new int[new Random().nextInt(5) + 5];
	static int[] src2 = new int[new Random().nextInt(5) + 5];
	//֪���⼸�����ĳ���
	static int[] dest = new int[src1.length + src2.length];
	
	public static void main(String[] args) {
		ArrayMesh arrayMesh = new ArrayMesh();
		//���
		arrayMesh.padd(src1);
		arrayMesh.padd(src2);
		
		//��һ�κϲ�
		System.out.println("");
		System.out.println("��һ�κϲ�============================");
		arrayMesh.mesh(src1, 0, dest, 0, src1.length);
		arrayMesh.show(dest);
		
		System.out.println("");
		System.out.println("�ڶ��κϲ�============================");
		//Դ����ʼλ��,��Ŀ����ʼλ��
		arrayMesh.mesh(src2, 0, dest, src1.length, src2.length);
		arrayMesh.show(dest);
		
	}
	
	//���
	private void padd(int[] arr) {
		
		//������0-100��Χ��
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(100);
		}
		
		for (int i : arr) {
			System.out.println("���:" + " == " + i);
		}
		
		System.out.println("==============");
	}
	
	//�ϲ�
	private void mesh(int[] src,int srcPos, int[] dest, int destPos, int length) {
		
		System.arraycopy(src, srcPos, dest, destPos, length);
	}
	
	private void show(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "    " + arr[i]);
		}
	}
}

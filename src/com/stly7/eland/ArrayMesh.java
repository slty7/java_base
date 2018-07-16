package com.stly7.eland;

import java.util.Random;

/**
 * 首先准备两个数组，他俩的长度是5-10之间的随机数，并使用随机数初始化这两个数组
 * (向数组填充随机数的办法，参考这里)
 * 然后准备第三个数组，第三个数组的长度是前两个的和
 * 通过System.arraycopy 把前两个数组合并到第三个数组中
 * @author Administrator
 *
 */
public class ArrayMesh {
	//创建两个数组
	static int[] src1 = new int[new Random().nextInt(5) + 5];
	static int[] src2 = new int[new Random().nextInt(5) + 5];
	//知道这几个数的长度
	static int[] dest = new int[src1.length + src2.length];
	
	public static void main(String[] args) {
		ArrayMesh arrayMesh = new ArrayMesh();
		//填充
		arrayMesh.padd(src1);
		arrayMesh.padd(src2);
		
		//第一次合并
		System.out.println("");
		System.out.println("第一次合并============================");
		arrayMesh.mesh(src1, 0, dest, 0, src1.length);
		arrayMesh.show(dest);
		
		System.out.println("");
		System.out.println("第二次合并============================");
		//源的起始位置,和目标起始位置
		arrayMesh.mesh(src2, 0, dest, src1.length, src2.length);
		arrayMesh.show(dest);
		
	}
	
	//填充
	private void padd(int[] arr) {
		
		//随机填充0-100范围内
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(100);
		}
		
		for (int i : arr) {
			System.out.println("填充:" + " == " + i);
		}
		
		System.out.println("==============");
	}
	
	//合并
	private void mesh(int[] src,int srcPos, int[] dest, int destPos, int length) {
		
		System.arraycopy(src, srcPos, dest, destPos, length);
	}
	
	private void show(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "    " + arr[i]);
		}
	}
}

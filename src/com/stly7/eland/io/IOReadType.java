package com.stly7.eland.io;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Ҫ��
 * ��һ�ַ�ʽ�� ʹ�û������������������ַ�������ʽд���ļ��
 * ���û��������ַ�������ʽ��ȡ������Ȼ��ת��Ϊ�������֡� 
 * 		ע�� ��������֮��Ҫ�зָ��������������������֡� ����������31��15�������ʹ�÷ָ�������ô����3115��
 * 			��ȡ�������޷�ʶ�𵽵������������֡� ʹ�÷ָ���31@15�ܽ��������⡣
 * 
 * �ڶ��ַ�ʽ�� ʹ��������DataOutputStream���ļ�����д���������֣�
 * Ȼ����DataInpuStream������ȡ��������
 * @author Administrator
 *
 */
public class IOReadType {
	
	public static void main(String[] args) throws Exception {
		//one_write();
		//one_read();
		two_write();
		//one_read();
		
		
	}
	
	public static void one_write() throws Exception {
		/* ��һ�ַ�ʽ�� ʹ�û������������������ַ�������ʽд���ļ��
		 * ���û��������ַ�������ʽ��ȡ������Ȼ��ת��Ϊ�������֡� 
		 * 		ע�� ��������֮��Ҫ�зָ��������������������֡� ����������31��15�������ʹ�÷ָ�������ô����3115��
		 * 			��ȡ�������޷�ʶ�𵽵������������֡� ʹ�÷ָ���31@15�ܽ��������⡣
		 * */
		File file = new File("d:/data_io.txt");
		int[] arr = {31, 15};
		//true���������׷��ģʽ
		//PrintWriter pw = new PrintWriter(new FileWriter(file,true));
		PrintWriter pw = new PrintWriter(new FileWriter(file));
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length -1) {
				pw.print(arr[i]);
				pw.flush();
			}else {
				pw.print(arr[i] + "&");
				pw.flush();
			}
		}
	}
	
	public static void one_read() throws Exception {
		File file = new File("d:/data_io.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String str = br.readLine();
		String[] split = str.split("&");
		int[] arr = new int[split.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(split[i]);
		}
		
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	
	/**
	 * �ڶ��ֽⷨ,ֱ���ƹ���
	 * @throws Exception 
	 * 
	 */
	public static void two_write() throws Exception {
		File file = new File("d:/data_io.txt");
		int[] arr = {31, 15};
		DataOutputStream dos = 
				new DataOutputStream(new FileOutputStream(file));
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length -1) {
				dos.writeInt(arr[i]);
				dos.flush();
			}else{
				dos.writeInt(arr[i]);
				dos.writeChars("&");
				dos.flush();
			}
		}
		
		
	}
	
}

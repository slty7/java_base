package com.stly7.eland.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * �Զ�������һ�����Ե����ļ���
 * ͨ������̨����ȡ�������������ƣ��������ͣ�����һ��ģ���ļ����Զ�����������ļ���
 * ����Ϊ�����ṩsetter��getter
 * @author Administrator
 *
 */
public class ReplaceString {
	
	@SuppressWarnings("resource")
	public static void main(String[] agrs) {
		File inFile = new File("d:/template.java");
		File outFile = new File("d:/template1.java");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�������������:");
		String $class = sc.next();
		
		System.out.println("���������Ե�����:");
		String $type = sc.next();
		
		System.out.println("���������Ե�����:");
		String $property = sc.next();
		
		//����һ��������
		try (
				BufferedReader br = new BufferedReader(new FileReader(inFile));
				PrintWriter pw = new PrintWriter(new FileWriter(outFile))
		){
			String temp = null;
			while(true) {
				temp = br.readLine();
				if (temp == null) {
					break;
				}
				
				if (temp.contains("@class@")) {
					temp = temp.replaceAll("@class@", $class);
				}
				if (temp.contains("@type@")) {
					temp = temp.replaceAll("@type@", $type);
				}
				if (temp.contains("@property@")) {
					temp = temp.replaceAll("@property@", $property);
				}
				if (temp.contains("@Uproperty@")) {
					temp = temp.replaceAll("@Uproperty@", $property.substring(0, 1).toUpperCase() + 
							$property.substring(1));
				}
				
				pw.println(temp);
				pw.flush();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}

package com.stly7.eland.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 自动创建有一个属性的类文件。
 * 通过控制台，获取类名，属性名称，属性类型，根据一个模板文件，自动创建这个类文件，
 * 并且为属性提供setter和getter
 * @author Administrator
 *
 */
public class ReplaceString {
	
	@SuppressWarnings("resource")
	public static void main(String[] agrs) {
		File inFile = new File("d:/template.java");
		File outFile = new File("d:/template1.java");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入类的名称:");
		String $class = sc.next();
		
		System.out.println("请输入属性的类型:");
		String $type = sc.next();
		
		System.out.println("请输入属性的名称:");
		String $property = sc.next();
		
		//创建一个输入流
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

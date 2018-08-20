package com.stly7.eland.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 自动创建有一个属性的类文件。 通过控制台，获取类名，属性名称，属性类型，根据一个模板文件， 自动创建这个类文件，并且为属性提供setter和getter
 * 
 * @author Administrator
 *
 */
public class AutoCreateJava {
	/**
	 * public class @class@ { 
	 * public @type@ @property@; public @class@() {
	 * 
	 * } public void set@Uproperty@(@type@ @property@){ this.@property@
	 * = @property@; } public @type@ get@Uproperty@(){ return this.@property@; }
	 * }
	 */

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		File inFile = new File("d:/template.java");
		File outFile = new File("d:/template1.java");

		// 创建一个输入
		InputStream in = System.in;
		Scanner sc = new Scanner(in);
		System.out.println("请输入类的名称:");
		String $class = sc.nextLine();
		System.out.println("请输入属性的类型:");
		String $type = sc.nextLine();
		System.out.println("请输入属性的名称:");
		String $property = sc.nextLine();

		try (
				BufferedReader br = new BufferedReader(new FileReader(inFile));
				PrintWriter pw = new PrintWriter(new FileWriter(outFile))
		) {
			String temp = null;
			while (true) {
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
					temp = temp.replaceAll("@Uproperty@", $property.substring(0, 1).toUpperCase() + $property.substring(1));
				}
				pw.println(temp);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}

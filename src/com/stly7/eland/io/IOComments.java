package com.stly7.eland.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.net.URL;

/**
 * ���һ�������������Ƴ�Java�ļ��е�ע��
 * @author Administrator
 *
 */
public class IOComments {
	
	
	public static void main(String[] args) throws Exception {
		
		File file = new File("test.txt");
		System.out.println(file.getAbsolutePath());
		removeComments(file);
	}
	
	/**
	 * ���һ�������������Ƴ�Java�ļ��е�ע��,�Ƴ����е�ע��,��������ע��
	 * @author Administrator
	 * @throws Exception 
	 *
	 */
	public static void removeComments(File javaFile) throws Exception {
		//ʹ�û�����
		FileReader fr = new FileReader(javaFile);
		//��װһ��
		BufferedReader br = new BufferedReader(fr);
		
		//����һ��д�뻺����
		PrintWriter pw = new PrintWriter(new File("d:/test.java"));
		 while (true) {
             // һ�ζ�һ��
             String line = br.readLine();
             if (null == line){
                 break;
             }
             //����ʼ�������֮��
             if (line.trim().startsWith("//")) {
				continue;
			}else {
				pw.println(line);
				pw.flush();
			}
             
         }
		
	}
}

package com.stly7.eland.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Create_io {
	
	public static void main(String[] args) throws Exception {
		String in_path = "F:/��̳������/SQLyog6Ent.rar";
		String out_path = "F:/��̳������";
		//����һ���ļ�����
		File in_file = new File(in_path);
		File out_file = new File(out_path);
		
		//����һ��������
		FileInputStream fis= new FileInputStream(in_file);
		
		//����һ�������
		FileOutputStream fos= new FileOutputStream(out_file);
		
	}
}

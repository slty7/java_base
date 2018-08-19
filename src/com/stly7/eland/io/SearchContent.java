package com.stly7.eland.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * �����ļ���,ʵ�����·�������Դ�ļ��������е��ļ� ���Ƶ�Ŀ���ļ�����(�������ļ���)
 * @author Administrator
 *
 */
public class SearchContent {
	
	public static void main(String[] args) {
		search(new File("D:\\1"), "�й�");
	}
	
	//��������
	public static void search(File folder, String search) {
		foreFolder(folder, search);
	}
	
	//�����ļ����������еĿɶ����ļ�
	public static void foreFolder(File folder, String search) {
		File[] listFiles = folder.listFiles();
		
		for (File file : listFiles) {
			if (file.isDirectory()) {
				foreFolder(file, search);
			}else {
				readAndCompare(file, search);
			}
		}
	}
	
	//��ȡ���ұȽ�
	public static void readAndCompare(File file, String search) {
		try(
				//���ֽ����м��һ����char[] תString����,�Ͳ�������ظ�����ͬ�ĵط���
			BufferedReader br = 
				new BufferedReader(new FileReader(file));
		) {
			while(true) {
				String buf = "";
				buf = br.readLine();
				//�����ȡ���ٽ��е�  buf.contains ,�����continue���ܿ��ܻ����
				if (file == null) {
					break;
				}
				//�����й����ӡ����
				if(buf.contains(search)) {
					System.out.println("���ļ�" + file + "�ҵ���<�й�>������");
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

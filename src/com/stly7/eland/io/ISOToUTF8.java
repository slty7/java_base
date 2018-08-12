package com.stly7.eland.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
/**
 * �ҳ� E5 B1 8C ��3��ʮ�����ƶ�ӦUTF-8����ĺ���
 * @author Administrator
 *
 */

public class ISOToUTF8 {
	
	static String path = "D:/in_out.txt";
	
	public static void main(String[] args) {
		inOut();
	}
	
	
	//��ΪFileRead�������ñ��������������ֽ�������ת��
	@SuppressWarnings("resource")
	public static void inOut() {
		File file = new File(path);
		
		try {
			FileReader fr = new FileReader(file);
			char[] cs = new char[(int) file.length()];
			fr.read(cs);
			String str = new String(cs);
			//ͨ����������õ�����һ����ַ���
			//ͨ���ַ���ת��16λ������,����ǿת��Ϊbyte���͵�����
			//���ͨ��byte�������ݶ�����utf-8��ʾ����
			String[] split = str.split(" ");
			byte[] buffer = new byte[split.length];
			for (int i = 0; i < buffer.length; i++) {
				buffer[i] = (byte) Integer.parseInt(split[i], 16);
			}
			
			System.out.println(new String(buffer, "utf-8"));;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

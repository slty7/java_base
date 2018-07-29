package com.stly7.eland.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

/**
 * ׼��һ���ı��ļ�(�Ƕ�����)�����а���ASCII����ַ��������ַ���
	���һ������
	public static void encodeFile(File encodingFile, File encodedFile);
	����������а�encodingFile�����ݽ��м��ܣ�Ȼ�󱣴浽encodedFile�ļ��С�
	�����㷨�� 
	���֣�
	�������9�����֣���ԭ���Ļ����ϼ�1������5���6, 3���4
	�����9�����֣����0
	��ĸ�ַ���
	����Ƿ�z�ַ��������ƶ�һ��������d���e, G���H
	�����z��z->a, Z-A��
	�ַ���Ҫ������Сд
	����ĸ�ַ�
	����',&^ �������䣬����Ҳ��������
	���飺 ʹ����ǰѧϰ����ϰ���е�ĳ��Java�ļ�������ѭ����ϰ�����кܶ���ַ�������
 * @author Administrator
 *
 */
public class Lock_UnlockFileReader {
	
	public static void main(String[] args) {
		
		 File encodingFile = new File("d:/lol1.txt");
		 File encodedFile = new File("d:/lol2.txt");
		encodeFile(encodingFile, encodedFile);
		
		File decodingFile = new File("d:/lol3.txt");
		File decodedFile = new File("d:/lol4.txt");
		decodeFile(decodingFile, decodedFile);
		
	}
	
	//������ܵ��ļ�,
	public static void encodeFile(File encodingFile, File encodedFile) {
		try {
			FileReader fr = new FileReader(encodingFile);
			FileWriter fw = new FileWriter(encodedFile);
			char[] cs = new char[1024];
			int len = 0;
			while((len = fr.read(cs) )!= -1) {
				//����
				char[] new_cs = lock(cs);
				fw.write(new_cs, 0, (int)encodingFile.length());
				fw.close();
			}
			fr.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//����
	public static char[] lock(char[] cs) {
		/**
		 * �����㷨�� 
		���֣�
		�������9�����֣���ԭ���Ļ����ϼ�1������5���6, 3���4
		�����9�����֣����0
		��ĸ�ַ���
		����Ƿ�z�ַ��������ƶ�һ��������d���e, G���H
		�����z��z->a, Z-A��
		�ַ���Ҫ������Сд
		����ĸ�ַ�
		����',&^ �������䣬����Ҳ��������
		 */
		char[] new_cs = new char[cs.length];
		System.out.println("����ǰ---->"+ Arrays.toString(cs));
		
		for (int i = 0; i < cs.length; i++) {
			if ('9'> cs[i] && cs[i]>= '0') {
				new_cs[i] = (char) ((int)cs[i] + 1);
			}else if('9' == cs[i]) {
				new_cs[i] = '0';
			}else if('z'> cs[i] && cs[i]>= 'a' || 'Z'> cs[i] && cs[i]>= 'A') {
				new_cs[i] = (char) ((int)cs[i] + 1);
			}else if ('z' == cs[i] || 'Z' == cs[i]){
				  if (cs[i] == 'z') {
					new_cs[i] = 'a';
				}else {
					new_cs[i] = 'A';
				}
			}else {
				new_cs[i] = cs[i];
			}
		}
		
		System.out.println("���ܺ�---->"+ Arrays.toString(new_cs));
		return new_cs;
	}
	
	//����
	public static void decodeFile(File decodingFile, File decodedFile){
		try {
			FileReader fr = new FileReader(decodingFile);
			FileWriter fw = new FileWriter(decodedFile);
			char[] cs = new char[1024];
			int len = 0;
			while((len = fr.read(cs) )!= -1) {
				//����
				char[] new_cs = unlock(cs);
				fw.write(new_cs, 0, (int)decodingFile.length());
				fw.close();
			}
			fr.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//����
	public static char[] unlock(char[] cs) {
		/**
		 * �����㷨�� 
		���֣�
		�������9�����֣���ԭ���Ļ����ϼ�1������5���6, 3���4
		�����9�����֣����0
		��ĸ�ַ���
		����Ƿ�z�ַ��������ƶ�һ��������d���e, G���H
		�����z��z->a, Z-A��
		�ַ���Ҫ������Сд
		����ĸ�ַ�
		����',&^ �������䣬����Ҳ��������
		 */
		char[] new_cs = new char[cs.length];
		System.out.println("����ǰ---->"+ Arrays.toString(cs));
		
		for (int i = 0; i < cs.length; i++) {
			if ('9'>= cs[i] && cs[i]> '0') {
				new_cs[i] = (char) ((int)cs[i] - 1);
			}else if('0' == cs[i]) {
				new_cs[i] = '9';
			}else if('a' < cs[i] && cs[i] <= 'z' || 'A' < cs[i] && cs[i] <= 'z') {
				new_cs[i] = (char) ((int)cs[i] - 1);
			}else if ('a' == cs[i] || 'A' == cs[i]){
				  if (cs[i] == 'a') {
					new_cs[i] = 'z';
				}else {
					new_cs[i] = 'Z';
				}
			}else {
				new_cs[i] = cs[i];
			}
		}
		
		System.out.println("���ܺ�---->"+ Arrays.toString(new_cs));
		return new_cs;
	}

}

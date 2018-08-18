package com.stly7.eland.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOCopy {
	
	
	public static void main(String[] args) {
		//copyFile("D:/xfmovie/IPZ429.rmvb", "d:");
		long begin = System.currentTimeMillis();
		copyFolder("E:\\QQMusicCache", "E:\\test");
		System.out.println("��������....");
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
		
	}

	/**
	 * �����ļ��ǳ�����IO������������·�����ʵ�ָ���Դ�ļ�srcFile��Ŀ���ļ�destFile
	 */
	public static void copyFile(String srcFile, String destFile){
		//ע��������ʽ ���÷�
		String[] split = srcFile.split("\\\\");
		destFile = destFile + "\\" + split[split.length -1];
		try (
				BufferedInputStream bis = new 
					BufferedInputStream(new FileInputStream(srcFile));
				BufferedOutputStream bos = new 
					BufferedOutputStream(new FileOutputStream(destFile))
			){
				//���ݸ�������ͻ�������������������ĳ���,���Ȳ��ܵ���10M
				byte[] buf = new byte[10485760];
				int val = 0;
				while(true) {
					val = bis.read(buf);
					if (val == -1) {
						break;
					}
					bos.write(buf, 0, (int)new File(srcFile).length());
				}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	/**
	 * �����ļ���,ʵ�����·�������Դ�ļ��������е��ļ� ���Ƶ�Ŀ���ļ�����(�������ļ���)
	 */
	public static void copyFolder(String srcFolder, String destFolder){
		// 1.������Ҫ����Դ�ļ���.����һ����ȫ·��
		File srcFile = new File(srcFolder);
		//��ǰ�ļ�������ķ��ļ���Ŀ¼,���ﲻ��file����,���ַ�����������
		String[] filelist = srcFile.list();
		for (String string : filelist) {
			//��Ϊ��copyFile��������˺�׺,����ֻ��Ҫָ��Ŀ¼����
			copyFile(srcFolder + "\\" + string, destFolder);
			System.out.println("Դ·��: -->" + srcFolder + "\\" + string + ", Ŀ��·��: -->" + destFolder);
		}
		
		//��ǰ�ļ��е�Ŀ¼
		File[] listFiles = srcFile.listFiles();
		for (File file : listFiles) {
			if (file.isDirectory()) {
				System.out.println(file + "," + destFolder + "\\" + file.toString().split("\\\\")[file.toString().split("\\\\").length - 1]);
				//�ȴ����ļ���,��Ȼ���ܸ�ֵ
				File sonFile = new File(destFolder + "\\" + file.toString().split("\\\\")[file.toString().split("\\\\").length - 1]);
				sonFile.mkdirs();
				//�����ļ�
				copyFolder(file.toString(), destFolder + "\\" + file.toString().split("\\\\")[file.toString().split("\\\\").length - 1]);
			}
		}
	}
}

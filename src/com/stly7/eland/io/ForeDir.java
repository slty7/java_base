package com.stly7.eland.io;

import java.io.File;
import java.util.Arrays;

/**
 * һ��˵������ϵͳ���ᰲװ��C�̣����Ի���һ�� C:\WINDOWSĿ¼��
	�������Ŀ¼�����е��ļ�(���ñ�����Ŀ¼)
	�ҳ���Щ�ļ�����ĺ���С(��0)���Ǹ��ļ�����ӡ�����ǵ��ļ���
 * @author Administrator
 *
 */
public class ForeDir {
	public static void main(String[] args) {
	
		//����һ��·��
		File file = new File("F:/��̳������");
		File[] fs = new File[file.list().length];
		
		//�ο����˵��㷨
		 long max = 0;
		 //���ﲻ������Сֵ����0���������0��
		 //����С�ļ���ȡ��������Ϊ��ȡ�ļ���ʱ���ų��˴�СΪ0���ļ�
		 long min = Integer.MAX_VALUE;
		 
		 File max_file = null;
		 File min_file = null;
		 //����ͳ�Ʋ���
		
		for (int i = 0; i < file.list().length; i++) {
			fs = file.listFiles();
		}
		
		ForeDir foreDir = new ForeDir();
		foreDir.fore_dir(fs, max, min, max_file, min_file);
	}

	//��������Сֵ
	public void fore_dir(File[] fs, long max, long min, File max_file, File min_file) {
		for (int i = 0; i < fs.length; i++) {
			//ע�����������һ�����ܴ�,��������Ļ��ͳ��ֿ�ָ���쳣
			if (!fs[i].isDirectory()) {
				if (fs[i].exists() && !fs[i].isDirectory()) {
					if (fs[i].length() > max) {
						max = fs[i].length();
						max_file = fs[i];
					}
				}
				if (fs[i].exists() && !fs[i].isDirectory() && 0 != fs[i].length()) {
					if (fs[i].length() < min) {
						min = fs[i].length();
						min_file = fs[i];
					}
				}
			}else {
				fore_dir(fs[i].listFiles(), max, min, max_file, min_file);
			}
		}
		System.out.println("������ֵ" + max_file + " size:" + max);
		System.out.println("�����Сֵ" + min_file + " size:" + min);
		System.out.println("");
	}
}

package com.stly7.eland.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class SubmitFile {
	
	public static void main(String[] args) throws Exception {
		
		//��ʱ,·���Ϳ�ʼ��ͬ��,��Ҫ��������ļ����µ�����file
		String path = "C:/Users/Administrator/Desktop/1";
		File file = new File(path);
		File[] listFiles = file.listFiles();
		
		try {
			//��ʱ��Ҫ����file[]  ����� --> һ�� outputStream
			FileOutputStream fos = new FileOutputStream(new File(path + "/TeamViewer.exe"));
			//ע������ֻ��һ���м仺��Ľ������������
			byte[] b = new byte[100 * 1024];
			//���ڼ���
			for (int i = 0; i < listFiles.length; i++) {
				FileInputStream fis = new FileInputStream(new File(path + "/TeamViewer.exe-" + i));
				int read = 0;
				
				//��ʵ����������������,����� fis.read(b)����ÿ�ι涨�ĳ��ȶ�ȡ
				//���û�к�������ϲ���ʱ���ǿ��Եĵ���,��ֵ�ʱ��Ͳ���
				while ((read = fis.read(b, 0, b.length)) != -1) {
					System.out.println(read);
					//ÿ��д�ĳ���
					fos.write(b, 0, read);
					fos.flush();
				}
				fis.close();
			}
		} catch (Exception e) {
			System.out.println("�ϲ��쳣");
		}
	}
}

package com.stly7.eland.multiplethread.pool.search;

import java.io.File;
import java.io.FileReader;

public class SearchFileTask implements Runnable{

	// ����Ŀ¼
	private File file;
	// �����Ĺؼ���
	private String search;
	
	public SearchFileTask(File file, String search) {
		super();
		this.file = file;
		this.search = search;
	}


	@Override
	public void run() {
		String fileConent = readFileConent(file);
		if (fileConent.contains(search)) {
			 System.out.printf( "�߳�: %s �ҵ���Ŀ���ַ���%s,���ļ�:%s%n",
					 Thread.currentThread().getName(), search,file);
		}
	}
	
	// ��ȡ�ļ�
	public String readFileConent(File file) {
		try (FileReader fr = new FileReader(file)){
			char[] all = new char[(int)file.length()];
			fr.read(all);
			return new String(all);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}

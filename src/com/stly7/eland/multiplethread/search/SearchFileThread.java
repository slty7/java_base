package com.stly7.eland.multiplethread.search;

import java.io.File;
import java.io.FileReader;

/**
 * �� ��ϰ-�����ļ����� ��Ϊ���̲߳����ļ�����
 * ԭ��ϰ��˼·�Ǳ��������ļ������������ļ��� .java��ʱ�򣬲�������ļ������ݣ��������֮���ٱ�����һ���ļ�
 * ����ͨ�����̵߳������˼·��
 * ���������ļ������������ļ���.java��ʱ�򣬴���һ���߳�ȥ��������ļ������ݣ����صȴ�����߳̽���������������һ���ļ�
 * @author Administrator
 *
 */
public class SearchFileThread extends Thread {

	private String key;
	private File file;
	public SearchFileThread(String key, File file) {
		super();
		this.key = key;
		this.file = file;
	}
	
	@Override
	public void run() {
		 String fileContent = readFileConent(file);
        if(fileContent.contains(key)){
            System.out.printf("�ҵ���Ŀ���ַ���%s,���ļ�:%s%n", key, file);
        }
	}
	
	// �����ֽ������ж�ȡ�����������У�Ȼ���װ�ֽ�������а�װ�����ַ���
	// �����û���������ÿ�еĶ����ж�(��ȱ��)
	public String readFileConent(File file) {
		try (
			FileReader fr = new FileReader(file);
		){
			char[] all = new char[(int) file.length()];
			fr.read(all);
			return new String(all);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
}









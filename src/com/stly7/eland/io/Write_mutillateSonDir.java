package com.stly7.eland.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;

/**
 * ���ֽ�������ʽ���ļ�д������ �е����ӣ���lol2.txt�����ڵ�ʱ���ǻ��Զ�����lol2.txt�ļ��ġ�
	���ǣ������д�����ݵ�d:/xyz/lol2.txt����Ŀ¼xyz�ֲ����ڵĻ����ͻ��׳��쳣��
	��ô��ô�Զ�����xyzĿ¼��
	����Ƕ��Ŀ¼ d:/xyz/abc/def/lol2.txt �أ�
 * @author Administrator
 *
 */
public class Write_mutillateSonDir {
	private static final String[][] String = null;
	static String out_path = "d:/xyz/abc/def/lol2.txt";
	static String mkdir_path = "";
	
	public static void main(String[] args) throws IOException {
		Write_mutillateSonDir mutillateSonDir = new Write_mutillateSonDir();
		File fo = new File(out_path);
		//���ȴ����ļ���
		mutillateSonDir.createFile();
		
		//���ݻ���
		byte[] cache = {88, 89};
		
		FileOutputStream fos = new FileOutputStream(fo);
		fos.write(cache);
		fos.close();
	}
	
	//�����ļ���
	public void createFile() {
		File mkDirFile = getMkDirFile();
		// ����һ��Ҫ����mkdirs���Ƕ�㴴���ļ���
		mkDirFile.mkdirs();
	}
	
	//��ô����ļ���·��
	public File getMkDirFile() {
		
		String[] split = out_path.split("/");
		for (int i = 0; i < split.length - 1; i++) {
			if (i == split.length - 2) {
				mkdir_path += split[i];
			}else {
				mkdir_path += split[i] + "/";
			}
		}
		System.out.println(mkdir_path);
		return new File(mkdir_path);
	}
}

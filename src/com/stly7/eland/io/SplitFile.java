package com.stly7.eland.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * �ҵ�һ������100k���ļ�������100kΪ��λ����ֳɶ�����ļ��������Ա����Ϊ�ļ���������
	�����ļ� eclipse.exe����С��309k��
	���֮�󣬳�Ϊ 
	eclipse.exe-0
	eclipse.exe-1
	eclipse.exe-2
	eclipse.exe-3
 * @author Administrator
 *
 */
public class SplitFile {
	
/*	public static void main(String[] args) throws Exception {
		
		//�ٶ���һ��������������Ӻ�׺
		String path = "C:/Users/Administrator/Desktop/1/TeamViewer.exe";
		File file = new File(path);
		
		FileInputStream in = new FileInputStream(file);
		//һ�ζ�ȡ����ļ����ֽ���
		byte[] in_cache = new byte[(int) file.length()];
		
		//ÿ��д��100 * 1024���ֽ���
		byte[] out_cache = new byte[1024 * 100];
		//���һ�����һ��Ҫ�Ե�������ĳ��Ȳ�Ȼ�ḳֵ��ȥ��
		byte[] end_out_cache = new byte[in_cache.length % (1024 * 100)];
		
		FileOutputStream out = null;
		//���������̵�ͷβ������
		//���ж���Ҫ�� < 100K���ļ�
		if (in_cache.length >= out_cache.length) {
			//> 100k�ļ������
			for (int i = 0; i <= in_cache.length / (100 * 1024); i++) {
				out = new FileOutputStream(new File(path + i));
				if (i == 0 && in_cache.length > out_cache.length) {
					System.arraycopy(in_cache, 0, end_out_cache, 0, end_out_cache.length);
					out.write(out_cache);
					System.out.println("������ļ���-->(" + path + i + ")--size:" + out_cache.length + "��byte");
				}else if(i > 0 && i < in_cache.length / (100 * 1024)) {
					System.arraycopy(in_cache, i * (100 * 1024) - 1, out_cache, 0, out_cache.length);
					out.write(out_cache);
					System.out.println("������ļ���-->(" + path + i + ")--size:" + out_cache.length + "��byte");
				}else if(i == in_cache.length / (100 * 1024) && i > 0) {
					System.arraycopy(in_cache, i * (100 * 1024) - 1, end_out_cache, 0, end_out_cache.length);
					out.write(end_out_cache);
					System.out.println("������ļ���-->(" + path + i + ")--size:" + end_out_cache.length + "��byte");
				}else{
					break;
				}
				
				out.close();
			}
		}else {
			System.out.println("С��100kû���и�");
		}
		in.close();
	}*/
	
	//����ļ�
    public static void main(String[] args) {
    	
    	FileInputStream fis = null;
    	FileOutputStream fos = null;
        File f=new File("C:/Users/Administrator/Desktop/1/TeamViewer.exe");
        try {
            fis = new FileInputStream(f);
            //ÿ�ζ�ȡ��
            byte[] b = new byte[100*1024];
            int size;
            int count = 0;
            if (f.length() > 100*1024) {
            	
            	//���һ�ζ�ȡ���� f.leng() % (100*1024)
            	while((size = fis.read(b,0,b.length)) != -1){
                    String str = "C:/Users/Administrator/Desktop/1/TeamViewer.exe-";
                    str += count;
                    fos = new FileOutputStream(str);
                    count ++;
                    fos.write(b, 0, size);
                    fos.flush();
                }
			}else {
				System.out.println("�ļ�С��100k����Ҫ�и�");
			}
        }catch (IOException e) {
            System.out.println(e.getStackTrace());
        }finally {
        	try {
				fos.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
    }
}

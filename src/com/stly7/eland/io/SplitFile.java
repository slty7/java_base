package com.stly7.eland.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 找到一个大于100k的文件，按照100k为单位，拆分成多个子文件，并且以编号作为文件名结束。
	比如文件 eclipse.exe，大小是309k。
	拆分之后，成为 
	eclipse.exe-0
	eclipse.exe-1
	eclipse.exe-2
	eclipse.exe-3
 * @author Administrator
 *
 */
public class SplitFile {
	
/*	public static void main(String[] args) throws Exception {
		
		//再定义一个计数器用于添加后缀
		String path = "C:/Users/Administrator/Desktop/1/TeamViewer.exe";
		File file = new File(path);
		
		FileInputStream in = new FileInputStream(file);
		//一次读取这个文件的字节流
		byte[] in_cache = new byte[(int) file.length()];
		
		//每次写出100 * 1024的字节流
		byte[] out_cache = new byte[1024 * 100];
		//最后一个拆分一定要对的上数组的长度不然会赋值进去的
		byte[] end_out_cache = new byte[in_cache.length % (1024 * 100)];
		
		FileOutputStream out = null;
		//遍历并且盘点头尾的问题
		//此判断主要用 < 100K的文件
		if (in_cache.length >= out_cache.length) {
			//> 100k的几种情况
			for (int i = 0; i <= in_cache.length / (100 * 1024); i++) {
				out = new FileOutputStream(new File(path + i));
				if (i == 0 && in_cache.length > out_cache.length) {
					System.arraycopy(in_cache, 0, end_out_cache, 0, end_out_cache.length);
					out.write(out_cache);
					System.out.println("输出子文件夹-->(" + path + i + ")--size:" + out_cache.length + "个byte");
				}else if(i > 0 && i < in_cache.length / (100 * 1024)) {
					System.arraycopy(in_cache, i * (100 * 1024) - 1, out_cache, 0, out_cache.length);
					out.write(out_cache);
					System.out.println("输出子文件夹-->(" + path + i + ")--size:" + out_cache.length + "个byte");
				}else if(i == in_cache.length / (100 * 1024) && i > 0) {
					System.arraycopy(in_cache, i * (100 * 1024) - 1, end_out_cache, 0, end_out_cache.length);
					out.write(end_out_cache);
					System.out.println("输出子文件夹-->(" + path + i + ")--size:" + end_out_cache.length + "个byte");
				}else{
					break;
				}
				
				out.close();
			}
		}else {
			System.out.println("小于100k没法切割");
		}
		in.close();
	}*/
	
	//拆分文件
    public static void main(String[] args) {
    	
    	FileInputStream fis = null;
    	FileOutputStream fos = null;
        File f=new File("C:/Users/Administrator/Desktop/1/TeamViewer.exe");
        try {
            fis = new FileInputStream(f);
            //每次读取的
            byte[] b = new byte[100*1024];
            int size;
            int count = 0;
            if (f.length() > 100*1024) {
            	
            	//最后一次读取就是 f.leng() % (100*1024)
            	while((size = fis.read(b,0,b.length)) != -1){
                    String str = "C:/Users/Administrator/Desktop/1/TeamViewer.exe-";
                    str += count;
                    fos = new FileOutputStream(str);
                    count ++;
                    fos.write(b, 0, size);
                    fos.flush();
                }
			}else {
				System.out.println("文件小于100k不需要切割");
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

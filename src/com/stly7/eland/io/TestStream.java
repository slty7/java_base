package com.stly7.eland.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/**
 * 如果用记事本根据UTF-8编码保存汉字就会在最前面生成一段标示符，
 * 这个标示符用于表示该文件是使用UTF-8编码的。
 * 找出这段标示符对应的十六进制，并且开发一个方法，自动去除这段标示符
 * @author Administrator
 *
 */
public class TestStream {
	 
    public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException {
        File f = new File("d:\\test.txt");
        System.out.println("默认编码方式:"+Charset.defaultCharset());
        //FileReader得到的是字符，所以一定是已经把字节根据某种编码识别成了字符了
        //而FileReader使用的编码方式是Charset.defaultCharset()的返回值，如果是中文的操作系统，就是GBK
        try (FileReader fr = new FileReader(f)) {
            char[] cs = new char[(int) f.length()];
            fr.read(cs);
            System.out.printf("FileReader会使用默认的编码方式%s,识别出来的字符是：%n",Charset.defaultCharset());
            System.out.println(new String(cs));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //FileReader是不能手动设置编码方式的，为了使用其他的编码方式，只能使用InputStreamReader来代替
        //并且使用new InputStreamReader(new FileInputStream(f),Charset.forName("UTF-8")); 这样的形式
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(f),Charset.forName("UTF-8"))) {
            char[] cs = new char[(int) f.length()];
            isr.read(cs, 0,cs.length);
            System.out.printf("InputStreamReader 指定编码方式UTF-8,识别出来的字符是：%n");
            System.out.println(new String(cs));
            //通过遍历可以知道在传换成char[]数据的时候都已经存在"?"了,如果要去掉 ? 需要在数组中去除
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
         
        //用字节流来读取并且得出16进制的数字
        try (FileInputStream fis = new FileInputStream(f)){
			byte[] b = new byte[3];
			fis.read(b);
			   
            //文件中读出来的数据是
            System.out.println("文件中读出来'?'的数据是：");
            for (byte bs : b)
            {
                int i = bs&0x000000ff;  //只取16进制的后两位
                System.out.print(Integer.toHexString(i) + " ");
                System.out.println();
            }
            
		} catch (Exception e) {
			// TODO: handle exception
		}
        
        
        //用字节流来读取并且得出16进制的数字
        try (FileInputStream fis = new FileInputStream(f)){
			byte[] b = new byte[(int) f.length()];
			fis.read(b);
			System.out.println(new String(b, 3, b.length - 3, "utf-8"));
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
}
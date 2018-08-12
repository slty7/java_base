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
 * ����ü��±�����UTF-8���뱣�溺�־ͻ�����ǰ������һ�α�ʾ����
 * �����ʾ�����ڱ�ʾ���ļ���ʹ��UTF-8����ġ�
 * �ҳ���α�ʾ����Ӧ��ʮ�����ƣ����ҿ���һ���������Զ�ȥ����α�ʾ��
 * @author Administrator
 *
 */
public class TestStream {
	 
    public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException {
        File f = new File("d:\\test.txt");
        System.out.println("Ĭ�ϱ��뷽ʽ:"+Charset.defaultCharset());
        //FileReader�õ������ַ�������һ�����Ѿ����ֽڸ���ĳ�ֱ���ʶ������ַ���
        //��FileReaderʹ�õı��뷽ʽ��Charset.defaultCharset()�ķ���ֵ����������ĵĲ���ϵͳ������GBK
        try (FileReader fr = new FileReader(f)) {
            char[] cs = new char[(int) f.length()];
            fr.read(cs);
            System.out.printf("FileReader��ʹ��Ĭ�ϵı��뷽ʽ%s,ʶ��������ַ��ǣ�%n",Charset.defaultCharset());
            System.out.println(new String(cs));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //FileReader�ǲ����ֶ����ñ��뷽ʽ�ģ�Ϊ��ʹ�������ı��뷽ʽ��ֻ��ʹ��InputStreamReader������
        //����ʹ��new InputStreamReader(new FileInputStream(f),Charset.forName("UTF-8")); ��������ʽ
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(f),Charset.forName("UTF-8"))) {
            char[] cs = new char[(int) f.length()];
            isr.read(cs, 0,cs.length);
            System.out.printf("InputStreamReader ָ�����뷽ʽUTF-8,ʶ��������ַ��ǣ�%n");
            System.out.println(new String(cs));
            //ͨ����������֪���ڴ�����char[]���ݵ�ʱ���Ѿ�����"?"��,���Ҫȥ�� ? ��Ҫ��������ȥ��
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
         
        //���ֽ�������ȡ���ҵó�16���Ƶ�����
        try (FileInputStream fis = new FileInputStream(f)){
			byte[] b = new byte[3];
			fis.read(b);
			   
            //�ļ��ж�������������
            System.out.println("�ļ��ж�����'?'�������ǣ�");
            for (byte bs : b)
            {
                int i = bs&0x000000ff;  //ֻȡ16���Ƶĺ���λ
                System.out.print(Integer.toHexString(i) + " ");
                System.out.println();
            }
            
		} catch (Exception e) {
			// TODO: handle exception
		}
        
        
        //���ֽ�������ȡ���ҵó�16���Ƶ�����
        try (FileInputStream fis = new FileInputStream(f)){
			byte[] b = new byte[(int) f.length()];
			fis.read(b);
			System.out.println(new String(b, 3, b.length - 3, "utf-8"));
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
}
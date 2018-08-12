package com.stly7.eland.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Test {
	public static void main(String[] args) {
        File f = new File("d:/test.txt");
        try (FileInputStream fis = new FileInputStream(f);) {
            byte[] all = new byte[(int) f.length()];
            fis.read(all);
   
            //�ļ��ж�������������
            System.out.println("�ļ��ж������������ǣ�");
            for (byte b : all)
            {
                int i = b&0x000000ff;  //ֻȡ16���Ƶĺ���λ
                System.out.println(i);
                System.out.println(Integer.toHexString(i));
            }
            System.out.println("��������֣�����GBK��������ȥ��");
            String str = new String(all,"GBK");
            System.out.println(str);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
   
    }
	
	
	/**
	 * UTF-8���� ת��Ϊ��Ӧ�� ����
	 * 
	 * URLEncoder.encode("�Ϻ�", "UTF-8") ---> %E4%B8%8A%E6%B5%B7
	 * URLDecoder.decode("%E4%B8%8A%E6%B5%B7", "UTF-8") --> �� ��
	 * 
	 * convertUTF8ToString("E4B88AE6B5B7")
	 * E4B88AE6B5B7 --> �Ϻ�
	 * 
	 * @param s
	 * @return
	 */
	public static String convertUTF8ToString(String s) {
		if (s == null || s.equals("")) {
			return null;
		}
		
		try {
			s = s.toUpperCase();
 
			int total = s.length() / 2;
			int pos = 0;
 
			byte[] buffer = new byte[total];
			for (int i = 0; i < total; i++) {
 
				int start = i * 2;
 
				buffer[i] = (byte) Integer.parseInt(
						s.substring(start, start + 2), 16);
				pos++;
			}
 
			return new String(buffer, 0, pos, "UTF-8");
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return s;
	}
 
	/**
	 * ���ļ����еĺ���תΪUTF8����Ĵ�,�Ա�����ʱ����ȷ��ʾ�����ļ���.
	 * 
	 * @param s	ԭ��
	 * @return
	 */
	public static String convertStringToUTF8(String s) {
		if (s == null || s.equals("")) {
			return null;
		}
		StringBuffer sb = new StringBuffer();
		try {
			char c;
			for (int i = 0; i < s.length(); i++) {
				c = s.charAt(i);
				if (c >= 0 && c <= 255) {
					sb.append(c);
				} else {
					byte[] b;
 
					b = Character.toString(c).getBytes("utf-8");
 
					for (int j = 0; j < b.length; j++) {
						int k = b[j];
						if (k < 0)
							k += 256;
						sb.append(Integer.toHexString(k).toUpperCase());
						// sb.append("%" +Integer.toHexString(k).toUpperCase());
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
 
		}
		return sb.toString();
	}

}

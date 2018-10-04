package com.stly7.eland.multiplethread.foundkey;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. ����һ��������3������ַ�����������ַ������� ����
 * 2. ����һ���ƽ��̣߳�ʹ����ٷ���ƥ��������� 
 * 3. ����һ����־�̣߳���ӡ���ù���Щ�ַ���ȥƥ�䣬�����־�߳����Ϊ�ػ��߳�
 * ��ʾ�� �ƽ��̰߳���ٷ����ɵĿ����������һ�������У���־�̲߳��ϵĴ�����������ó��������룬����ӡ������ ������������ǿյģ�����Ϣ1�룬������ֲ��ǿյģ��Ͳ�ͣ��ȡ��������ӡ��
 * @author Administrator
 *
 */
public class TestThread {
	public static boolean found = false;
    
    public static void main(String[] args) {
        String password = randomString(3);
        System.out.println("������:" + password);
        List<String> passwords = new ArrayList<>();
         
        new PasswordThread(password,passwords).start();
        // ���ù��ػ��߳�֮��ͻ������һ���߳̽������ػ��߳��Զ�����
        new LogThread(passwords).start();
         
    }
 
    private static String randomString(int length) {
        String pool = "";
        for (short i = '0'; i <= '9'; i++) {
            pool += (char) i;
        }
        for (short i = 'a'; i <= 'z'; i++) {
            pool += (char) i;
        }
        for (short i = 'A'; i <= 'Z'; i++) {
            pool += (char) i;
        }
        char cs[] = new char[length];
        for (int i = 0; i < cs.length; i++) {
            int index = (int) (Math.random() * pool.length());
            cs[i] = pool.charAt(index);
        }
        String result = new String(cs);
        return result;
    }
}

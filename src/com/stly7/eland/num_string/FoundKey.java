package com.stly7.eland.num_string;

import java.util.Random;

/**
 * 1. ����һ��������3������ַ�����������ַ�����Ϊ��������
 * 2. ʹ����ٷ����ɳ�����3���ַ�����ƥ���������ɵ�����
 * Ҫ�� �ֱ�ʹ�ö��forѭ�� �� �ݹ�����������
 * @author Administrator
 *
 */
public class FoundKey {
	
	public static boolean found = false;
	
	public static void main(String[] args) {
		String password = randomString(3);
		System.out.println("������:" + password);
		 
        char[] guessPassword = new char[password.length()];
        generatePassword(guessPassword,password);
	}
	
	// ���ڿ�ʼִ�еĴ�����
	public static void generatePassword(char[] guessPassword,String password){
        generatePassword(guessPassword,0,password);
    }
	// ʹ�õݹ���в�������,ʹ�÷������صķ�ʽ����
	public static void generatePassword(char[] guessPassword, int index, String password) {
		if (found) {
			return ;
		}
		for (short i = '0'; i < 'z'; i++) {
			char c = (char) i;
			
			// �жϴ�Сд
			if (!Character.isLetterOrDigit(c)) {
				continue;
			}
			// �洢����
			guessPassword[index] = c;
			
			// �ݹ�����,���index ����С��2 ���������Ҫ����ʹ�ø÷��������������������
			if (index != guessPassword.length -1) {
				generatePassword(guessPassword,index+1,password);
			}else {
				String guess = new String(guessPassword);
//              System.out.println("��ٳ����������ǣ�" + guess);
                if(guess.equals(password)){
                    System.out.println("�ҵ��ˣ�������" + guess);
                    found =true;
                    return;
                }     
			}
			
		}
	}
	
	
	// ���������
	private static String randomString(int length) {
		Random random = new Random();
		char[] cs = new char[3];
		for (int i = 0; i < cs.length; i++) {
			//�����������һ����0��ʼ��������(2),��������3��������Χ�ڵ�����л�
			int y = random.nextInt(3) + 0;
            if (y == 0) {
                cs[i] = (char)(random.nextInt(9)+49);
            }else if (y==1) {
                cs[i] = (char)(random.nextInt(25)+66);
            }else {
                cs[i] = (char)(random.nextInt(25)+98);
            }
		}
		return new String(cs);
    }
}

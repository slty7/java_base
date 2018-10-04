package com.stly7.eland.num_string;
/**
 * 1. ����һ��������3������ַ�����������ַ�����Ϊ��������
 * 2. ʹ����ٷ����ɳ�����3���ַ�����ƥ���������ɵ�����
 * Ҫ�� �ֱ�ʹ�ö��forѭ�� �� �ݹ�����������
 * @author Administrator
 *
 *
 * ����1ʹ�ö��forѭ�����б�������ƽ�����
 * 
 */
public class FindKey {
	public static void main(String[] args) {
		
		String password = randomString(3);
		System.out.println("������:" + password);
		
		char[] guessPassword = new char[3];
		// ����ʹ�õ��ǹܵ��ķ�ʽ����
        outloop:
        for (short i = '0'; i <= 'z'; i++) {
            for (short j = '0'; j <= 'z'; j++) {
                for (short k = '0'; k <= 'z'; k++) {
                    if (!isLetterOrDigit(i,j,k))
                        continue;
                    guessPassword[0] = (char) i;
                    guessPassword[1] = (char) j;
                    guessPassword[2] = (char) k;
                    String guess = new String(guessPassword);
//                  System.out.println("��ٳ����������ǣ�" + guess);
                     
                    if(guess.equals(password)){
                        System.out.println("�ҵ��ˣ�������" + guess);
                        break outloop;
                    }
                     
                }
            }
        }
    }
	
	// �����������
	private static String randomString(int length) {
		// ���������ʵ���ǰ����е��������г���,Ȼ����random������ָ��
		// ����2,�����ȸ��������ַ����ķ�ΧȻ��,3����Χ���,��Χ�ڵ��ַ����
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
	
	// ��Сд������
	private static boolean isLetterOrDigit(short i, short j, short k) {
        return Character.isLetterOrDigit(i) &&
                Character.isLetterOrDigit(j) &&
                Character.isLetterOrDigit(k) ;
    }
}

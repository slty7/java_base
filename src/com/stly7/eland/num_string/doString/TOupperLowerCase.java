package com.stly7.eland.num_string.doString;
/**
 * �� lengendary �ĳɼ����дСдģʽ���� LeNgEnDaRy
 * @author Administrator
 *
 */
public class TOupperLowerCase {
	
	public static void main(String[] args) {
		String str = "lengendary";
		char[] cs = str.toCharArray();
		char[] cs1 = new char[cs.length];
		char temp;
		
		//ʡ�Դ�ӡ
		for (int i = 0; i < cs.length; i++) {
			if (i % 2 == 0) {
				temp = (cs[i] + "").toUpperCase().charAt(0);
				cs1[i] = temp;
				System.out.print(cs1[i]);
			}else{
				temp = (cs[i] + "").toLowerCase().charAt(0);
				cs1[i] = temp;
				System.out.print(cs1[i]);
			}
			
		}
		
	}
}

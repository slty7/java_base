package com.stly7.eland.num_string;

import java.util.Random;

/**
 * 1. 生成一个长度是3的随机字符串，把这个字符串作为当做密码
 * 2. 使用穷举法生成长度是3个字符串，匹配上述生成的密码
 * 要求： 分别使用多层for循环 和 递归解决上述问题
 * @author Administrator
 *
 */
public class FoundKey {
	
	public static boolean found = false;
	
	public static void main(String[] args) {
		String password = randomString(3);
		System.out.println("密码是:" + password);
		 
        char[] guessPassword = new char[password.length()];
        generatePassword(guessPassword,password);
	}
	
	// 用于开始执行的触发点
	public static void generatePassword(char[] guessPassword,String password){
        generatePassword(guessPassword,0,password);
    }
	// 使用递归进行查找密码,使用方法重载的方式进行
	public static void generatePassword(char[] guessPassword, int index, String password) {
		if (found) {
			return ;
		}
		for (short i = '0'; i < 'z'; i++) {
			char c = (char) i;
			
			// 判断大小写
			if (!Character.isLetterOrDigit(c)) {
				continue;
			}
			// 存储数据
			guessPassword[index] = c;
			
			// 递归的入口,如果index 还是小于2 的情况则需要重新使用该方法进行往数组添加数据
			if (index != guessPassword.length -1) {
				generatePassword(guessPassword,index+1,password);
			}else {
				String guess = new String(guessPassword);
//              System.out.println("穷举出来的秘密是：" + guess);
                if(guess.equals(password)){
                    System.out.println("找到了，密码是" + guess);
                    found =true;
                    return;
                }     
			}
			
		}
	}
	
	
	// 生成随机数
	private static String randomString(int length) {
		Random random = new Random();
		char[] cs = new char[3];
		for (int i = 0; i < cs.length; i++) {
			//这里随机是哪一个从0开始到第三个(2),都是在这3个条件范围内的随机切换
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

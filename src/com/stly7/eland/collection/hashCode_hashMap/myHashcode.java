package com.stly7.eland.collection.hashCode_hashMap;

import java.util.Random;

/**
 * 本练习并不是要求去理解这个算法，而是自定义一个简单的hashcode算法，计算任意字符串的hashcode
 * 因为String类不能被重写，所以我们通过一个静态方法来返回一个String的hashcode
 * 
 * public static int hashcode(String)
 * 如果字符串长度是0，则返回0。
 * 否则： 获取每一位字符，转换成数字后，相加，最后乘以23
 * (s[0]+ s[1] + s[2] + s[3]+ s[n-1])*23.
 * 
 * 如果值超过了1999，则取2000的余数，保证落在0-1999之间。
 * 如果是负数，则取绝对值。
 * 随机生成长度是2-10的不等的100个字符串，打印用本hashcode获取的值分别是多少
 * @author Administrator
 *
 */
public class myHashcode {
	
	public static void main(String[] args) {
		//随机长度
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			int length = (int)(random.nextInt(8) + 2);
			int hashcode = hashcode(random(length));
			System.out.println(hashcode);
		}
	}
	
	
	private static int hashcode(String str) {
		if(0==str.length())
            return 0;
         
        int hashcode = 0;
        char[]cs= str.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            hashcode +=cs[i];
        }
        hashcode*=23;
        //取绝对值
        hashcode = hashcode<0?0-hashcode:hashcode;
        //落在0-1999之间
        hashcode %=2000;
         
        return hashcode;
	}
	
	//获得一个字符串
	private static String random(int length) {
		char[] cs = new char[length];
		
		Random r = new Random();
		for (int i = 0; i < cs.length; i++) {
			//这里随机是哪一个从0开始到第三个(2),都是在这3个条件范围内的随机切换
			int y = r.nextInt(3) + 0;
            if (y == 0) {
                cs[i] = (char)(r.nextInt(9)+49);
            }else if (y==1) {
                cs[i] = (char)(r.nextInt(25)+66);
            }else {
                cs[i] = (char)(r.nextInt(25)+98);
            }
		}
		return new String(cs);
	}
	
}

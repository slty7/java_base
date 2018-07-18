package com.stly7.eland.num_string.string_recover;
/**
 * 参考上述步骤
	把浮点数 3.14 转换为 字符串 "3.14"
	再把字符串 “3.14” 转换为 浮点数 3.14

	如果字符串是 3.1a4，转换为浮点数会得到什么？
 * @author Administrator
 *
 */
public class FloatRecover {
	
	public static void main(String[] args) {
		float f1 = 3.14f;
		//方法1
		String strf = Float.toString(f1);
		//方法2
		String strf2 = String.valueOf(f1);
		
		float f2 = Float.parseFloat(strf);
		
		//如果字符串是 3.1a4，转换为浮点数会得到什么？
		String strf3 = "3.1a4";
		
		//运行时候异常
		float f3 = Float.parseFloat(strf3);
		System.out.println(f3);
		
	}
}

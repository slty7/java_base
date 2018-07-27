package com.stly7.eland.date;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * 准备一个长度是9的日期数组
	使用1970年-2000年之间的随机日期初始化该数组
	按照这些日期的时间进行升序排序
	比如 1988-1-21 12:33:22 就会排在 1978-4-21 19:07:23 前面，因为它的时间更小，虽然日期更大
 * @author Administrator
 *
 */
public class DateArray_sort {
	int length = 9;
	
	static Date[] arr_date = new Date[9];
	//用于存储转换
	static String[] strs = new String[9];
	//用于存String[] 排序后的对比的值
	static Date[] new_arr_date = new Date[9];
	//格式化Date yyyy-MM-dd HH:mm:ss
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	
	//主程序
	public static void main(String[] args) throws Exception {
		DateArray_sort dateArray = new DateArray_sort();
		dateArray.GenDateArrayAndSort();
		
	}
	
	// 生成随机日期数组
	public void GenDateArrayAndSort() throws Exception {
		//便于截取最后一段的字符串
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		for (int i = 0; i < arr_date.length; i++) {
			arr_date[i] = RandomDate();
			//重新创建一个方便剪切的格式
			System.out.println("生成--->" + simpleDateFormat.format(arr_date[i]));
		}
		System.out.println("=================");
		
		// 生成参数
		for (int i = 0; i < strs.length; i++) {
			//这个转换很重要
			strs[i] = sdf.format(arr_date[i]);
		}
		// 排序
		Arrays.sort(strs);
		
		for (int i = 0; i < strs.length; i++) {
			for (int j = 0; j < arr_date.length; j++) {
				//这里一定要用equles,相同的就直接复制到新的数组中
				if (strs[i].equals(sdf.format(arr_date[j]))) {
					new_arr_date[i] = arr_date[j];
				}
			}
		}
		
		// 由于值的通过值排序后一个数组.
		for (Date date : new_arr_date) {
			System.out.println(simpleDateFormat.format(date));
		}
		
	}
	
	// 生成随机日期
	public Date RandomDate() throws Exception {
		
		String end_str = "1999-12-31 23:59:59";
		Date end_date = simpleDateFormat.parse(end_str);
		long r = end_date.getTime() - new Date(0).getTime();
		r = (long) (Math.random() * r);
		
		return new Date(new Date(0).getTime() + r);
	}
	
}

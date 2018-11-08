package com.stly7.eland.anno.test;

import java.lang.reflect.Method;

import com.stly7.eland.anno.hibernate_annotation.MyColumn;
import com.stly7.eland.anno.hibernate_annotation.MyEntity;
import com.stly7.eland.anno.hibernate_annotation.MyGeneratedValue;
import com.stly7.eland.anno.hibernate_annotation.MyId;
import com.stly7.eland.anno.hibernate_annotation.MyTable;
import com.stly7.eland.anno.pojo.Hero;

public class ParseHibernateAnnotation {

	public static void main(String[] args) {

		Class<Hero> clazz = Hero.class;
		// 1. 确定是实体类
		// 2. 对应�?
		// 3. 自增长id是，id策略是，对应字段�?
		// 4. 其他属�?�对应字段是
		MyEntity myEntity = (MyEntity) clazz.getAnnotation(MyEntity.class);
		if (null == myEntity) {
			System.out.println("Hero类不是实体类");
		} else {
			System.out.println("Hero类是实体�?");
			MyTable myTable= (MyTable) clazz.getAnnotation(MyTable.class);
			String tableName = myTable.name();
			System.out.println("其对应的表名�?:" + tableName);
			Method[] methods =clazz.getMethods();
			Method primaryKeyMethod = null;
			for (Method m: methods) {
				MyId myId = m.getAnnotation(MyId.class);
				if(null!=myId){
					primaryKeyMethod = m;
					break;
				}
			}
			
			if(null!=primaryKeyMethod){
				System.out.println("找到主键�?" + method2attribute( primaryKeyMethod.getName() ));
				MyGeneratedValue myGeneratedValue =
				primaryKeyMethod.getAnnotation(MyGeneratedValue.class);
				System.out.println("其自增长策略是：" +myGeneratedValue.strategy());
				MyColumn myColumn = primaryKeyMethod.getAnnotation(MyColumn.class);
				System.out.println("对应数据库中的字段是�?" +myColumn.value());
			}
			System.out.println("其他非主键属性分别对应的数据库字段如下：");
			for (Method m: methods) {
				if(m==primaryKeyMethod){
					continue;
				}
				MyColumn myColumn = m.getAnnotation(MyColumn.class);
				//那些setter方法上是没有MyColumn注解�?
				if(null==myColumn)
					continue;
				System.out.format("属�?�： %s\t对应的数据库字段�?:%s%n",method2attribute(m.getName()),myColumn.value());

			}
			
			
			
		}
		

	}

	private static String method2attribute(String methodName) {
		String result = methodName; ;
		result = result.replaceFirst("get", "");
		result = result.replaceFirst("is", "");
		if(result.length()<=1){
			return result.toLowerCase();
		}
		else{
			return result.substring(0,1).toLowerCase() + result.substring(1,result.length());
		}
		
		
	}
}

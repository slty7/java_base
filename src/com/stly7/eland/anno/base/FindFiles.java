package com.stly7.eland.anno.base;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 使用内部注解的模式
 * @author Administrator
 *为了紧凑起见，把注解作为内部类的形式放在一个文件里。
1. 注解FileTypes，其value()返回一个FileType数组
2. 注解FileType，其@Repeatable的值采用FileTypes
3. 运用注解：在work方法上重复使用多次@FileType注解
4. 解析注解： 在work方法内，通过反射获取到本方法上的FileType类型的注解数组，然后遍历本数组
 *
 */
public class FindFiles {
	
	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.RUNTIME)
	public @interface FileTypes{
		FileType[] value();
	}
	
	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.RUNTIME)
	// 用一个参数形式多次传输
	@Repeatable(FileTypes.class)
	public @interface FileType{
		String value();
	}
	
	@FileType(".java")
	@FileType(".html")
	@FileType(".css")
	@FileType(".js")
	public void work() {
		try {
            FileType[] fileTypes= this.getClass().getMethod("work").getAnnotationsByType(FileType.class);
            System.out.println("将从如下后缀名的文件中查找文件内容");
            for (FileType fileType : fileTypes) {
                System.out.println(fileType.value());
            }
            System.out.println("查找过程略。。。");
        } catch (NoSuchMethodException | SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}
	
	public static void main(String[] args) {
        new FindFiles().work();
    }
}

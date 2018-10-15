package com.stly7.eland.anno.base;

import java.lang.annotation.ElementType;
import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 改造JDBCUtil
 * @author Administrator
 *
 * 接下来，就要把DBUtil这个类改造成为支持自定义注解的方式。 首先创建一个注解JDBCConfig
 * 1. 创建注解类型的时候即不使用class也不使用interface,而是使用@interface
 * public @interface JDBCConfig 
 * 2. 元注解
 * @Target({ElementType.METHOD, ElementType.TYPE}) 表示这个注解可以用用在类/接口上，还可以用在方法上   旧版本{TYPE, METHOD}
 * @Retention(RetentionPolicy.RUNTIME) 表示这是一个运行时注解，即运行起来之后，才获取注解中的相关信息，而不像基本注解如@Override 那种不用运行，在编译时eclipse就可以进行相关工作的编译时注解。
 * @Inherited 表示这个注解可以被子类继承
 * @Documented 表示当执行javadoc的时候，本注解会生成相关文档
 * 请在学习完本知识点最后一个步骤解析注解之后，再查看 元注解，做更详尽的学习。
 * 3. 注解元素，这些注解元素就用于存放注解信息，在解析的时候获取出来
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface JDBCConfig {
	 String ip(); 
	 int port() default 3306; 
	 String database(); 
	 String encoding(); 
	 String loginName(); 
	 String password(); 
}

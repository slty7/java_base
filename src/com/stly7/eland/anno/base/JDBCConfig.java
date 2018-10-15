package com.stly7.eland.anno.base;

import java.lang.annotation.ElementType;
import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ����JDBCUtil
 * @author Administrator
 *
 * ����������Ҫ��DBUtil���������Ϊ֧���Զ���ע��ķ�ʽ�� ���ȴ���һ��ע��JDBCConfig
 * 1. ����ע�����͵�ʱ�򼴲�ʹ��classҲ��ʹ��interface,����ʹ��@interface
 * public @interface JDBCConfig 
 * 2. Ԫע��
 * @Target({ElementType.METHOD, ElementType.TYPE}) ��ʾ���ע�������������/�ӿ��ϣ����������ڷ�����   �ɰ汾{TYPE, METHOD}
 * @Retention(RetentionPolicy.RUNTIME) ��ʾ����һ������ʱע�⣬����������֮�󣬲Ż�ȡע���е������Ϣ�����������ע����@Override ���ֲ������У��ڱ���ʱeclipse�Ϳ��Խ�����ع����ı���ʱע�⡣
 * @Inherited ��ʾ���ע����Ա�����̳�
 * @Documented ��ʾ��ִ��javadoc��ʱ�򣬱�ע�����������ĵ�
 * ����ѧϰ�걾֪ʶ�����һ���������ע��֮���ٲ鿴 Ԫע�⣬�����꾡��ѧϰ��
 * 3. ע��Ԫ�أ���Щע��Ԫ�ؾ����ڴ��ע����Ϣ���ڽ�����ʱ���ȡ����
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

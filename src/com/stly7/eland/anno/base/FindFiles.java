package com.stly7.eland.anno.base;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ʹ���ڲ�ע���ģʽ
 * @author Administrator
 *Ϊ�˽����������ע����Ϊ�ڲ������ʽ����һ���ļ��
1. ע��FileTypes����value()����һ��FileType����
2. ע��FileType����@Repeatable��ֵ����FileTypes
3. ����ע�⣺��work�������ظ�ʹ�ö��@FileTypeע��
4. ����ע�⣺ ��work�����ڣ�ͨ�������ȡ���������ϵ�FileType���͵�ע�����飬Ȼ�����������
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
	// ��һ��������ʽ��δ���
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
            System.out.println("�������º�׺�����ļ��в����ļ�����");
            for (FileType fileType : fileTypes) {
                System.out.println(fileType.value());
            }
            System.out.println("���ҹ����ԡ�����");
        } catch (NoSuchMethodException | SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}
	
	public static void main(String[] args) {
        new FindFiles().work();
    }
}

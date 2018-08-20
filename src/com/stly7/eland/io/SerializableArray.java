package com.stly7.eland.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.stly7.eland.io.item.Hero;

/**
 * 准备一个长度是10，类型是Hero的数组，使用10个Hero对象初始化该数组
 * 然后把该数组序列化到一个文件heros.lol
 * 接着使用ObjectInputStream 读取该文件，并转换为Hero数组，验证该数组中的内容，是否和序列化之前一样
 * @author Administrator
 *
 */
public class SerializableArray {
	public static void main(String[] args) throws Exception {
		seraliz();
		read();
	}
	
	public static void seraliz() {
		Hero[] heros = new Hero[10];
		File file = new File("D:/heros.lol");
		
		try (
			//创建一个对象输出流
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		) {
			for (int i = 0; i < heros.length; i++) {
				heros[i] = new Hero("狗牛" + i, 10 + i);
			}
			oos.writeObject(heros);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void read() {
		File file = new File("D:/heros.lol");
		Hero[] heros = null;
		try (
				//创建一个对象输入流
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			) {
				heros = (Hero[])ois.readObject();
				for (Hero hero : heros) {
					System.out.println(hero.name + ": --> 血量: " + hero.hp);
				}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}

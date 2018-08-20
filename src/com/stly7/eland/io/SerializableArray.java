package com.stly7.eland.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.stly7.eland.io.item.Hero;

/**
 * ׼��һ��������10��������Hero�����飬ʹ��10��Hero�����ʼ��������
 * Ȼ��Ѹ��������л���һ���ļ�heros.lol
 * ����ʹ��ObjectInputStream ��ȡ���ļ�����ת��ΪHero���飬��֤�������е����ݣ��Ƿ�����л�֮ǰһ��
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
			//����һ�����������
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		) {
			for (int i = 0; i < heros.length; i++) {
				heros[i] = new Hero("��ţ" + i, 10 + i);
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
				//����һ������������
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			) {
				heros = (Hero[])ois.readObject();
				for (Hero hero : heros) {
					System.out.println(hero.name + ": --> Ѫ��: " + hero.hp);
				}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}

package com.stly7.eland.collection.hashmap;

import java.util.ArrayList;
import java.util.List;

import com.stly7.eland.collection.bean.Hero;
/**
 * ����ǰ��ѧϰ��hashcode��ԭ����Զ���hashcode, ���һ��MyHashMap��ʵ�ֽӿ�IHashMap

MyHashMap�ڲ���һ��������2000�Ķ�������ʵ�֡�

���put(String key,Object value)����
����ͨ����һ���Զ����ַ�����hashcode��ϰ��ȡ�����ַ�����hashcode,Ȼ������hashcode��Ϊ�±꣬��λ�������ָ��λ�á� 
�����λ��û�����ݣ�����ַ����Ͷ�����ϳɼ�ֵ��Entry���ٴ���һ��LinkedList���Ѽ�ֵ�ԣ��Ž�LinkedList�У�����LinkedList ���������λ�á�
�����λ�������ݣ�һ����һ��LinkedList,����ַ����Ͷ�����ϳɼ�ֵ��Entry�����뵽LinkedList���档

��� Object get(String key) ����
����ͨ����һ���Զ����ַ�����hashcode��ϰ��ȡ�����ַ�����hashcode,Ȼ������hashcode��Ϊ�±꣬��λ�������ָ��λ�á� 
������λ��û�����ݣ��򷵻ؿ�
������λ�������ݣ��򰤸��Ƚ����м�ֵ�Եļ�-�ַ������Ƿ�equals���ҵ�ƥ��ģ��Ѽ�ֵ�Ե�ֵ�����س�ȥ���Ҳ���ƥ��ģ��ͷ��ؿ�
 * @author Administrator
 *
 */
public class List_vs_Map {
	    public static void main(String[] args) {
	        List<Hero> hs =new ArrayList<>();
	        System.out.println("��ʼ����ʼ");
	        for (int i = 0; i < 100000; i++) {
	            Hero h = new Hero("hero-" + random(), i);
	            hs.add(h);
	        }
	        //������Ϊkey
	        //������ͬ��hero������һ��List�У���Ϊvalue
	        MyHashMap heroMap =new MyHashMap();
	        for (Hero h : hs) {
	            List<Hero> list= (List<Hero>) heroMap.get( h.getName());
	            if(list==null){
	                list = new ArrayList<>();
	                heroMap.put(h.getName(), list);
	            }
	            list.add(h);
	        }
	          
	        System.out.println("��ʼ������");
	        System.out.println("��ʼ����");
	        findByIteration(hs);
	        findByMap(heroMap);
	          
	    }
	    private static List<Hero> findByMap(MyHashMap m) {
	        long start =System.currentTimeMillis();
	        List <Hero>result= (List<Hero>) m.get("hero-5555");
	        long end =System.currentTimeMillis();
	        System.out.printf("ͨ��map���ң�һ���ҵ�%d��Ӣ�ۣ���ʱ%d ����%n",result.size(),end-start);
	        return result;
	    }
	    private static List<Hero> findByIteration (List<Hero> hs) {
	        long start =System.currentTimeMillis();
	        List<Hero> result =new ArrayList<>();
	        for (Hero h : hs) {
	            if(h.getName().equals("hero-5555")){
	                result.add(h);
	            }
	        }
	        long end =System.currentTimeMillis();
	        System.out.printf("ͨ��for���ң�һ���ҵ�%d��Ӣ�ۣ���ʱ%d ����%n", result.size(),end-start);
	        return result;
	    }
	    public static int random(){
	        return ((int)(Math.random()*9000)+1000);
	    }
}

package com.stly7.eland.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import com.stly7.eland.collection.bean.Hero;
/**
 * ׼��һ��ArrayList���д��3000000(�������)Hero�����������������,��ʽ��hero-[4λ�����]
 * hero-3229
 * hero-6232
 * hero-9365
 * @author Administrator
 *
 */
public class HashMapSearch {
	
	
	public static void main(String[] args) {
		List<Hero> list = new ArrayList<>();
		HashMapSearch search = new HashMapSearch();
		for (int i = 0; i < 3000000; i++) {
			list.add(new Hero("hero-" + new Random().nextInt(10000), i));
		}
		long start1 = System.currentTimeMillis();
		search.forEch(list);
		long end1 = System.currentTimeMillis();
		System.out.println(end1 - start1);
		
		//������Ϊkey
        //������ͬ��hero������һ��List�У���Ϊvalue
		HashMap<String,List<Hero>> heroMap =new HashMap();
        for (Hero h : list) {
            List<Hero> reustList = heroMap.get( h.getName());
            if(list==null){
            	reustList = new ArrayList<>();
                heroMap.put(h.getName(), reustList);
            }
            reustList.add(h);
        }
		
	}
	
	//��forѭ���ҳ���
	public void forEch(List<Hero> list) {
		// TODO Auto-generated method stub
		List<Hero> heroList = new ArrayList<>();
		for (Hero hero : list) {
			if ("hero-5555".equals(hero.getName())) {
				heroList.add(hero);
			}
		}
		System.err.println(heroList.size());
	}
	
	
	
}

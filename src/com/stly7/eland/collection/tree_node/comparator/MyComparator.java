package com.stly7.eland.collection.tree_node.comparator;

import java.util.Comparator;

import com.stly7.eland.collection.bean.Hero;

public class MyComparator implements Comparator<Hero> {

	@Override
	public int compare(Hero o1, Hero o2) {
		//���ݶ����ĳЩֵ���бȽ�
		return (int) (o1.getHp() - o2.getHp());
	}

}

package com.stly7.eland.io.item;

import java.io.Serializable;

public class Hero implements Serializable {
    //��ʾ����൱ǰ�İ汾��������˱仯����������������ԣ���Ӧ���޸�����汾��
    private static final long serialVersionUID = 1L;
    public String name;
    public float hp;
    
    //����һ���ղι���
    public Hero() {
    	super();
    }
    
    //�ٴ���һ���вι���
    public Hero(String name, float hp) {
    	super();
    	this.name = name;
    	this.hp = hp;
    }

    
	 
}

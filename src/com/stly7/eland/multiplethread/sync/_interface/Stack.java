package com.stly7.eland.multiplethread.sync._interface;

import com.stly7.eland.multiplethread.sync.bean.Hero;

public interface Stack {
		 
    //��Ӣ�����뵽���λ��
    public void push(Hero h);
    //�����һ��Ӣ��ȡ����
    public Hero pull();
    //�鿴���һ��Ӣ��
    public Hero peek();
}

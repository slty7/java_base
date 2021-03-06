package com.stly7.eland.collection.linkedList.interface_;

import com.stly7.eland.collection.linkedList.bean.Hero;

public interface Stack {
	 
    //把英雄推入到最后位置
    public void push(Hero h);
    //把最后一个英雄取出来
    public Hero pull();
    //查看最后一个英雄
    public Hero peek();
}

package com.stly7.eland.collection.tree_node;

import java.util.ArrayList;
import java.util.List;

import com.stly7.eland.collection.bean.Hero;

public class HeroNode {
	
	
	// 左子节点
    public HeroNode leftNode;
    // 右子节点
    public HeroNode rightNode;
    // 值
    public Object value;
    
    //添加
    public void add(Object v) {
    	//起始点是空值,就直接赋值
    	if (null == value) {
			value = v;
		}else {
			//判断是左右节点
			if (((Hero) v).getHp() - ((Hero) value).getHp() <= 0) {
				//判断是否是控制
				if (leftNode == null) {
					//这里是递归用的
					//如果 leftNode = v;
					leftNode = new HeroNode();
				}
				//递归
				leftNode.add(v);
			}else {
				//判断是否是控制
				if (rightNode == null) {
					//这里是递归用的
					//如果 rightNode = v;
					rightNode = new HeroNode();
				}
				//递归
				rightNode.add(v);
			}
		}
    }
    
    //获得排序
    public List<Hero> getValue() {
    	List<Hero> values = new ArrayList<>();
    	
    	//使用递归遍历左边节点的,肯定找到最开始左边的先加入
    	if (null != leftNode) {
			values.addAll(leftNode.getValue());
		}
    	
    	//入口根节点
    	values.add((Hero)value);
    	
    	//右节点
    	if (null != rightNode) {
    		values.addAll(rightNode.getValue());
		}
    	return values;
    }
    
}

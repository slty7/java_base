package com.stly7.eland.collection.tree_node;

import java.util.ArrayList;
import java.util.List;

import com.stly7.eland.collection.bean.Hero;

public class HeroNode {
	
	
	// ���ӽڵ�
    public HeroNode leftNode;
    // ���ӽڵ�
    public HeroNode rightNode;
    // ֵ
    public Object value;
    
    //���
    public void add(Object v) {
    	//��ʼ���ǿ�ֵ,��ֱ�Ӹ�ֵ
    	if (null == value) {
			value = v;
		}else {
			//�ж������ҽڵ�
			if (((Hero) v).getHp() - ((Hero) value).getHp() <= 0) {
				//�ж��Ƿ��ǿ���
				if (leftNode == null) {
					//�����ǵݹ��õ�
					//��� leftNode = v;
					leftNode = new HeroNode();
				}
				//�ݹ�
				leftNode.add(v);
			}else {
				//�ж��Ƿ��ǿ���
				if (rightNode == null) {
					//�����ǵݹ��õ�
					//��� rightNode = v;
					rightNode = new HeroNode();
				}
				//�ݹ�
				rightNode.add(v);
			}
		}
    }
    
    //�������
    public List<Hero> getValue() {
    	List<Hero> values = new ArrayList<>();
    	
    	//ʹ�õݹ������߽ڵ��,�϶��ҵ��ʼ��ߵ��ȼ���
    	if (null != leftNode) {
			values.addAll(leftNode.getValue());
		}
    	
    	//��ڸ��ڵ�
    	values.add((Hero)value);
    	
    	//�ҽڵ�
    	if (null != rightNode) {
    		values.addAll(rightNode.getValue());
		}
    	return values;
    }
    
}

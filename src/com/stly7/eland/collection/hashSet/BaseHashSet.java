package com.stly7.eland.collection.hashSet;

import java.util.AbstractSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
/**
 * һ��HashSet�ײ��
 * @author Administrator
 *
 * @param <E>
 */
public class BaseHashSet<E> extends AbstractSet<E>
implements Set<E>, Cloneable, java.io.Serializable
{
//HashSet���װ��һ��HashMap
private  HashMap<E,Object> map;

private static final Object PRESENT = new Object();

//HashSet�Ĺ��췽����ʼ�����HashMap
public BaseHashSet() {
    map = new HashMap<E,Object>();
}

//��HashSet������Ԫ�أ���ʵ���ǰѸ�Ԫ����Ϊkey�����ӵ�Map��
//value��PRESENT����̬��final�Ķ������е�HashSet��ʹ����ôͬһ������
public boolean add(E e) {
    return map.put(e, PRESENT)==null;
}

//HashSet��size����map��size
public int size() {
    return map.size();
}

//���Set�������Map
public void clear() {
    map.clear();
}
 
//����Set,���ǰ�Map�ļ��ó�������
public Iterator<E> iterator() {
    return map.keySet().iterator();
}

}
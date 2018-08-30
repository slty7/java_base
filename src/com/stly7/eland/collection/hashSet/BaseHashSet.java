package com.stly7.eland.collection.hashSet;

import java.util.AbstractSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
/**
 * 一个HashSet底层的
 * @author Administrator
 *
 * @param <E>
 */
public class BaseHashSet<E> extends AbstractSet<E>
implements Set<E>, Cloneable, java.io.Serializable
{
//HashSet里封装了一个HashMap
private  HashMap<E,Object> map;

private static final Object PRESENT = new Object();

//HashSet的构造方法初始化这个HashMap
public BaseHashSet() {
    map = new HashMap<E,Object>();
}

//向HashSet中增加元素，其实就是把该元素作为key，增加到Map中
//value是PRESENT，静态，final的对象，所有的HashSet都使用这么同一个对象
public boolean add(E e) {
    return map.put(e, PRESENT)==null;
}

//HashSet的size就是map的size
public int size() {
    return map.size();
}

//清空Set就是清空Map
public void clear() {
    map.clear();
}
 
//迭代Set,就是把Map的键拿出来迭代
public Iterator<E> iterator() {
    return map.keySet().iterator();
}

}
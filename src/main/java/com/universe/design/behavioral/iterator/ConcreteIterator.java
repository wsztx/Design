package com.universe.design.behavioral.iterator;

import java.util.List;

/**
 * @author
 * @version v1.1.0
 * @Description 具体迭代器
 * @since jdk1.8
 */
public class ConcreteIterator implements Iterator {
    private List<Object> list=null;
    private int index=-1;
    public ConcreteIterator(List<Object> list) {
        this.list=list;
    }
    public boolean hasNext() {
        if(index<list.size()-1) {
            return true;
        }
        else {
            return false;
        }
    }
    public Object first() {
        index=0;
        Object obj=list.get(index);;
        return obj;
    }
    public Object next() {
        Object obj=null;
        if(this.hasNext()) {
            obj=list.get(++index);
        }
        return obj;
    }
}

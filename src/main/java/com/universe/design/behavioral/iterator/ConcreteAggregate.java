package com.universe.design.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author
 * @version v1.1.0
 * @Description 具体聚合
 * @since jdk1.8
 */
public class ConcreteAggregate implements Aggregate {
    private List<Object> list=new ArrayList<Object>();
    public void add(Object obj) {
        list.add(obj);
    }
    public void remove(Object obj) {
        list.remove(obj);
    }
    public Iterator getIterator() {
        return(new ConcreteIterator(list));
    }
}

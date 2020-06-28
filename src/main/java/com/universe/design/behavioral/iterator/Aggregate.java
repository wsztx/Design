package com.universe.design.behavioral.iterator;

/**
 * 抽象聚合
 */
public interface Aggregate {
    public void add(Object obj);
    public void remove(Object obj);
    public Iterator getIterator();
}

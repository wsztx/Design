package com.universe.design.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author
 * @version v1.1.0
 * @Description 抽象目标
 * @since jdk1.8
 */
abstract class Subject {
    protected List<Observer> observers=new ArrayList<Observer>();
    //增加观察者方法
    public void add(Observer observer) {
        observers.add(observer);
    }
    //删除观察者方法
    public void remove(Observer observer) {
        observers.remove(observer);
    }
    public abstract void notifyObserver(); //通知观察者方法
}

package com.universe.design.behavioral.observer;

/**
 * @author
 * @version v1.1.0
 * @Description 具体目标
 * @since jdk1.8
 */
public class ConcreteSubject extends Subject {
    public void notifyObserver() {
        System.out.println("具体目标发生改变...");
        System.out.println("--------------");

        for(Object obs:observers)
        {
            ((Observer)obs).response();
        }

    }
}

package com.universe.design.behavioral.observer;

/**
 * @author
 * @version v1.1.0
 * @Description 具体观察者1
 * @since jdk1.8
 */
public class ConcreteObserver1 implements Observer {
    public void response() {
        System.out.println("具体观察者1作出反应！");
    }
}

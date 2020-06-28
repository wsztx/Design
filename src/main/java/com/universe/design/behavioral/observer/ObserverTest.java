package com.universe.design.behavioral.observer;

/**
 * @author
 * @version v1.1.0
 * @Description 观察者模式测试
 * @since jdk1.8
 */
public class ObserverTest {
    public static void main(String[] args) {
        Subject subject=new ConcreteSubject();
        Observer obs1 = new ConcreteObserver1();
        Observer obs2 = new ConcreteObserver2();
        subject.add(obs1);
        subject.add(obs2);
        subject.notifyObserver();
    }
}

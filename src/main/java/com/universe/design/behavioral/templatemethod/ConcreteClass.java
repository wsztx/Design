package com.universe.design.behavioral.templatemethod;

/**
 * @author
 * @version v1.1.0
 * @Description 具体子类
 * @since jdk1.8
 */
public class ConcreteClass extends AbstractClass {

    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");
    }
    public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用...");
    }
}

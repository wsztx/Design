package com.universe.design.creational.builder;

/**
 * @author zhoutianxiang
 * @version v1.1.0
 * @Description 具体的建造者
 * @since jdk1.8
 */
public class ConcreteBuilder extends Builder {
    public void buildPartA() {
        System.out.println("创建部件A");
    }

    public void buildPartB() {
        System.out.println("创建部件B");
    }

    public void buildPartC() {
        System.out.println("创建部件C");
    }
}

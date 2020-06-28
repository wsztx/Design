package com.universe.design.creational.abstractfactory;

/**
 * @author zhoutianxiang
 * @version v1.1.0
 * @Description
 * @since jdk1.8
 */
public class ConcreteFactory implements AbstractFactory {

    public Product newProduct1() {
        Product product = new ConcreteProduct1();
        System.out.println("生产具体产品1号");
        return product;
    }

    public Product newProduct2() {
        Product product = new ConcreteProduct2();
        System.out.println("生产具体产品2号");
        return product;
    }
}

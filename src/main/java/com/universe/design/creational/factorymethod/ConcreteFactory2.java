package com.universe.design.creational.factorymethod;

/**
 * @author zhoutianxiang
 * @version v1.1.0
 * @Description
 * @since jdk1.8
 */
public class ConcreteFactory2 implements AbstractFactory {

    public Product newProduct() {
        Product product = new ConcreteProduct2();
        return product;
    }

}

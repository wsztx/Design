package com.universe.design.creational.builder;

/**
 * @author zhoutianxiang
 * @version v1.1.0
 * @Description 抽象建造者
 * @since jdk1.8
 */
abstract class Builder {

    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();

    protected Product product = new Product();

    public Product getResult(){
        return product;
    }
}

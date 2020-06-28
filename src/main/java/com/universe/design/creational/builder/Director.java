package com.universe.design.creational.builder;

/**
 * @author zhoutianxiang
 * @version v1.1.0
 * @Description 指挥者
 * @since jdk1.8
 */
public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public Product construct()
    {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}

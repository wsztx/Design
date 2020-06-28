package com.universe.design.creational.builder;

/**
 * @author zhoutianxiang
 * @version v1.1.0
 * @Description 客户端测试类
 * @since jdk1.8
 */
public class Client {

    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
    }

}

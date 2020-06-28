package com.universe.design.structural.decorator;

/**
 * @author
 * @version v1.1.0
 * @Description 装饰模式测试
 * @since jdk1.8
 */
public class DecoratorPattern {

    public static void main(String[] args) {
        Component p=new ConcreteComponent();
        p.operation();
        System.out.println("---------------------------------");
        Component d=new ConcreteDecorator(p);
        d.operation();
    }

}

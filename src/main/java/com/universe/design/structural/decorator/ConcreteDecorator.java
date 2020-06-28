package com.universe.design.structural.decorator;

/**
 * @author
 * @version v1.1.0
 * @Description 具体装饰角色
 * @since jdk1.8
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }
    public void operation() {
        super.operation();
        addedFunction();
    }
    public void addedFunction() {
        System.out.println("为具体构件角色增加额外的功能addedFunction()");
    }

}

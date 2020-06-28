package com.universe.design.structural.decorator;

/**
 * @author
 * @version v1.1.0
 * @Description 抽象装饰角色
 * @since jdk1.8
 */
public class Decorator implements Component {

    private Component component;
    public Decorator(Component component) {
        this.component=component;
    }
    public void operation() {
        component.operation();
    }

}

package com.universe.design.behavioral.state;

/**
 * @author
 * @version v1.1.0
 * @Description 具体状态A类
 * @since jdk1.8
 */
public class ConcreteStateA extends State {
    public void handle(Context context) {
        System.out.println("当前状态是 A.");
        context.setState(new ConcreteStateB());
    }
}

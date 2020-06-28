package com.universe.design.structural.bridge;

/**
 * @author zhoutianxiang
 * @version v1.1.0
 * @Description 桥接模式测试
 * @since jdk1.8
 */
public class BridgeTest {

    public static void main(String[] args) {
        Implementor implementor = new ConcreteImplementorA();
        Abstraction refinedAbstraction = new RefinedAbstraction(implementor);
        refinedAbstraction.operation();
    }
}

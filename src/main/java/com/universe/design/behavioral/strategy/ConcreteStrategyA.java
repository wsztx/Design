package com.universe.design.behavioral.strategy;

/**
 * @author
 * @version v1.1.0
 * @Description 具体策略类A
 * @since jdk1.8
 */
public class ConcreteStrategyA implements Strategy {

    public void strategyMethod() {
        System.out.println("具体策略A的策略方法被访问！");
    }

}

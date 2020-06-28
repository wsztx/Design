package com.universe.design.behavioral.strategy;

/**
 * @author
 * @version v1.1.0
 * @Description 具体策略类B
 * @since jdk1.8
 */
public class ConcreteStrategyB implements Strategy {
    public void strategyMethod() {
        System.out.println("具体策略B的策略方法被访问！");
    }
}

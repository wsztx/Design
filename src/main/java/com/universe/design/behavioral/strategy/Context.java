package com.universe.design.behavioral.strategy;

/**
 * @author
 * @version v1.1.0
 * @Description 环境类
 * @since jdk1.8
 */
public class Context {
    private Strategy strategy;
    public Strategy getStrategy() {
        return strategy;
    }
    public void setStrategy(Strategy strategy) {
        this.strategy=strategy;
    }
    public void strategyMethod() {
        strategy.strategyMethod();
    }
}

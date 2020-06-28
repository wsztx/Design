package com.universe.design.behavioral.strategy;

/**
 * @author
 * @version v1.1.0
 * @Description 策略模式测试
 * @since jdk1.8
 */
public class StrategyTest {

    public static void main(String[] args) {
        Context c=new Context();
        Strategy s=new ConcreteStrategyA();
        c.setStrategy(s);
        c.strategyMethod();
        System.out.println("-----------------");
        s=new ConcreteStrategyB();
        c.setStrategy(s);
        c.strategyMethod();
    }

}

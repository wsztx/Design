package com.universe.design.structural.bridge;

/**
 * @author zhoutianxiang
 * @version v1.1.0
 * @Description 抽象化角色
 * @since jdk1.8
 */
abstract class Abstraction {
    protected Implementor implementor;
    protected Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }
    public abstract void operation();
}

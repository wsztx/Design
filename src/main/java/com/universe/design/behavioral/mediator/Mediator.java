package com.universe.design.behavioral.mediator;

/**
 * @author
 * @version v1.1.0
 * @Description 抽象中介者
 * @since jdk1.8
 */
abstract class Mediator {
    public abstract void register(Colleague colleague);
    public abstract void relay(Colleague cl); //转发
}

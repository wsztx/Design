package com.universe.design.behavioral.mediator;

/**
 * @author
 * @version v1.1.0
 * @Description 抽象同事类
 * @since jdk1.8
 */
abstract class Colleague {
    protected Mediator mediator;
    public void setMedium(Mediator mediator)
    {
        this.mediator=mediator;
    }
    public abstract void receive();
    public abstract void send();
}

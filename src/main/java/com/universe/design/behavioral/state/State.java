package com.universe.design.behavioral.state;

/**
 * @author
 * @version v1.1.0
 * @Description 抽象状态类
 * @since jdk1.8
 */
abstract class State {
    public abstract void handle(Context context);
}

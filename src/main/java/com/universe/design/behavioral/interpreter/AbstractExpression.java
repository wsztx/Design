package com.universe.design.behavioral.interpreter;

/**
 * 抽象表达式类
 */
public interface AbstractExpression {
    public Object interpret(String info);    //解释方法
}

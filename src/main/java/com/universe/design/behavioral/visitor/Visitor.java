package com.universe.design.behavioral.visitor;

/**
 * 抽象访问者
 */
public interface Visitor {
    void visit(ConcreteElementA element);
    void visit(ConcreteElementB element);
}

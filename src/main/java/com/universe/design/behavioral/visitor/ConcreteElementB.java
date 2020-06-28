package com.universe.design.behavioral.visitor;

/**
 * @author
 * @version v1.1.0
 * @Description 具体元素类
 * @since jdk1.8
 */
public class ConcreteElementB implements Element {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public String operationB() {
        return "具体元素B的操作。";
    }
}

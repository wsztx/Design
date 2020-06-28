package com.universe.design.behavioral.visitor;

/**
 * @author
 * @version v1.1.0
 * @Description 具体访问者A类
 * @since jdk1.8
 */
public class ConcreteVisitorA implements Visitor {
    public void visit(ConcreteElementA element) {
        System.out.println("具体访问者A访问-->"+element.operationA());
    }
    public void visit(ConcreteElementB element) {
        System.out.println("具体访问者A访问-->"+element.operationB());
    }
}

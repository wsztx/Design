package com.universe.design.behavioral.visitor;

/**
 * @author
 * @version v1.1.0
 * @Description 访问者模式测试类
 * @since jdk1.8
 */
public class VisitorTest {
    public static void main(String[] args) {
        ObjectStructure os=new ObjectStructure();
        os.add(new ConcreteElementA());
        os.add(new ConcreteElementB());
        Visitor visitor=new ConcreteVisitorA();
        os.accept(visitor);
        System.out.println("------------------------");
        visitor=new ConcreteVisitorB();
        os.accept(visitor);
    }
}

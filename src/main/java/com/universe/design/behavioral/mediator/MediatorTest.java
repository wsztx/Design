package com.universe.design.behavioral.mediator;

/**
 * @author
 * @version v1.1.0
 * @Description 中介者模式测试
 * @since jdk1.8
 */
public class MediatorTest {
    public static void main(String[] args) {
        Mediator md=new ConcreteMediator();
        Colleague c1,c2;
        c1=new ConcreteColleague1();
        c2=new ConcreteColleague2();
        md.register(c1);
        md.register(c2);
        c1.send();
        System.out.println("-------------");
        c2.send();
    }
}

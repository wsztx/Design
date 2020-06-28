package com.universe.design.behavioral.chainofresponsibility;

/**
 * @author
 * @version v1.1.0
 * @Description 责任链模式测试
 * @since jdk1.8
 */
public class ChainOfResponsibilityTest {
    public static void main(String[] args) {
        //组装责任链
        Handler handler1=new ConcreteHandler1();
        Handler handler2=new ConcreteHandler2();
        handler1.setNext(handler2);
        //提交请求
        handler1.handleRequest("two");
    }
}

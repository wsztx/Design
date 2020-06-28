package com.universe.design.behavioral.chainofresponsibility;

/**
 * @author
 * @version v1.1.0
 * @Description 具体处理角色2
 * @since jdk1.8
 */
public class ConcreteHandler2 extends Handler {

    public void handleRequest(String request) {
        if(request.equals("two")) {
            System.out.println("具体处理者2负责处理该请求！");
        } else {
            if(getNext()!=null) {
                getNext().handleRequest(request);
            }
            else {
                System.out.println("没有人处理该请求！");
            }
        }
    }
}

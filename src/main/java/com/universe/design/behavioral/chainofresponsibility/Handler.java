package com.universe.design.behavioral.chainofresponsibility;

/**
 * @author
 * @version v1.1.0
 * @Description 抽象处理者
 * @since jdk1.8
 */
abstract class Handler {
    private Handler next;
    public void setNext(Handler next) {
        this.next=next;
    }
    public Handler getNext() {
        return next;
    }
    //处理请求的方法
    public abstract void handleRequest(String request);
}

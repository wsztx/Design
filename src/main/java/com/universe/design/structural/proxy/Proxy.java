package com.universe.design.structural.proxy;

/**
 * @author zhoutianxiang
 * @version v1.1.0
 * @Description 代理对象
 * @since jdk1.8
 */
public class Proxy implements Subject {

    private RealSubject realSubject;

    public void request() {
        if(realSubject == null){
            realSubject = new RealSubject();
        }

        preRequest();
        realSubject.request();
        postRequest();
    }

    public void preRequest(){
        System.out.println("请求前方法");
    }

    public void postRequest(){
        System.out.println("请求后方法");
    }
}

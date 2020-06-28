package com.universe.design.structural.proxy;

/**
 * @author zhoutianxiang
 * @version v1.1.0
 * @Description 真实主题
 * @since jdk1.8
 */
public class RealSubject implements Subject {

    public void request() {
        System.out.println("真实主题方法");
    }

}

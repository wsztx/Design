package com.universe.design.structural.adapter;

/**
 * @author zhoutianxiang
 * @version v1.1.0
 * @Description
 * @since jdk1.8
 */
public class ObjectAdapterTest {

    public static void main(String[] args) {
        System.out.println("对象适配器模式测试：");
        Adaptee adaptee = new Adaptee();
        Target target = new ObjectAdapter(adaptee);
        target.request();
    }

}

package com.universe.design.structural.adapter;

/**
 * @author zhoutianxiang
 * @version v1.1.0
 * @Description 适配者测试
 * @since jdk1.8
 */
public class ClassAdapterTest {

    public static void main(String[] args) {
        System.out.println("类适配器模式测试：");
        Target t = new ClassAdapter();
        t.request();
    }
}

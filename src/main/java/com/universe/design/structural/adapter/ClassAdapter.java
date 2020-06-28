package com.universe.design.structural.adapter;

/**
 * @author zhoutianxiang
 * @version v1.1.0
 * @Description
 * @since jdk1.8
 */
public class ClassAdapter extends Adaptee implements Target {

    public void request() {
        specialRequest();
    }
}

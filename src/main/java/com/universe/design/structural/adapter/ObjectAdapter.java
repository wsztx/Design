package com.universe.design.structural.adapter;

/**
 * @author zhoutianxiang
 * @version v1.1.0
 * @Description 对象适配者
 * @since jdk1.8
 */
public class ObjectAdapter implements Target {

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    public void request() {
        adaptee.specialRequest();
    }

}

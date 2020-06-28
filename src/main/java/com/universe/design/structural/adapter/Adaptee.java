package com.universe.design.structural.adapter;

/**
 * @author zhoutianxiang
 * @version v1.1.0
 * @Description 适配者接口
 * @since jdk1.8
 */
public class Adaptee {

    public void specialRequest(){
        System.out.println("调用适配者接口中的请求");
    }

}

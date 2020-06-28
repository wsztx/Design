package com.universe.design.creational.prototype;

/**
 * @author zhoutianxaing
 * @version v1.1.0
 * @Description
 * @since jdk1.8
 */
public class Realizetype implements Cloneable {

    public Realizetype(){
        System.out.println("具体原型类创建成功");
    }

    public Object clone() throws CloneNotSupportedException{
        System.out.println("复制原型成功");
        return (Realizetype)super.clone();
    }

}

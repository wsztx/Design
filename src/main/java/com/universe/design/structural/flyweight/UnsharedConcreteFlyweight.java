package com.universe.design.structural.flyweight;

/**
 * @author
 * @version v1.1.0
 * @Description 非享元角色
 * @since jdk1.8
 */
public class UnsharedConcreteFlyweight {
    private String info;
    UnsharedConcreteFlyweight(String info) {
        this.info=info;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info=info;
    }
}

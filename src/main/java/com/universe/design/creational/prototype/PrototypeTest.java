package com.universe.design.creational.prototype;

/**
 * @author zhoutianxiang
 * @version v1.1.0
 * @Description
 * @since jdk1.8
 */
public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype real = new Realizetype();
        Realizetype real1 = (Realizetype)real.clone();
        System.out.println(real == real1);
    }
}

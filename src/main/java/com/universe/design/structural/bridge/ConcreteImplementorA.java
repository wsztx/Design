package com.universe.design.structural.bridge;

/**
 * @author zhoutianxiang
 * @version v1.1.0
 * @Description 具体实现化角色
 * @since jdk1.8
 */
public class ConcreteImplementorA implements Implementor {

    public void operationImpl() {
        System.out.println("具体实现化(Concrete Implementor)角色被访问");
    }

}

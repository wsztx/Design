package com.universe.design.structural.bridge;

/**
 * @author zhoutianxiang
 * @version v1.1.0
 * @Description 扩展抽象化角色
 * @since jdk1.8
 */
public class RefinedAbstraction extends Abstraction {

    protected RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    public void operation() {
        System.out.println("扩展抽象化(Refined Abstraction)角色被访问" );
        implementor.operationImpl();
    }
}

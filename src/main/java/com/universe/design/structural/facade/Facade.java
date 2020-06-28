package com.universe.design.structural.facade;

/**
 * @author
 * @version v1.1.0
 * @Description 外观角色
 * @since jdk1.8
 */
public class Facade {

    private SubSystem01 obj1=new SubSystem01();
    private SubSystem02 obj2=new SubSystem02();
    private SubSystem03 obj3=new SubSystem03();
    public void method()
    {
        obj1.method1();
        obj2.method2();
        obj3.method3();
    }

}

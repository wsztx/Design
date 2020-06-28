package com.universe.design.behavioral.templatemethod;

/**
 * @author
 * @version v1.1.0
 * @Description 模板方法模式测试
 * @since jdk1.8
 */
public class TemplateMethodTest {

    public static void main(String[] args) {
        AbstractClass tm=new ConcreteClass();
        tm.TemplateMethod();
    }
}

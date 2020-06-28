package com.universe.design.behavioral.interpreter;

/**
 * @author
 * @version v1.1.0
 * @Description 解释器模式环境类
 * @since jdk1.8
 */
public class Context {
    private AbstractExpression exp;
    public Context() {
        //数据初始化
    }
    public void operation(String info) {
        //调用相关表达式类的解释方法
    }
}

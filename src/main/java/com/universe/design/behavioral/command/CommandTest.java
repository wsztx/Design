package com.universe.design.behavioral.command;

/**
 * @author
 * @version v1.1.0
 * @Description 命令模式测试
 * @since jdk1.8
 */
public class CommandTest {
    public static void main(String[] args) {
        Command cmd=new ConcreteCommand();
        Invoker ir=new Invoker(cmd);
        System.out.println("客户访问调用者的call()方法...");
        ir.call();
    }
}

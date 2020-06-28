package com.universe.design.behavioral.command;

/**
 * @author
 * @version v1.1.0
 * @Description 命令模式调用者
 * @since jdk1.8
 */
public class Invoker {

    private Command command;
    public Invoker(Command command) {
        this.command=command;
    }
    public void setCommand(Command command) {
        this.command=command;
    }
    public void call() {
        System.out.println("调用者执行命令command...");
        command.execute();
    }
}

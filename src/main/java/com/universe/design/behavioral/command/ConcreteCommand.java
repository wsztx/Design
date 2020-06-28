package com.universe.design.behavioral.command;

/**
 * @author
 * @version v1.1.0
 * @Description 具体命令
 * @since jdk1.8
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;
    ConcreteCommand() {
        receiver=new Receiver();
    }
    public void execute() {
        receiver.action();
    }
}

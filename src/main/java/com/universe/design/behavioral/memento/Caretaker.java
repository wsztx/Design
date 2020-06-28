package com.universe.design.behavioral.memento;

/**
 * @author
 * @version v1.1.0
 * @Description 管理者
 * @since jdk1.8
 */
public class Caretaker {
    private Memento memento;
    public void setMemento(Memento m) {
        memento=m;
    }
    public Memento getMemento() {
        return memento;
    }
}

package com.universe.design.behavioral.memento;

/**
 * @author
 * @version v1.1.0
 * @Description 发起人
 * @since jdk1.8
 */
public class Originator {
    private String state;
    public void setState(String state) {
        this.state=state;
    }
    public String getState() {
        return state;
    }
    public Memento createMemento() {
        return new Memento(state);
    }
    public void restoreMemento(Memento m) {
        this.setState(m.getState());
    }
}

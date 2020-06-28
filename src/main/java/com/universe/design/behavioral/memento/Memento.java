package com.universe.design.behavioral.memento;

/**
 * @author
 * @version v1.1.0
 * @Description 备忘录
 * @since jdk1.8
 */
public class Memento {
    private String state;
    public Memento(String state) {
        this.state=state;
    }
    public void setState(String state) {
        this.state=state;
    }
    public String getState() {
        return state;
    }
}

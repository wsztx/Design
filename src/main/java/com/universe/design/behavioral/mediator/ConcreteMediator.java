package com.universe.design.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author
 * @version v1.1.0
 * @Description 具体中介者
 * @since jdk1.8
 */
public class ConcreteMediator extends Mediator {
    private List<Colleague> colleagues=new ArrayList<Colleague>();
    public void register(Colleague colleague) {
        if(!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMedium(this);
        }
    }
    public void relay(Colleague cl) {
        for(Colleague ob:colleagues) {
            if(!ob.equals(cl)) {
                ((Colleague)ob).receive();
            }
        }
    }
}

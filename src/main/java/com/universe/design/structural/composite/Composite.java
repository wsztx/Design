package com.universe.design.structural.composite;

import java.util.ArrayList;

/**
 * @author
 * @version v1.1.0
 * @Description 树枝构件
 * @since jdk1.8
 */
public class Composite implements Component {
    private ArrayList<Component> children=new ArrayList<Component>();
    public void add(Component c) {
        children.add(c);
    }
    public void remove(Component c) {
        children.remove(c);
    }
    public Component getChild(int i) {
        return children.get(i);
    }
    public void operation() {
        for(Object obj:children)
        {
            ((Component)obj).operation();
        }
    }
}

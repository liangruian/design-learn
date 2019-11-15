package com.lra.designlearn.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author Anglar
 * @Date 2019/11/12 9:27
 * @Version V1.0
 * 树枝节点
 **/
public class Composite implements Component {

    private List<Component> components = new ArrayList<>();

    private String name;

    public Composite(String name) {
        this.name = name;
    }

    public void remove(Component c) {
        components.remove(c);
    }

    public void add(Component c) {
        components.add(c);
    }

    public Component get(int i) {
        return components.get(i);
    }

    @Override
    public void operation() {
        System.out.println("树枝节点：" + name);
        components.forEach(Component::operation);
    }

    public static void main(String[] args) {
        Composite c0 = new Composite("树枝1");
        Composite c1 = new Composite("树枝2");
        Component leaf1 = new Leaf("1");
        Component leaf2 = new Leaf("2");
        Component leaf3 = new Leaf("3");
        c0.add(leaf1);
        c0.add(c1);
        c1.add(leaf2);
        c1.add(leaf3);
        c0.operation();
    }
}

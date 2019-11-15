package com.lra.designlearn.structure.composite;

/**
 * @Description
 * @Author Anglar
 * @Date 2019/11/12 9:26
 * @Version V1.0
 * 叶子节点
 **/
public class Leaf implements Component {

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("叶子节点：" + name);
    }
}

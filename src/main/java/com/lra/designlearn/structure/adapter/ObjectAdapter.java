package com.lra.designlearn.structure.adapter;

/**
 * @Description
 * @Author Anglar
 * @Date 2019/11/11 12:05
 * @Version V1.0
 * 类适配器 耦合度 比类适配器低
 **/
public class ObjectAdapter implements Target {

    private Adaptee adaptee;

    @Override
    public void targetMethod() {
        adaptee.show();
    }

    public static void main(String[] args) {
        Target adapter = new ObjectAdapter();
        adapter.targetMethod();
    }
}

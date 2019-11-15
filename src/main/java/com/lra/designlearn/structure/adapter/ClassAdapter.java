package com.lra.designlearn.structure.adapter;

/**
 * @Description
 * @Author Anglar
 * @Date 2019/11/11 12:03
 * @Version V1.0
 * 类适配器 耦合度 比较高
 **/
public class ClassAdapter extends Adaptee implements Target {

    @Override
    public void targetMethod() {
        super.show();
    }

    public static void main(String[] args) {
        Target target = new ClassAdapter();
        target.targetMethod();
    }
}

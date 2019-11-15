package com.lra.designlearn.structure.bridge;

/**
 * @Description
 * @Author Anglar
 * @Date 2019/11/11 13:26
 * @Version V1.0
 * 具体抽象角色
 **/
public class ConcreteImplementorA implements Implementor {
    @Override
    public void show() {
        System.out.println("souw");
    }
}

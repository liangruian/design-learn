package com.lra.designlearn.structure.decorator;

/**
 * @Description
 * @Author Anglar
 * @Date 2019/11/11 15:33
 * @Version V1.0
 * 抽象装饰角色
 **/
public class Decorator implements Component{

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }

}

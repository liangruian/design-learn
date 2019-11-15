package com.lra.designlearn.structure.decorator;

/**
 * @Description
 * @Author Anglar
 * @Date 2019/11/11 15:35
 * @Version V1.0
 **/
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    public void operation(){
        super.operation();
        addeFunction();
    }

    public void addeFunction(){
        System.out.println("额外功能");
    }

    public static void main(String[] args) {
        ConreterComponent component = new ConreterComponent();

        ConcreteDecorator decorator = new ConcreteDecorator(component);
        ConcreteDecorator decorator1 = new ConcreteDecorator(decorator);
        decorator1.operation();
    }
}

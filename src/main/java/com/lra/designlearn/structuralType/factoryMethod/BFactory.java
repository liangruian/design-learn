package com.lra.designlearn.structuralType.factoryMethod;

/**
 * @Description
 * @Author Anglar
 * @Date 2019/10/16 16:50
 * @Version V1.0
 **/
public class BFactory implements AbstractFactory {
    @Override
    public Product product() {
        return new BProduct();
    }
}

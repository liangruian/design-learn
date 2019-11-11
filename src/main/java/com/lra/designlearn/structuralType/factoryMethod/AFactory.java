package com.lra.designlearn.structuralType.factoryMethod;

/**
 * @Description
 * @Author Anglar
 * @Date 2019/10/16 16:49
 * @Version V1.0
 **/
public class AFactory implements AbstractFactory {
    @Override
    public Product product() {
        return new AProduct();
    }
}

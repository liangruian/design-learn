package com.lra.designlearn.structuralType.abstractFactory;

/**
 * @Description
 * @Author Anglar
 * @Date 2019/10/16 17:40
 * @Version V1.0
 **/
public class A_Fram implements Fram{
    @Override
    public Animal newAnimal() {
        return new A_Amimal();
    }

    @Override
    public Plant newPlant() {
        return new A_Plant();
    }
}

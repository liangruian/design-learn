package com.lra.designlearn.structuralType.abstractFactory;

/**
 * @Description
 * @Author Anglar
 * @Date 2019/10/16 17:40
 * @Version V1.0
 **/
public class B_Fram implements Fram {

    @Override
    public Animal newAnimal() {
        return new B_Animal();
    }

    @Override
    public Plant newPlant() {
        return new B_Plant();
    }
}

package com.lra.designlearn.structuralType.builder;


/**
 * @Description
 * @Author Anglar
 * @Date 2019/10/16 17:56
 * @Version V1.0
 **/
public class ABuilder extends Builder {

    @Override
    public void buildP1() {
        super.getProduct().setP1("P1");
    }

    @Override
    public void buildP2() {
        super.getProduct().setP2("P2");
    }

    @Override
    public void buildP3() {
        super.getProduct().setP3("P3");
    }
}

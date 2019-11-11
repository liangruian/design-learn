package com.lra.designlearn.structuralType.builder;

import lombok.Data;

/**
 * @Description
 * @Author Anglar
 * @Date 2019/10/16 17:58
 * @Version V1.0
 **/
@Data
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product construct(){
        builder.buildP1();
        builder.buildP2();
        builder.buildP3();
        return builder.getProduct();
    }
}

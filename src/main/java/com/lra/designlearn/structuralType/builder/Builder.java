package com.lra.designlearn.structuralType.builder;

import lombok.Data;

/**
 * @Description
 * @Author Anglar
 * @Date 2019/10/16 17:55
 * @Version V1.0
 **/
@Data
public abstract class Builder {
    private Product product;

    public abstract void buildP1();

    public abstract void buildP2();

    public abstract void buildP3();

}

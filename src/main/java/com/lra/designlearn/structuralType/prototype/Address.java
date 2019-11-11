package com.lra.designlearn.structuralType.prototype;

import lombok.Data;

/**
 * @Description
 * @Author Anglar
 * @Date 2019/10/16 17:05
 * @Version V1.0
 **/
@Data
public class Address implements Cloneable{

    private String addressName;

    private City city;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

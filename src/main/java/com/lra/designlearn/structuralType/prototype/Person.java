package com.lra.designlearn.structuralType.prototype;

import lombok.Data;

/**
 * @Description
 * @Author Anglar
 * @Date 2019/10/16 17:04
 * @Version V1.0
 **/
@Data
public class Person {

    private String name;

    private Address address;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person person = (Person) super.clone();
        Address addr= (Address)address.clone();
        person.setAddress(addr);
        return person;
    }
}

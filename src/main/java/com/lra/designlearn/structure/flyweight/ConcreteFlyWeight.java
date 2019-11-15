package com.lra.designlearn.structure.flyweight;

import lombok.Data;

/**
 * @Description
 * @Author Anglar
 * @Date 2019/11/12 8:58
 * @Version V1.0
 * 具体享元
 **/
@Data
public class ConcreteFlyWeight implements Flyweight {

    private String key;

    public ConcreteFlyWeight(String key) {
        this.key = key;
        System.out.println("具体享元"+getKey()+"被创建");
    }

    @Override
    public void operation(UnsharedConcreteFlyweight unsharedConcreteFlyweight) {
        System.out.println("具体享元"+getKey()+"被调用");
        System.out.println("非享元信息："+unsharedConcreteFlyweight.getInfo());
    }
}

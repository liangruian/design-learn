package com.lra.designlearn.structure.bridge;

/**
 * @Description
 * @Author Anglar
 * @Date 2019/11/11 13:27
 * @Version V1.0
 * 抽象扩展类
 **/
public abstract class Abstrarsf {

    protected Implementor implementor;

    protected Abstrarsf(Implementor implementor) {
        this.implementor = implementor;
    }

    protected abstract void op();

}

package com.lra.designlearn.structure.bridge;

/**
 * @Description
 * @Author Anglar
 * @Date 2019/11/11 13:27
 * @Version V1.0
 * 具体扩展类
 **/
public class RefiAbs extends Abstrarsf {

    public RefiAbs(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void op() {
        System.out.println("ref");
        implementor.show();
    }
}

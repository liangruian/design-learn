package com.lra.designlearn.structure.decorator;

/**
 * @Description
 * @Author Anglar
 * @Date 2019/11/11 15:32
 * @Version V1.0
 * 具体组件类
 **/
public class ConreterComponent implements Component {

    @Override
    public void operation() {
        System.out.println("组件");
    }

}

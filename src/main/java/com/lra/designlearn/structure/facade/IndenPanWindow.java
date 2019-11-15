package com.lra.designlearn.structure.facade;

/**
 * @Description
 * @Author Anglar
 * @Date 2019/11/11 16:53
 * @Version V1.0
 **/
public class IndenPanWindow {

    private Deparment1 deparment1 = new Deparment1();
    private Deparment2 deparment2 = new Deparment2();
    private Deparment3 deparment3 = new Deparment3();

    public void indexPan(){
        deparment1.show1();
        deparment2.show2();
        deparment3.show3();
    }

}

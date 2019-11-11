package com.lra.designlearn.structuralType.singleton;

/**
 * @Description
 * @Author Anglar
 * @Date 2019/10/16 16:52
 * @Version V1.0
 **/
public class Singleton {

    private Singleton(){}

    private static class Single{
        private static final Singleton singleton = new Singleton();
    }

    public static Singleton getInstance(){
        return Single.singleton;
    }
}

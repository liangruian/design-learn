package com.lra.designlearn.structure.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Description
 * @Author Anglar
 * @Date 2019/11/11 10:50
 * @Version V1.0
 **/
public class CglibProxy implements MethodInterceptor {


    public Object newInstance(Object object){
        return Enhancer.create(object.getClass(), this);
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("befor");
        Object invoke = methodProxy.invokeSuper(o, objects);
        System.out.println("after");
        return invoke;
    }


    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();
        My o = (My)cglibProxy.newInstance(new My());
        o.play();
    }


}

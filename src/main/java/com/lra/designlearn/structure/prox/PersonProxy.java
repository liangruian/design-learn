package com.lra.designlearn.structure.prox;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description
 * @Author Anglar
 * @Date 2019/11/11 10:34
 * @Version V1.0
 **/
public class PersonProxy implements InvocationHandler {

    private Person person;

    public PersonProxy(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("之前");
        Object invoke = method.invoke(person, args);
        System.out.println("之后");
        return invoke;
    }

    public Person createProxy(){
        return (Person) Proxy.newProxyInstance(person.getClass().getClassLoader(),person.getClass().getInterfaces(),this);
    }


    public static void main(String[] args) {
        PersonProxy personProxy = new PersonProxy(new My());
        Person proxy = personProxy.createProxy();
        proxy.buy();
    }

}

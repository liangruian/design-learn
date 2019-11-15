package com.lra.designlearn.structure.flyweight;

import java.util.HashMap;

/**
 * @Description
 * @Author Anglar
 * @Date 2019/11/12 9:00
 * @Version V1.0
 * 享元工厂
 **/
public class FlyweightFactory {

    private HashMap<String, Flyweight> flyweightHashMap = new HashMap<>();

    public Flyweight getFlyWeight(String key) {
        Flyweight flyweight = flyweightHashMap.get(key);
        if (flyweight != null) {
            System.out.println("具体享元" + key + "已经存在，被成功获取！");
        } else {
            flyweight = new ConcreteFlyWeight(key);
            flyweightHashMap.put(key, flyweight);
        }
        return flyweight;
    }
}

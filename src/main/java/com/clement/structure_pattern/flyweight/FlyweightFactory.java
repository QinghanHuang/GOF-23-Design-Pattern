package com.clement.structure_pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Qinghan Huang
 * @Date 25/08/2023 22:03
 * @Desc
 * @Version 1.0
 */
public class FlyweightFactory {
    Map<String,Flyweight> map;

    public FlyweightFactory() {
        map=new HashMap<>();
    }
    public Flyweight getFlyweight(String key){
        if(map.containsKey(key)){
            return map.get(key);
        }else{
            Flyweight newInstance=new ConcreteFlyweight();
            map.put(key,newInstance);
            return newInstance;
        }
    }
}

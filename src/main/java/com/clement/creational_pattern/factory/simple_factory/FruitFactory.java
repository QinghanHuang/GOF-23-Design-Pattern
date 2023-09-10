package com.clement.creational_pattern.factory.simple_factory;

/**
 * @Author Qinghan Huang
 * @Date 24/08/2023 21:15
 * @Desc
 * @Version 1.0
 */
public class FruitFactory {
    public static Fruit getFruit(String fruitName){
        switch (fruitName) {
            case "apple":
                return new Apple();
            case "orange":
                return new Orange();
            default:
                return null;
        }
    }
}
abstract class Fruit{
}
class Apple extends Fruit{

}
class Orange extends Fruit{

}

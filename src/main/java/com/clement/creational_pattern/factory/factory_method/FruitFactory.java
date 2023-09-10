package com.clement.creational_pattern.factory.factory_method;

/**
 * @Author Qinghan Huang
 * @Date 24/08/2023 21:26
 * @Desc
 * @Version 1.0
 */
public abstract class FruitFactory<T extends Fruit> {
    public abstract T getFruit();
}

class AppleFactory extends FruitFactory<Apple>{
    @Override
    public Apple getFruit() {
        return new Apple();
    }
}
class OrangeFactory extends FruitFactory<Orange>{
    @Override
    public Orange getFruit() {
        return new Orange();
    }
}

abstract class Fruit{
}
class Apple extends Fruit {
}
class Orange extends Fruit {
}

package com.clement.structure_pattern.decorator;

public class Decorator implements Function {
    private final Function component;

    public Decorator(Function component) {
        this.component = component;
    }

    @Override
    public void operation() {
        this.before();
        component.operation();
        this.after();
    }
    private void before(){
        System.out.println("Before function");
    }
    private void after(){
        System.out.println("After function");
    }

}

package com.clement.behavioral_pattern.strategy;

/**
 * @Author Qinghan Huang
 * @Date 29/08/2023 16:15
 * @Desc
 * @Version 1.0
 */
public class Sorter {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void sort(Integer[] arr){
        strategy.sort(arr);
    }
}

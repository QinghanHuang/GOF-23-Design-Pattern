package com.clement.behavioral_pattern.strategy;

import java.util.Arrays;

/**
 * @Author Qinghan Huang
 * @Date 29/08/2023 15:46
 * @Desc
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Integer [] arr={1,3,2,6,3,6,7,4,2,2};
        Sorter sorter = new Sorter();
        sorter.setStrategy(Strategy.IN_SINGLE);
        sorter.sort(arr);
        System.out.println(Arrays.toString(arr));

        sorter.setStrategy(Strategy.DE_SINGLE);
        sorter.sort(arr);
        System.out.println(Arrays.toString(arr));

        sorter.setStrategy(Strategy.PARALLEL);
        sorter.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

package com.clement.behavioral_pattern.strategy;

import java.util.Arrays;

public interface Strategy {

    public static final Strategy IN_SINGLE = Arrays::sort;   //单线程排序方案
    public static final Strategy DE_SINGLE = (array)->{
        Arrays.sort(array,(a, b)->{
            return Integer.compare(b,a);
        });
    };  //单线程排序方案
    public static final  Strategy PARALLEL = Arrays::parallelSort;   //并行排序方案

    public abstract void  sort(Integer[] array);

}

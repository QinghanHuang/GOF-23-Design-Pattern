package com.clement.structure_pattern.adapter.class_adapter;

/**
 * @Author Qinghan Huang
 * @Date 25/08/2023 17:07
 * @Desc
 * @Version 1.0
 */
public class Adapter extends OldFunction implements Target{
    @Override
    public void request() {
        oldRequest();
    }
}

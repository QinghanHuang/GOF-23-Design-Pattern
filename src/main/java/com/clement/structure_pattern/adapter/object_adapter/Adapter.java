package com.clement.structure_pattern.adapter.object_adapter;

/**
 * @Author Qinghan Huang
 * @Date 25/08/2023 17:07
 * @Desc
 * @Version 1.0
 */
public class Adapter extends  Target {
    OldFunction oldFunction=new OldFunction();

    @Override
    public void request() {
        oldFunction.oldRequest();
    }
}

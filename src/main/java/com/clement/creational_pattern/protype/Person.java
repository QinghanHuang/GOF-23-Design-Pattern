package com.clement.creational_pattern.protype;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Qinghan Huang
 * @Date 24/08/2023 23:41
 * @Desc
 * @Version 1.0
 */
class Person implements Cloneable {
    private String name;
    private List<String> hobbies;

    public Person(String name, List<String> hobbies) {
        this.name = name;
        this.hobbies = hobbies;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Person cloned = (Person) super.clone();
        cloned.hobbies = new ArrayList<>(this.hobbies); // 创建新的ArrayList来复制hobbies属性
        return cloned;
    }
}

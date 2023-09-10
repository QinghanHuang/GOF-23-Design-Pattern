package com.clement.behavioral_pattern.observer.self;

/**
 * @Author Qinghan Huang
 * @Date 29/08/2023 17:22
 * @Desc
 * @Version 1.0
 */
public class TechFans implements NewsObserver{
    private final String name;

    public TechFans(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name+"get news: "+news);

    }
}

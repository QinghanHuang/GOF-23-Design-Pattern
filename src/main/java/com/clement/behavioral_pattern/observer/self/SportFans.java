package com.clement.behavioral_pattern.observer.self;

/**
 * @Author Qinghan Huang
 * @Date 29/08/2023 17:20
 * @Desc
 * @Version 1.0
 */
public class SportFans implements NewsObserver{
    private final String name;

    public SportFans(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name+"get news: "+news);

    }
}

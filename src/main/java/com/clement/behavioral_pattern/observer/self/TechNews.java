package com.clement.behavioral_pattern.observer.self;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author Qinghan Huang
 * @Date 29/08/2023 17:19
 * @Desc
 * @Version 1.0
 */
public class TechNews implements News{
    Set<NewsObserver> techNewsObservers=new HashSet<>();
    @Override
    public void addObserver(NewsObserver observer) {
        techNewsObservers.add(observer);
    }

    @Override
    public void removeObserver(NewsObserver observer) {
        techNewsObservers.remove(observer);
    }

    @Override
    public void notifyObservers(String news) {
        techNewsObservers.forEach((obs)->{
            obs.update(news);
        });
    }

    @Override
    public void publishNews(String news) {
        notifyObservers(news);
    }
}

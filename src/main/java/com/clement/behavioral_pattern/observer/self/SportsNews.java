package com.clement.behavioral_pattern.observer.self;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author Qinghan Huang
 * @Date 29/08/2023 17:15
 * @Desc
 * @Version 1.0
 */
public class SportsNews implements News{
    Set<NewsObserver> sportNewsObservers=new HashSet<>();
    @Override
    public void addObserver(NewsObserver observer) {
        sportNewsObservers.add(observer);
    }

    @Override
    public void removeObserver(NewsObserver observer) {
        sportNewsObservers.remove(observer);
    }

    @Override
    public void notifyObservers(String news) {
        sportNewsObservers.forEach((obs)->{
            obs.update(news);
        });
    }

    @Override
    public void publishNews(String news) {
        notifyObservers(news);
    }
}

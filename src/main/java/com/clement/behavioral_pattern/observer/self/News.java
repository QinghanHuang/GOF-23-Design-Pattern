package com.clement.behavioral_pattern.observer.self;

public interface News {
    void addObserver(NewsObserver observer);
    void removeObserver(NewsObserver observer);
    void notifyObservers(String news);
    void publishNews(String news);
}

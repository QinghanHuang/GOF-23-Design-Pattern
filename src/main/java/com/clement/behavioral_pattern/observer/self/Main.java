package com.clement.behavioral_pattern.observer.self;

/**
 * @Author Qinghan Huang
 * @Date 29/08/2023 17:22
 * @Desc
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        SportsNews sportsNews = new SportsNews();
        sportsNews.addObserver(new SportFans("sport fan1"));
        sportsNews.addObserver(new SportFans("sport fan2"));
        TechNews techNews = new TechNews();
        techNews.addObserver(new TechFans("tech fan"));

        sportsNews.publishNews("New Football Championship Announced!");
        sportsNews.publishNews("Breaking: Tennis Match Postponed!");
        techNews.publishNews("New Smartphone Released!");

    }
}

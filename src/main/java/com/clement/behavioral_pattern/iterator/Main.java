package com.clement.behavioral_pattern.iterator;

/**
 * @Author Qinghan Huang
 * @Date 28/08/2023 17:37
 * @Desc
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        String[] arr={"qqq","www","eee"};
        ArrayCollection<String> collection = ArrayCollection.of(arr);

        for(String s:collection){
            System.out.println(s);
        }

    }
}

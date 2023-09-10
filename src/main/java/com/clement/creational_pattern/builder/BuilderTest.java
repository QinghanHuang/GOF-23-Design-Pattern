package com.clement.creational_pattern.builder;

/**
 * @Author Qinghan Huang
 * @Date 24/08/2023 22:15
 * @Desc
 * @Version 1.0
 */
public class BuilderTest {
    public static void main(String[] args) {
        Student.StudentBuilder studentBuilder = new Student.StudentBuilder();
        Student student = studentBuilder.id(1).age(2).build();
    }
}

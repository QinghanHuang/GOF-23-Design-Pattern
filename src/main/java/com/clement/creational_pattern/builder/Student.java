package com.clement.creational_pattern.builder;

/**
 * @Author Qinghan Huang
 * @Date 24/08/2023 22:12
 * @Desc
 * @Version 1.0
 */
public class Student {
    int id;
    int age;
    int grade;
    String name;
    String college;
    String profession;

    private Student(int id, int age, int grade, String name, String college, String profession) {
        this.id = id;
        this.age = age;
        this.grade = grade;
        this.name = name;
        this.college = college;
        this.profession = profession;
    }
    public static class StudentBuilder{
        int id;
        int age;
        int grade;
        String name;
        String college;
        String profession;
        public StudentBuilder id(int id){
            this.id = id;
            return this;   //为了支持链式调用，这里直接返回建造者本身，下同
        }

        public StudentBuilder age(int age){
            this.age = age;
            return this;
        }
        public Student build(){    //最后我们只需要调用建造者提供的build方法即可根据我们的配置返回一个对象
            return new Student(id, age, grade, name, college, profession);
        }

    }

}

package com.itstep.lesson._13.incapsulation;

public class Person {

    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(final String name) {
        this.name = name;
    }

}

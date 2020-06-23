package com.itstep.lesson._6;

public class Car {

    static int wheels = 4;
    int year;
    String name;
    Human owner;

    public Car(int year, String name, Human owner) {
        this.year = year;
        this.name = name;
        this.owner = owner;
    }

    public void drive(){
        System.out.println(owner.name + " is driving a " + name + " of " + year + " production year");
    }

}

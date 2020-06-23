package com.itstep.lesson._8.enum_interfaces;

public class Crocodile implements Animal, Reptile {

    public void animalSound() {
        System.out.println("Crock Crock");
    }

    public void sleep() {
        System.out.println("ZZZ");
    }

    public void swim() {
        System.out.println("Swimming...");
    }

}

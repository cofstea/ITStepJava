package com.itstep.lesson._8.enum_interfaces;

// Pig "implements" the Animal interface
public class Pig implements Animal {

    @Override
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }

    @Override
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }

}


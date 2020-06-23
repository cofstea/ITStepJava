package com.itstep.lesson._13.polymorphism;

public class Dog extends Animal {

    @Override
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

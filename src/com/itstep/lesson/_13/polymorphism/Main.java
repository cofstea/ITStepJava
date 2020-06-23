package com.itstep.lesson._13.polymorphism;

public class Main {

    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create a Animal object
        Pig myPig = new Pig();  // Create a Pig object
        Dog myDog = new Dog();  // Create a Dog object

        myAnimal.animalSound();//The animal makes a sound
        myPig.animalSound();//The pig says: wee wee
        myDog.animalSound();//The dog says: bow wow4
    }
}

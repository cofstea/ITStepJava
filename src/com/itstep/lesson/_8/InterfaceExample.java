package com.itstep.lesson._8;

import com.itstep.lesson._8.enum_interfaces.Animal;
import com.itstep.lesson._8.enum_interfaces.Crocodile;
import com.itstep.lesson._8.enum_interfaces.Pig;

public class InterfaceExample {

    public static void main(String[] args) {
        Animal myPig = new Pig();  // Create a Pig object
        myPig.animalSound();
        myPig.sleep();

        Crocodile croco = new Crocodile();
        croco.animalSound();
        croco.sleep();
        croco.swim();
    }

}


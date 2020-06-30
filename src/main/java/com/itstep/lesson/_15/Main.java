package com.itstep.lesson._15;

import com.itstep.lesson._17.MySingleObject;

public class Main {

    private static void checkAgeForDrink(int age) {
        if (age < 18) {
            throw new PubLegalAgeException("You are not allowed to drink yet");
        } else {
            System.out.println("What would you like to drink?");
        }
    }

    public static void main(String[] args) {
        MySingleObject mySingleObject = MySingleObject.getInstance();
        mySingleObject.saySomething();

        MySingleObject.getInstance().saySomething();
    }

}

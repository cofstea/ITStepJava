package com.itstep.lesson._13.incapsulation;

public class MyClass {

    public static void main(String[] args) {
        Person myObj = new Person();
        myObj.setName("John"); // Set the value of the name variable to "John"
        System.out.println(myObj.getName());
    }
}// Outputs "John"
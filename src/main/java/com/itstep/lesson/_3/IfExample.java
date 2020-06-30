package com.itstep.lesson._3;

public class IfExample {

    public static void main(String[] args) {
        // int time = -3;

        // if (time < 10 && time > 0) {
        //     System.out.println("Good morning.");
        // }
        // if (time < 20) {
        //     System.out.println("Good day.");
        // } else {
        //     System.out.println("Good evening.");
        // }

        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

    }

}


package com.itstep.lesson._13;

import java.io.IOException;

import com.itstep.lesson._13.inheritance.Vehicle;

public class Main {

    public static void main(String[] args)  {
        Vehicle myCar = new Vehicle("BMW");
        try {
            myCar.honk();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(myCar);
        //
        // Sedan sedan = new Sedan();
    }

}

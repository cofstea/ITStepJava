package com.itstep.lesson._8;

import com.itstep.lesson._8.Car.Color;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Laura", Color.BLUE);
        car1.info();

        Car car2 = new Car("Alexandru", Color.BLACK);
        car2.info();

        Color.displayColorsAssortment();
    }

}

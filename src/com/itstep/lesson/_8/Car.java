package com.itstep.lesson._8;

public class Car {

    String ownerName;
    Color color;

    public Car(final String ownerName, final Color color) {
        this.ownerName = ownerName;
        this.color = color;
    }

    public void info(){
        System.out.println(ownerName + " ows a car of collor" + color);
    }


    enum Color {
        WHITE,
        BLUE,
        BLACK,
        RED;

        public static void displayColorsAssortment(){
            for (int i = 0; i < Color.values().length;i++){
                System.out.println(Color.values()[i]);
            }
        }
    }
}

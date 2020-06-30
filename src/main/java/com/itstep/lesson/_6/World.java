package com.itstep.lesson._6;

public class World {

    public static void main(String[] args) {
        Human human1 = new Human("Daniel", "Brown", 180);
        human1.age = 18;

        human1.eyeColor = "Green";
        human1.speak();

        Car car1 = new Car(2015, "Volvo", human1);

        car1.drive();

    }

}

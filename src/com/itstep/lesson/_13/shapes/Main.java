package com.itstep.lesson._13.shapes;

public class Main {

    public static void main(String[] args) {

        Square square = new Square("Square", 3.2);
        System.out.println(square);

        Circle circle = new Circle("Circle", 11);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle("Rectangle", 5,3);
        System.out.println(rectangle);
    }

}

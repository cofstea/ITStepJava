package com.itstep.lesson._13.shapes;

public abstract class Shape implements InterfaceShape {

    protected String name;

    public Shape(final String name) {
        this.name = name;
    }

    public String getInformation() {
        return " \n The " + name + " perimeter is: " + getPerimeter() +
                " \n The " + name + " area is: " + getArea();
    }

    public String getName() {
        return name;
    }

}

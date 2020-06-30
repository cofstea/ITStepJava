package com.itstep.lesson._13.inheritance;

import java.io.IOException;

public class Vehicle {

    protected String brand; // Vehicle attribute

    private String message;

    public Vehicle(final String brand) {
        this.brand = brand;
        // this.message = "Tuu Tuu";
    }

    public void honk() throws IOException {  // Vehicle method
        if (message != null) {
            System.out.println(message);
        } else {
            throw new IOException("Current vehicle cannot honk");
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(final String brand) {
        this.brand = brand;
    }

}
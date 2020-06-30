package com.itstep.lesson._9.homework;

public class Address { // class of type Address

    // Attributes / Class properties
    public String country;

    public String city;

    public String street;

    // Constructor / Instruction
    public Address(String countryInput, String city, String street) {
        this.country = countryInput;
        this.city = city;
        this.street = street;
    }

    //Methods
    public String getFullAddress() { //return String type with no parameters
        return "Address:" + street + ", " + city + ", " + country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }

}

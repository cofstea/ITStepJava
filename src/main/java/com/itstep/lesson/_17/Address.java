package com.itstep.lesson._17;

public class Address implements Comparable<Address> {

    private String street;

    private int houseNumber;

    private String city;

    private String country;

    public Address(final String street, final int houseNumber, final String city, final String country) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.city = city;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(final String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(final int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                "}\n";
    }

    @Override
    public int compareTo(final Address anotherAddress) {
        return this.street.length() - anotherAddress.street.length();
    }

}

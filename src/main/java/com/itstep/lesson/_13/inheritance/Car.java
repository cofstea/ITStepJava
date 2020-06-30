package com.itstep.lesson._13.inheritance;

public class Car extends Vehicle {

    protected int hp;

    public Car(final int hp, String brand) {
        super(brand);
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(final int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Car{" +
                "hp=" + hp +
                ", brand='" + brand + '\'' +
                '}';
    }

}

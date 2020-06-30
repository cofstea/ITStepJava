package com.itstep.lesson._13.inheritance;

public class Sedan extends Car {

    private int seats = 4;

    public Sedan(final int hp, final String brand) {
        super(hp, brand);
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(final int seats) {
        this.seats = seats;
    }

    @Override
    public int getHp() {
        return super.getHp() - 5;
    }

}

package com.itstep.lesson._17;

public class MySingleObject {

    private static MySingleObject INSTANCE;

    private MySingleObject() {

    }

    public void saySomething() {
        System.out.println("dsdfdsfdsf");
    }

    public static MySingleObject getInstance() {

        if (INSTANCE == null) {
            INSTANCE = new MySingleObject();
        }
        return INSTANCE;

    }

}

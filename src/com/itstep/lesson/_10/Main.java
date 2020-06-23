package com.itstep.lesson._10;

import com.itstep.lesson._9.homework.Item;
import com.itstep.lesson._9.homework.Type;

public class Main {

    public static void main(String[] args) {
        String s = "Hello";

        String ss = "Hello";

        Item first = new Item("First", Type.GADGETS);
        Item second = new Item("First", Type.GADGETS);

        System.out.println(first.equals(second));
    }
}

package com.itstep.lesson._7;

import java.util.Random;

public class RandomExample {

    public static void main(String[] args) {
        Random random = new Random();

        System.out.println(random.nextInt());
        System.out.println(random.nextInt(5));
        System.out.println(random.nextLong());
        System.out.println(random.nextDouble());
        System.out.println(random.nextBoolean());

        System.out.println(random.nextInt(100) + random.nextDouble());

        // System.out.println(BigDecimal.valueOf(22.323652).setScale(4, RoundingMode.HALF_UP));
    }

}

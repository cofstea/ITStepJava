package com.itstep.lesson._2;

public class MainSecond {

    public static void main(String[] args) {
        byte byteNum = 127;
        short shortNum = 128;
        int integer = 400000000;
        long longNum = 9999999999L;
        double doubleNum = 5555555555554324234.55555555507777777777737437437437438743;
        float floatNum = 555555555555.555555555f;

        byte bMax = 127;
        // bMax = bMax * 2; //Explicit conversion error
        bMax++;// -128 -127 -126 .....0 1 2 ... 126 127
        // + 126
        System.out.println(bMax);//implicit conversion overflow

        short maxValue = 255;
        byte bb = (byte) maxValue;
        System.out.println(bb); //Example of overflow in explicit conversion:

        double df = 1.2222d;
        int dfi = (int) df;
        double d33 = 2.8888d;
        int d33i = (int) d33;
        double d45 = 1.3333d;
        int d45i = (int) d45;

        System.out.printf("%.2f \n", df + d33 + d45);
        System.out.println(dfi + d33i + d45i);
    }

}

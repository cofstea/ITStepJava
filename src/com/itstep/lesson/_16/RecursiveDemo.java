package com.itstep.lesson._16;

public class RecursiveDemo {

    public static void main(String[] args) {
        // System.out.println(getSumFromZeroToNumber(3));

        String str = "Welcome to Beginnersbook";
        String reversed = reverseString(str);
        System.out.println("The reversed string is: " + reversed);
    }



    /*
     * Given a number, return the sum from zero to indicated number
     * */
    private static int getSumFromZeroToNumber(int number) {
        if (number > 0) {
            return number + getSumFromZeroToNumber(number - 1);
        } else {
            return 0;
        }
    }

    public static String reverseString(String str)
    {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverseString(str.substring(1)) + str.charAt(0);
    }

}
